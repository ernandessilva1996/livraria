package br.com.facol.livraria.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "client")
public class ClientEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "cpf")
	private String cpf;
	@Column(name = "cnpj")
	private String cnpj;

	@Column(name = "telephone")
	private String telephone;
	
	@OneToMany(mappedBy="client")
    private List<AddressEntity> address;
	
	public ClientEntity() {
	}

	public ClientEntity(Long id, String cpf, String cnpj, String telephone) {
		super();
		this.id = id;
		this.cpf = cpf;
		this.cnpj = cnpj;
		this.telephone = telephone;
	}

	public Long getId() {
		return id;
	}

	public String getCpf() {
		return cpf;
	}

	public String getCnpj() {
		return cnpj;
	}

	public String getTelephone() {
		return telephone;
	}
}
