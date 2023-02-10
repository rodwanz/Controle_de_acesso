package com.wanzeler.controleacesso.api.exceptionhandler;

import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Problema {
	
	private Integer status;
	//private OffsetDateTime dataHora;
	private LocalDateTime dataHora;
	private String titulo;
	private List<Campo> campos;
	
	@Getter
	@AllArgsConstructor
	public static class Campo {

		private String nome;
		private String mensagem;

	}

}
