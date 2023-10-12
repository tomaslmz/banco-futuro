package models;

public class ContaPoupanca extends ContaBancaria {
	private float taxaJuros;
	
	public String calcularJuros() {
		return "SEM CONEXAO";
	}
	
	public void alterarTaxaJuros(float novaTaxa) {
		this.taxaJuros = novaTaxa;
	}
}
