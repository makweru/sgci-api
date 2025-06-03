package br.com.sgci.manager;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import br.com.sgci.controller.schema.EnderecoMapper;
import br.com.sgci.controller.schema.EnderecoResponse;
import br.com.sgci.controller.schema.PessoaMapper;
import br.com.sgci.controller.schema.PessoaReq;
import br.com.sgci.controller.schema.PessoaResponse;
import br.com.sgci.controller.schema.PessoaUpd;
import br.com.sgci.model.Endereco;
import br.com.sgci.model.Pessoa;
import br.com.sgci.repository.PessoaRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@Service
@Validated
public class PessoaManager {
	
	@Autowired
	private PessoaRepository pessoaRepository;

	@Transactional
	public Pessoa createPessoa(PessoaReq req) {
		
		// Validações
		
		
		// cria uma pessoa e salva-a no banco de dados
		Endereco endereco = new Endereco(
				req.endereco().cep(), 
				req.endereco().estado(),
				req.endereco().cidade(),
				req.endereco().rua(),
				req.endereco().bairro(),
				req.endereco().numero());
		
		Pessoa pessoa = new Pessoa(
				req.nome(), 
				req.tipo(), 
				req.documento(), 
				req.profissao(), 
				req.estadoCivil(), 
				endereco);
		
		return pessoaRepository.save(pessoa);
	}

	@Transactional
	public void deletePessoa(Long idPessoa) {
		Pessoa pessoa = pessoaRepository.findById(idPessoa).orElseThrow();
		pessoaRepository.delete(pessoa);
	}

	public List<PessoaResponse> findAll() {
		List<PessoaResponse> listReponse = new ArrayList<>();
		
		List<Pessoa> listPessoa = pessoaRepository.findAll();
		listPessoa.forEach(item ->{
			EnderecoResponse enderecoResponse = EnderecoMapper.INSTANCE.toEnderecoResponse(item.getEndereco());
			PessoaResponse pessoaResponse = PessoaMapper.INSTANCE.toPessoaResponse(item, enderecoResponse);
			
			listReponse.add(pessoaResponse);
		});
				
		return listReponse;
	}

	@Transactional
	public Pessoa updatePessoa(@Valid Long idPessoa, PessoaUpd upd) {
		
		Pessoa pessoa = pessoaRepository.findById(idPessoa).orElseThrow();
		
		// Actualização dos dados Básicos
		pessoa.setDocumento(upd.documento());
		pessoa.setEstadoCivil(upd.estadoCivil());
		pessoa.setNome(upd.nome());
		pessoa.setProfissao(upd.profissao());
		pessoa.setTipo(upd.tipo());
		
		// Actualização do Endereço
		pessoa.getEndereco().setCep(upd.endereco().cep());
		pessoa.getEndereco().setEstado(upd.endereco().estado());
		pessoa.getEndereco().setCidade(upd.endereco().cidade());
		pessoa.getEndereco().setRua(upd.endereco().rua());
		pessoa.getEndereco().setBairro(upd.endereco().bairro());
		pessoa.getEndereco().setNumero(upd.endereco().numero());
		
		pessoaRepository.save(pessoa);
		
		return pessoa;
	}

	public PessoaResponse findById(Long idPessoa) {
		Pessoa pessoa = pessoaRepository.findById(idPessoa).orElseThrow();
		EnderecoResponse enderecoResponse = EnderecoMapper.INSTANCE.toEnderecoResponse(pessoa.getEndereco());
		return PessoaMapper.INSTANCE.toPessoaResponse(pessoa, enderecoResponse);
	}

}
