package br.com.viana.spring3praticaintegradora1.service;

import br.com.viana.spring3praticaintegradora1.entity.Pessoa;
import br.com.viana.spring3praticaintegradora1.entity.Sintoma;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PessoaService implements  IPessoa {

    List<Pessoa> pessoas = new ArrayList<>(){
        {
            add(new Pessoa(1,20,"Gabriel", "Viana", new Sintoma(2,"Febre", "Media")));
            add(new Pessoa(2,60,"Francisco", "Viana", new Sintoma(3,"Falta de Ar", "Alta")));
            add(new Pessoa(3,75,"Manoel", "Viana",null));

        }
    };

    @Override
    public List<Pessoa> getPessoasRisco() {
        return this.pessoas.stream()
                .filter(p -> p.getIdade() >= 60 && p.getSintoma() != null)
                .collect(Collectors.toList());
    }
}
