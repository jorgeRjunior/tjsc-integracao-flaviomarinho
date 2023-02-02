package com.integracao.tjsc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Entidade {

    private String nome;
    private String lei;
    private Long codigo;
    private String id;
}
