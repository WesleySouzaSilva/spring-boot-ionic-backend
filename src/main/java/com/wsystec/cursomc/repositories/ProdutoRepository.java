package com.wsystec.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wsystec.cursomc.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
