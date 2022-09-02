package br.com.leandrosenazua.GerenciamentoPlanta.Service;

import br.com.leandrosenazua.GerenciamentoPlanta.Model.PlantaModel;
import br.com.leandrosenazua.GerenciamentoPlanta.Repository.PlantaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

//O serviço é a camada intermediaria entre o controlador e o modelo
//Nele que estão contidas todas regras de negocio
@Service
public class PlantaService {

    //O autowired irá dizer para o spring que aqui serão necessários pontos de injeção
    @Autowired
    PlantaRepository plantaRepository;

    @Transactional
    public PlantaModel save(PlantaModel plantaModel) {
        return plantaRepository.save(plantaModel);
    }
}
