package br.com.viana.spring3praticaintegradora1.dto;

import br.com.viana.spring3praticaintegradora1.entity.Pessoa;
import br.com.viana.spring3praticaintegradora1.entity.Sintoma;
import lombok.Data;

@Data
public class PessoaRiscoDTO {
    private String nome, sobrenome;
    private int idade;
    private String nomeSintoma, nivelDeGravidade;

    public PessoaRiscoDTO(Pessoa p, Sintoma s){
        this.nome = p.getNome();
        this.sobrenome = p.getSobrenome();
        this.idade = p.getIdade();
        this.nomeSintoma = s.getNome();
        this.nivelDeGravidade= s.getNivelDeGravidade();
    }
}
