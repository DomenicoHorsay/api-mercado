package com.mercado.api_mercado.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mercado.api_mercado.Produto.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}