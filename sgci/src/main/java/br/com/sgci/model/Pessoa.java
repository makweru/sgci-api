package br.com.sgci.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "pessoa")
public class Pessoa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pessoa")
	private Long id;
	
	@NotNull
	@Size(max = 255)
	@Column(name = "nome")
	private String nome;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	@Column(name = "en_tipo")
	private TipoPessoaEnum tipo;
	
	@NotNull
	@Size(max = 255)
	@Column(name = "documento", unique = true)
	private String documento;
	
	@NotNull
	@Size(max = 255)
	@Column(name = "tx_profissao")
	private String profissao;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	@Column(name = "en_estado_civil")
	private EstadoCivilEnum estadoCivil;
	
	@NotNull
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_endereco")
	private Endereco endereco;
	
	public Pessoa() {}

	public Pessoa(@NotNull @Size(max = 255) String nome, 
			@NotNull TipoPessoaEnum tipo,
			@NotNull @Size(max = 255) String documento, 
			@NotNull @Size(max = 255) String profissao,
			@NotNull EstadoCivilEnum estadoCivil,
			@NotNull Endereco endereco) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.documento = documento;
		this.profissao = profissao;
		this.estadoCivil = estadoCivil;
		this.endereco = endereco;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoPessoaEnum getTipo() {
		return tipo;
	}

	public void setTipo(TipoPessoaEnum tipo) {
		this.tipo = tipo;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public EstadoCivilEnum getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivilEnum estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	
	
		
}
