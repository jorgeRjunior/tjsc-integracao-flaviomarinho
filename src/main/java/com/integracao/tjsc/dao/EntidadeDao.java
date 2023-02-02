package com.integracao.tjsc.dao;

import com.integracao.tjsc.model.Entidade;
import java.util.List;

public interface EntidadeDao {

    public abstract void salvarEntidade(Entidade entidade);
    public abstract void delete();
    public abstract List <Entidade> retornaLista();

}
