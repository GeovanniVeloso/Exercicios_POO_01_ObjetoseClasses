package view;

import java.time.LocalDate;

import model.Pessoa;

public class Principal {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		LocalDate dn = LocalDate.of(2004, 01, 22);
		p.setNome("Geovanni");
		p.setProfissao("Programador");
		try {
			p.setDataDenascimento(dn);
		} catch (Exception e) {
			System.err.println(e);
		}
		
		System.out.println("A idade da pessoa é de "+p.getIdade()+" anos.");
	}

}
