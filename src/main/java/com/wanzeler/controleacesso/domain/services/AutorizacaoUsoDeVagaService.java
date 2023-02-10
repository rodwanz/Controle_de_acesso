package com.wanzeler.controleacesso.domain.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wanzeler.controleacesso.domain.model.AutorizacaoUsoDeVaga;
import com.wanzeler.controleacesso.domain.repositories.AutorizacaoUsoDeVagaRepository;

@Service
public class AutorizacaoUsoDeVagaService {
	
	@Autowired
	AutorizacaoUsoDeVagaRepository vagaRepository;
	
	@Transactional
	public AutorizacaoUsoDeVaga insert(AutorizacaoUsoDeVaga vaga) {
		vaga.setId(null);
		return vagaRepository.save(vaga);
	}
}
