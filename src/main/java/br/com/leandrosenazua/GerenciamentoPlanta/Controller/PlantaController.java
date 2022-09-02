package br.com.leandrosenazua.GerenciamentoPlanta.Controller;

import br.com.leandrosenazua.GerenciamentoPlanta.Dto.PlantaDto;
import br.com.leandrosenazua.GerenciamentoPlanta.Model.PlantaModel;
import br.com.leandrosenazua.GerenciamentoPlanta.Service.PlantaService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

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
}
