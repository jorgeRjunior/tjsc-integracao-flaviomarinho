package com.integracao.tjsc.controller;

import com.integracao.tjsc.business.EntidadeBusiness;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/integracao")
public class IntegracaoController {


    @Autowired
    EntidadeBusiness entidadeBusiness;

    //Lista itens direto da integração
    @SneakyThrows
    @GetMapping("/entidades")
    public ResponseEntity<?> getEntesDeclaradosUtilidadePublica(){
        return ResponseEntity.ok()
                .body(entidadeBusiness.getEntidades());
    }

    //Salva itens importados no banco
    @SneakyThrows
    @GetMapping("/salva-entidades")
    public ResponseEntity<?> salvaEntesDeclaradosUtilidadePublica(){
        return ResponseEntity.ok()
                .body(entidadeBusiness.salvarEntesDeclaradosUtilidadePublica());
    }
}
