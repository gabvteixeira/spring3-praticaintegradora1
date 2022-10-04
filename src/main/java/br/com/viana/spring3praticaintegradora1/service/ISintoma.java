package br.com.viana.spring3praticaintegradora1.service;

import br.com.viana.spring3praticaintegradora1.entity.Sintoma;

import java.util.List;

public interface ISintoma {
    List<Sintoma> getSymptoms();
    Sintoma getSymptomByName(String name);
}
