package br.com.fiap.localtech.localtech.entites;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Alugel {
	
	private Long id;
	private Long PessoaId;
	private Long VeiculoId;
	private String veiculoModelo;
	private String pessoaCpf;
	private String pessoaNome;
	private LocalDate dataInicio;
	private LocalDate dataFim;
	private BigDecimal valorTotal;
}
