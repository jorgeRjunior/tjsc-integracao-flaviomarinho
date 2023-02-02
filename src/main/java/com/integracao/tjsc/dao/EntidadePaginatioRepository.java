package com.integracao.tjsc.dao;

import com.integracao.tjsc.model.Entidade;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntidadePaginatioRepository extends PagingAndSortingRepository<Entidade, String> {

    Page<Entidade> findByNome(String nome, Pageable pageable);
    Page<Entidade> findByCodigo(String nome, Pageable pageable);

}
