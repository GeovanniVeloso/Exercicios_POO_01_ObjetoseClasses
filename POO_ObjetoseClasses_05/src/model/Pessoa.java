package model;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Pessoa {

	private String nome;
	private LocalDate dataDeNascimento;
	private String profissao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDenascimento(LocalDate dataDeNascimento) throws Exception {
		this.dataDeNascimento = dataDeNascimento;
		if (getIdade() > 150) {
			this.dataDeNascimento = null;
			String e = "Idade superior a 150";
			throw new Exception(e);
		}
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public int getIdade() {
		LocalDate dn = getDataDeNascimento();
		LocalDate dh = LocalDate.now();

		Period idade = Period.between(dn, dh);

		return idade.getYears();

	}

}
