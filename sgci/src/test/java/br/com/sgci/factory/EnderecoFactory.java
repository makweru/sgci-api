package br.com.sgci.factory;

import br.com.sgci.controller.schema.EnderecoReq;
import br.com.sgci.controller.schema.EnderecoUpd;
import br.com.sgci.model.Endereco;

public class EnderecoFactory {

	public static Endereco getEndereco() {
		return new Endereco("79042259", "MAPUTO PROVINCIA", "MATOLA RIO", "Rua da Mozal", "Djuba", 5000);
	}
	
	public static EnderecoReq getEnderecoReq() {
		return new EnderecoReq("79042259", "MAPUTO PROVINCIA", "MATOLA RIO", "Rua da Mozal", "Djuba", 5000);
	}

	public static EnderecoUpd getEnderecoUpd() {
		return new EnderecoUpd("79042886", "MAPUTO CIDADE", "KAMAVOTA", "Av 25 de Junho", "Hulene", 150);
	} 
}
