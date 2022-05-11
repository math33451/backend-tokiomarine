package com.marinetokio.dto;

import javax.persistence.Column;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class TransferenciaDto {

	@Id
	private Long id;
	@Column(length = 6)
	private Long contaOrigem;
	@Column(length = 6)
	private Long contaDestino;
	private Long valor;
	private Long dataTransferencia;
	private Long dataAgendada;
	private String tipoOperacao;
}