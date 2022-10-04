package br.com.viana.spring3praticaintegradora1.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pessoa {
    private int id, idade;
    private String nome, sobrenome;
    private Sintoma sintoma;
}
