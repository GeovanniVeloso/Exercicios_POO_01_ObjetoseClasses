package model;

public class Funcionário {
	private String nome;
	private double salario;
	private String cargo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		if (salario < 1412.00) {
			salario = 1412.00;
		} else {
			this.salario = salario;
		}
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalarioLiquido(double descontos, double beneficios) {
		double salarioLiquido = getSalario() + beneficios - descontos;
		return salarioLiquido;
	}

}
