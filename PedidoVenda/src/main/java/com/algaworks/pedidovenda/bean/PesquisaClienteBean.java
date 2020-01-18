package com.algaworks.pedidovenda.bean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Named;

import com.algaworks.pedidovenda.enumeration.TipoPessoa;
import com.algaworks.pedidovenda.model.Cliente;
import com.algaworks.pedidovenda.model.Endereco;

@Named
public class PesquisaClienteBean {
	
	private List<Cliente> clientes;
	private List<Endereco> enderecos;
	
	@PostConstruct
	public void init() {
		this.clientes = new ArrayList<Cliente>();
		this.enderecos = new ArrayList<Endereco>();
		
		Cliente cliente = new Cliente("Teste", TipoPessoa.FISICA, "33322244485", "teste@teste.com.br");
		Endereco endereco = new Endereco("Endereço de teste do dataTable", 12345, "Edifício de teste, 9º andar", "12.556-963", "Sintra", "Lisboa");
		
		for (int i = 0; i < 20; i++) {
			this.clientes.add(cliente);
			
			if ((i % 3) == 0) {
				this.enderecos.add(endereco);
			}
		}
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

}
