package model;

public class Produto {

	private String nome;
	private float preco;
	private int qntdEstoque;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) throws Exception {
		if(preco <= 0) {
			String e = "Preço não pode ser inferior ou igual a 0";
			throw new Exception(e);
		}else {
			this.preco = preco;	
		}
	}

	public int getQntdEstoque() {
		return qntdEstoque;
	}

	public void setQntdEstoque(int qntdEstoque) throws Exception {
		if(qntdEstoque <= 0) {
			String e = "Quantidade não pode ser inferior ou igual a 0";
			throw new Exception(e);
		}else {
			this.qntdEstoque = qntdEstoque;	
		}
	}
	
	public boolean verificaProdutoDisponivel(String nome) {
		if(getQntdEstoque()>0) {
			return true;
		}else {
			return false;
		}
	}
	
	public float totalQntdEstoque() {
		float total = getQntdEstoque()*getPreco();
		return total;
	}

}
