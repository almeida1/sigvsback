package com.edu.sigvsback.model;

public record ProdutoDTO (
		String descricao, 
		String categoria,
		double custo, 
		int quantidadeNoEstoque)
{
}

