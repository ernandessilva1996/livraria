package br.com.facol.livraria.builder;

import br.com.facol.livraria.entity.ClientEntity;

public class ClientBuilder {

	private Long id;
	private String cpf;
	private String cnpj;
	private String telephone;

	public ClientBuilder id(Long id) {
		this.id = id;
		return this;
	}

	public ClientBuilder cpf(String cpf) {
		this.cpf = cpf;
		return this;
	}

	public ClientBuilder cnpj(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}

	public ClientBuilder telephone(String telephone) {
		this.telephone = telephone;
		return this;
	}

	public ClientEntity build() {
		return new ClientEntity(id, cpf, cnpj, telephone);
	}

}
