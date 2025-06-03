package br.com.sgci.controller.schema;

import java.util.List;

public class ResponsePagedCommon<T> {
	
	private List<T> dados;
	private Long totalRecords;
	private int totalPaginas;
	private int pageSize;
	
	
	
	public ResponsePagedCommon(List<T> dados, Long totalRecords, int totalPaginas, int pageSize) {
		super();
		this.dados = dados;
		this.totalRecords = totalRecords;
		this.totalPaginas = totalPaginas;
		this.pageSize = pageSize;
	}
	
	public List<T> getDados() {
		return dados;
	}
	public void setDados(List<T> dados) {
		this.dados = dados;
	}
	public Long getTotalRecords() {
		return totalRecords;
	}
	public void setTotalRecords(Long totalRecords) {
		this.totalRecords = totalRecords;
	}
	public int getTotalPaginas() {
		return totalPaginas;
	}
	public void setTotalPaginas(int totalPaginas) {
		this.totalPaginas = totalPaginas;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	

}
