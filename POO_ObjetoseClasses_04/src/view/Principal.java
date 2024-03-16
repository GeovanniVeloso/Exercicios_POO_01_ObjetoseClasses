package view;

import model.Produto;

public class Principal {

	public static void main(String[] args) {
		
		Produto p = new Produto();
		
		p.setNome("Bolacha");
		try {
			p.setPreco(2.50f);
		} catch (Exception e) {
			System.err.println(e);
		}
		try {
			p.setQntdEstoque(100);
		} catch (Exception e) {
			System.err.println(e);
		}

		if(p.verificaProdutoDisponivel("Bolacha") == true ) {
			System.out.println("Existe R$"+p.totalQntdEstoque()+" de bolacha em estoque.");
		}else {
			System.out.println("Não existe bolacha em estoque.");
		}
	}

}
