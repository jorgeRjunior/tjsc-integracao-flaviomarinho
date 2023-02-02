package com.integracao.tjsc.dao;

import com.integracao.tjsc.model.Entidade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class EntidadeDaoImpl implements EntidadeDao{



    @Autowired
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void salvarEntidade(Entidade entidade) {
        String SQL = "INSERT INTO entidade(nome ,lei,codigo,id) VALUES (?,?,?,?)";
        int update = getJdbcTemplate().update(SQL, entidade.getNome(),entidade.getLei(),entidade.getCodigo(),entidade.getId());
        if(update == 1) {
            System.out.println("Entidade criada");
        }
    }

    @Override
    public void delete() {
        String SQL = "DELETE FROM entidade";
        int update = getJdbcTemplate().update(SQL);
        if(update == 1) {
            System.out.println("Registros apagados");
        }
    }

    @Override
    public List retornaLista() {
        String SQL = "SELECT * FROM entidade";
        List<Map<String, Object>> maps = getJdbcTemplate().queryForList(SQL);
        return maps;
    }
}
