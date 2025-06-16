package br.com.sgci.controller.schema;

import java.util.List;

public class ResponsePagedCommon<T> {

	private List<T> data;
	private Long totalRecords;
	private int totalPaginas;
	private int pageSize;
	private int page;

	public ResponsePagedCommon(List<T> data, Long totalRecords, int totalPaginas, int pageSize, int page) {
		super();
		this.data = data;
		this.totalRecords = totalRecords;
		this.totalPaginas = totalPaginas;
		this.pageSize = pageSize;
		this.page = page;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
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

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	

}
