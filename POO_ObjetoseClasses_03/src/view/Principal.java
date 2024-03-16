package view;

import model.Funcionário;

public class Principal {

	public static void main(String[] args) {
		Funcionário func = new Funcionário();
		func.setNome("Geovanni Veloso Ferreira");
		func.setCargo("Estagiário");
		func.setSalario(1800.00);
		
		System.out.println("O nome do funcionário é: "+func.getNome());
		System.out.println("O cargo do funcionário é: "+func.getCargo());
		System.out.println("O salario liquido do funcionário é: "+func.getSalarioLiquido(400,200));
	}

}
