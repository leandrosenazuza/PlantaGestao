package br.com.leandrosenazua.GerenciamentoPlanta.Dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.UUID;

public class PlantaDto {

    @NotBlank
    private UUID id;
    @NotBlank
    private String nomePlanta;
    @NotBlank
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
