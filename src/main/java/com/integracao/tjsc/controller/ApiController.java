package com.integracao.tjsc.controller;

import com.integracao.tjsc.business.EntidadeBusiness;
import com.integracao.tjsc.dao.EntidadeDao;
import com.integracao.tjsc.dao.EntidadePaginatioRepository;
import com.integracao.tjsc.model.Entidade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/main")
public class ApiController {

    @Autowired
    EntidadeBusiness entidadeBusiness;

    @Autowired
    private EntidadePaginatioRepository entidadePaginatioRepository;

    @Autowired
    EntidadeDao entidadeDao;


    // Lista paginada filtrada por codigo
    @GetMapping("/lista-por-codigo")
    public ResponseEntity<Map<String, Object>> paginationPorCodigo(
            @RequestParam(required = false) String codigo,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "3") int size
    ) {

        try {
            List<Entidade> entidades;
            Pageable paging = PageRequest.of(page, size);

            Page<Entidade> pageTuts;
            if (codigo == null)
                pageTuts = entidadePaginatioRepository.findAll(paging);
            else
                pageTuts = entidadePaginatioRepository.findByCodigo(codigo, paging);

            entidades = pageTuts.getContent();

            Map<String, Object> response = new HashMap<>();
            response.put("entidades", entidades);
            response.put("pagina atual", pageTuts.getNumber());
            response.put("total itens", pageTuts.getTotalElements());
            response.put("total paginas", pageTuts.getTotalPages());

            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Lista paginada filtrada por nome
    @GetMapping("/lista-por-nome")
    public ResponseEntity<Map<String, Object>> paginationPorNome(
            @RequestParam(required = false) String nome,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "3") int size
    ) {

        try {
            List<Entidade> entidades;
            Pageable paging = PageRequest.of(page, size);

            Page<Entidade> pageTuts;
            if (nome == null)
                pageTuts = entidadePaginatioRepository.findAll(paging);
            else
                pageTuts = entidadePaginatioRepository.findByNome(nome, paging);

            entidades = pageTuts.getContent();

            Map<String, Object> response = new HashMap<>();
            response.put("entidades", entidades);
            response.put("pagina atual", pageTuts.getNumber());
            response.put("total itens", pageTuts.getTotalElements());
            response.put("total paginas", pageTuts.getTotalPages());

            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    // Lista paginada geral
    @GetMapping("/lista-todos")
    public ResponseEntity<Map<String, Object>> paginationPorTodos(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "3") int size
    ) {

        try {
            List<Entidade> entidades;
            Pageable paging = PageRequest.of(page, size);
            Page<Entidade>  pageTuts = entidadePaginatioRepository.findAll(paging);
            entidades = pageTuts.getContent();
            Map<String, Object> response = new HashMap<>();
            response.put("entidades", entidades);
            response.put("pagina atual", pageTuts.getNumber());
            response.put("total itens", pageTuts.getTotalElements());
            response.put("total paginas", pageTuts.getTotalPages());
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
