package br.com.fiap.localtech.localtech.entites;

import java.math.BigDecimal;

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
public class Veiculos {
	
	private Long id;
	private String marca;
	private String modelo;
	private String placa;
	private int ano;
	private String cor;
	private BigDecimal valorDiaria;
	
	
	
}
