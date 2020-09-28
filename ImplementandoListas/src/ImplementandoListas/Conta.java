package ImplementandoListas;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class Conta {

	private int agencia;
	private int numeroConta;
	private double saldo;
	private String titular;
	public Conta proximo;
}
