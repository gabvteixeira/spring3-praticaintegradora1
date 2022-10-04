package br.com.viana.spring3praticaintegradora1.controller;


import br.com.viana.spring3praticaintegradora1.dto.SintomaDTO;
import br.com.viana.spring3praticaintegradora1.entity.Sintoma;
import br.com.viana.spring3praticaintegradora1.service.ISintoma;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sintomas/")
public class SintomaController {

    @Autowired
    private ISintoma service;

    @GetMapping("/findSymptom")
    public ResponseEntity<List<Sintoma>> getSymptoms() {
        List <Sintoma> sintomas = service.getSymptoms();

        return new ResponseEntity<>(sintomas, HttpStatus.OK);
    }

    @GetMapping("/findSymptom/{name}")
    public ResponseEntity<SintomaDTO> getSymptoms(@PathVariable String name) {
        Sintoma sintoma = service.getSymptomByName(name);

        return new ResponseEntity<>(new SintomaDTO(sintoma), HttpStatus.OK);
    }
}
