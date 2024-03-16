package view;

import model.ContaBancaria;

public class Principal {

	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria();
		
		conta.nome = "Geovanni Veloso";
		conta.numeroConta = 1467;
		conta.saldo = 1480.00;
		
		System.out.println("A conta ficou com R$"+conta.realizaDeposito(1000)+" reais após depósito.");
		System.out.println("A conta ficou com R$"+conta.realizaSaque(500)+" reais após saque.");

	}

}
