package br.com.viana.spring3praticaintegradora1.controller;

import br.com.viana.spring3praticaintegradora1.dto.PessoaRiscoDTO;
import br.com.viana.spring3praticaintegradora1.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pessoas/")
public class PessoaController {

    @Autowired
    private PessoaService service;

    @GetMapping("/findriskperson/")
    public ResponseEntity<List<PessoaRiscoDTO>> getPessoasRisco(){
        List <PessoaRiscoDTO> pessoas = service.getPessoasRisco()
                .stream()
                .map(p -> new PessoaRiscoDTO(p, p.getSintoma()))
                .collect(Collectors.toList());

        return new ResponseEntity<>(pessoas, HttpStatus.OK);
    }

}
