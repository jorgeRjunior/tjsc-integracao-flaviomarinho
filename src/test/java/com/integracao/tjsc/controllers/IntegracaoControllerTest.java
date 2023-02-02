package com.integracao.tjsc.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class IntegracaoControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void integracaoController_teste() throws Exception {
        this.mockMvc.perform(get("/api/integracao/teste-conexao"))
                .andExpect(status().isOk());
    }

    @Test
    void integracaoController_salvar() throws Exception {
        this.mockMvc.perform(get("/api/integracao/salva-entidades"))
                .andExpect(status().isOk());
    }

}
