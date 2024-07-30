package com.edu.sigvsback;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.edu.sigvsback.model.Produto;
import com.edu.sigvsback.model.ProdutoDTO;
import com.edu.sigvsback.servico.IProdutoRepository;
@SpringBootTest
class Req01CadastrarProduto {
	
	@Autowired
	IProdutoRepository repository;

	@Test
	void ct01CadastrarProduto_com_sucesso() {
		//dado que o repository esta vazio
		repository.deleteAll();
		//quando cadastro um produto com informações validas
		Produto produto1 = new Produto("Eletrobomba 110V para Maquina de Lavar e Lava Louças", "maquina de lavar","51.66", "12");
		repository.save(produto1);
		//entao o estado do repositorio muda para 1 registro cadastrado
		assertEquals(1, repository.count());
	}
	
}
