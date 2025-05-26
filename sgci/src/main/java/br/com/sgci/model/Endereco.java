package br.com.sgci.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "endereco")
public class Endereco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_endereco")
	private Long id;
	
	@Size(max = 8)
	@Column(name = "cep")
	private String cep;
	
	@NotNull
	@Size(max = 255)
	@Column(name = "estado")
	private String estado;
	
	@NotNull
	@Size(max = 255)
	@Column(name = "cidade")
	private String cidade;
	
	@Size(max = 255)
	@Column(name = "rua")
	private String rua;
	
	@Size(max = 255)
	@Column(name = "bairro")
	private String bairro;
	
	@Column(name = "numero")
	private Integer numero;

	
	
	public Endereco(@Size(max = 8) String cep,
			@Size(max = 255) String estado, 
			@Size(max = 255) String cidade,
			@Size(max = 255) String rua,
			@Size(max = 255) String bairro, 
			Integer numero) {
		super();
		this.cep = cep;
		this.estado = estado;
		this.cidade = cidade;
		this.rua = rua;
		this.bairro = bairro;
		this.numero = numero;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	

}
