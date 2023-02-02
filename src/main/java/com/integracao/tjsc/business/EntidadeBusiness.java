package com.integracao.tjsc.business;

import com.integracao.tjsc.dao.EntidadeDao;
import com.integracao.tjsc.model.Entidade;
import com.integracao.tjsc.service.Exception_Exception;
import com.integracao.tjsc.service.SeloService_Service;
import com.sun.xml.ws.client.ClientTransportException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class EntidadeBusiness {

    @Autowired
    EntidadeDao entidadeDao;

    protected SeloService_Service getWs() throws MalformedURLException {
        return new SeloService_Service();
    }

    public List getEntidades() throws Exception {
        try {
            return getWs().getSeloServicePort().getEntesDeclaradosUtilidadePublicaEstadual().stream().map(e -> {
                return new HashMap<String, Object>() {{
                    put("id", e.getCdentepub());
                    put("nome", e.getNomeEntidade());
                    put("lei", e.getLei());
                }};
            }).collect(Collectors.toList());
        } catch (ClientTransportException | Exception_Exception e) {
            e.printStackTrace();
            throw new Exception("Erro de comunicação");
        }
    }

    public List salvarEntesDeclaradosUtilidadePublica() throws Exception {
        entidadeDao.delete();
        try {
            return getWs().getSeloServicePort().getEntesDeclaradosUtilidadePublicaEstadual().stream().map(e -> {
                String uuid = UUID.randomUUID().toString();
                Entidade entidade = new Entidade() {{
                    setId(uuid);
                    setCodigo(e.getCdentepub());
                    setLei(e.getLei());
                    setNome(e.getNomeEntidade());
                }};
                entidadeDao.salvarEntidade(entidade);
                return entidade;

            }).collect(Collectors.toList());
        } catch (ClientTransportException | Exception_Exception e) {
            e.printStackTrace();
            throw new Exception("Erro de comunicação");
        }
    }


}
