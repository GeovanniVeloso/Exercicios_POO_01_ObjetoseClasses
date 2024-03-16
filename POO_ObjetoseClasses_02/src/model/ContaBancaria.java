package model;

public class ContaBancaria {

	public int numeroConta;
	public String nome;
	public double saldo;
	
	public void Conta(int numeroConta, String nome, double saldo) {
		this.numeroConta = numeroConta;
		this.nome = nome;
		this.saldo = saldo;
	}
	
	public double realizaDeposito(double valor) {
		saldo = saldo + valor;
		return saldo;
	}
	
	public double realizaSaque(double valor) {
		saldo = saldo - valor;
		return saldo;
	}
}
