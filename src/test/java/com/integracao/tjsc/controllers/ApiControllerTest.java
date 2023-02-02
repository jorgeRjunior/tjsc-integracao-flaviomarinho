package com.integracao.tjsc.controllers;

import com.integracao.tjsc.business.EntidadeBusiness;
import com.integracao.tjsc.model.Entidade;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class ApiControllerTest {


    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private EntidadeBusiness entidadeBusiness;


    @Test
    void apiController_lista_por_codigo() throws Exception {
        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
        params.add("codigo","123");
        params.add("page", "2");
        params.add("size", "5");
        this.mockMvc.perform(get("/api/main/lista-por-codigo").params(params))
                .andExpect(status().isOk());
    }

    @Test
    void apiController_lista_por_nome() throws Exception {
        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
        params.add("nome","ASSOCIAÇÃO DE PAIS E AMIGOS DOS EXCEPCIONAIS (APAE)");
        params.add("page", "1");
        params.add("size", "10");
        this.mockMvc.perform(get("/api/main/lista-por-nome").params(params))
                .andExpect(status().isOk());
    }

    @Test
    void apiController_lista_todos() throws Exception {
        Mockito.when(entidadeBusiness.retornaLista()).thenReturn(List.of(new Entidade()));
        this.mockMvc.perform(get("/api/main/lista-todos"))
                .andExpect(status().isOk());
    }

}
