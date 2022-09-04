package br.com.leandrosenazua.GerenciamentoPlanta.Service;

import br.com.leandrosenazua.GerenciamentoPlanta.Model.PlantaModel;
import br.com.leandrosenazua.GerenciamentoPlanta.Repository.PlantaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.stereotype.Service;

import javax.persistence.metamodel.SingularAttribute;
import javax.swing.*;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

//O serviço é a camada intermediaria entre o controlador e o modelo
//Nele que estão contidas todas regras de negocio
@Service
public class PlantaService {

    //O autowired irá dizer para o spring que aqui serão necessários pontos de injeção
    @Autowired
    static PlantaRepository plantaRepository;

    public PlantaService(PlantaRepository parkingSpotRepository) {
        this.plantaRepository = parkingSpotRepository;
    }

    @Transactional
    public PlantaModel save(PlantaModel plantaModel) {
        return plantaRepository.save(plantaModel);
    }


    public static List<PlantaModel> findAll( ) {
        return plantaRepository.findAll();
    }

    public static Optional<PlantaModel> findId(UUID id) {
        return plantaRepository.findById(id);

    }

}
