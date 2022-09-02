package br.com.leandrosenazua.GerenciamentoPlanta.Model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "TB_PLANTA")
public class PlantaModel implements Serializable {
    private static final long serialPlantaUID = 1;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false, unique = false, length = 70)
    private String nomePlanta;
    @Column(nullable = false, unique = false, length = 70)
    private int setorCasa;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNomePlanta() {
        return nomePlanta;
    }

    public void setNomePlanta(String nomePlanta) {
        this.nomePlanta = nomePlanta;
    }

    public int getSetorCasa() {
        return setorCasa;
    }

    public void setSetorCasa(int setorCasa) {
        this.setorCasa = setorCasa;
    }
}
