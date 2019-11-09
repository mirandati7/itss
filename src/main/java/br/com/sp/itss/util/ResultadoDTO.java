package br.com.sp.itss.util;

import br.com.sp.itss.dto.EntidadeDTO;

public class ResultadoDTO extends EntidadeDTO {
	
	private String mensagem;

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	
}