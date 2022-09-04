package br.com.leandrosenazua.GerenciamentoPlanta.Controller;

import br.com.leandrosenazua.GerenciamentoPlanta.Dto.PlantaDto;
import br.com.leandrosenazua.GerenciamentoPlanta.Model.PlantaModel;
import br.com.leandrosenazua.GerenciamentoPlanta.Service.PlantaService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/planta")
public class PlantaController {

    final PlantaService plantaService;

    //Ponto de injeção do serviço via construtor
    public PlantaController(PlantaService plantaService) {
        this.plantaService = plantaService;
    }

    @PostMapping
    public ResponseEntity<Object> savePlanta(@RequestBody PlantaDto plantaDto){
        var plantaModel = new PlantaModel();
        BeanUtils.copyProperties(plantaDto, plantaModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(plantaService.save(plantaModel));
    }

    @GetMapping
    public ResponseEntity<List<PlantaModel>> getAllPlantas(){
        return ResponseEntity.status(HttpStatus.OK).body(plantaService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getOnePlanta(@PathVariable (value = "id") UUID id){
        Optional<PlantaModel> plantaModelOptional = PlantaService.findId(id);
        if(!plantaModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Planta not found");
        }

        return ResponseEntity.status(HttpStatus.OK).body(plantaModelOptional.get());
    }

}
