package br.com.facol.livraria.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "address")
public class AddressEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "zip_code")
	private String zipCode;

	@Column(name = "public_place")
	private String publicPlace;

	@Column(name = "complement")
	private String complement;

	@Column(name = "neighborhood")
	private String neighborhood;

	@Column(name = "locality")
	private String locality;

	@Column(name = "uf")
	private String uf;

	@Column(name = "gia")
	private String gia;

	@Column(name = "ddd")
	private String ddd;

	@Column(name = "siafi")
	private String siafi;
	
	@ManyToOne
    @JoinColumn(name="client_fk", nullable=false)
    private ClientEntity client;

	public AddressEntity() {
	}

	public AddressEntity(Long id, String zipCode, String publicPlace, String complement, String neighborhood,
			String locality, String uf, String gia, String ddd, String siafi) {
		super();
		this.id = id;
		this.zipCode = zipCode;
		this.publicPlace = publicPlace;
		this.complement = complement;
		this.neighborhood = neighborhood;
		this.locality = locality;
		this.uf = uf;
		this.gia = gia;
		this.ddd = ddd;
		this.siafi = siafi;
	}

	public Long getId() {
		return id;
	}

	public String getZipCode() {
		return zipCode;
	}

	public String getPublicPlace() {
		return publicPlace;
	}

	public String getComplement() {
		return complement;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public String getLocality() {
		return locality;
	}

	public String getUf() {
		return uf;
	}

	public String getGia() {
		return gia;
	}

	public String getDdd() {
		return ddd;
	}

	public String getSiafi() {
		return siafi;
	}

}
