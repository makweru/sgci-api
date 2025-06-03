package br.com.sgci.controller.schema;

import br.com.sgci.model.TipoPessoaEnum;

public class PessoaFilter extends FilterPageable {
	private String nome;
	private TipoPessoaEnum tipo;
	private String documento;
	private String cep;
	private String estado;
	private String cidade;
	
	
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
	
	
}
	