package br.com.leandrosenazua.GerenciamentoPlanta.Repository;

import br.com.leandrosenazua.GerenciamentoPlanta.Model.PlantaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PlantaRepository extends JpaRepository<PlantaModel, UUID> {

}
