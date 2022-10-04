package br.com.viana.spring3praticaintegradora1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sintoma {
    private int codigo;
    private String nome, nivelDeGravidade;
}
