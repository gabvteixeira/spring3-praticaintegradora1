package br.com.viana.spring3praticaintegradora1.service;

import br.com.viana.spring3praticaintegradora1.entity.Sintoma;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SintomaService implements ISintoma {

    private List<Sintoma> sintomas = new ArrayList<>() {
        {
            add(new Sintoma(1,"Espirro", "Baixa"));
            add(new Sintoma(2,"Febre", "Media"));
            add(new Sintoma(3,"Falta de Ar", "Alta"));
        }
    };
    @Override
    public List<Sintoma> getSymptoms() {
        return this.sintomas;
    }

    @Override
    public Sintoma getSymptomByName(String name) {
        Optional<Sintoma> sintoma = this.sintomas.stream().
                filter((s) -> s.getNome().equalsIgnoreCase(name)).findFirst();

      // TODO: implementar disparo de excecao

        return sintoma.get();

    }
}
