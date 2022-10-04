package br.com.viana.spring3praticaintegradora1.dto;

import br.com.viana.spring3praticaintegradora1.entity.Sintoma;
import lombok.Data;

@Data
public class SintomaDTO {
    private String nivelDeGravidade;

    public SintomaDTO(Sintoma sintoma){
        this.nivelDeGravidade =  sintoma.getNivelDeGravidade();
    }

}
