package models;

public class ContaPoupanca extends ContaBancaria {
	private double taxaJuros;
	
	public ContaPoupanca(int id, int numeroConta, double saldo, String titular, int agencia, double taxaJuros) {
		super(id, numeroConta, saldo, titular, agencia);
		alterarTaxaJuros(taxaJuros);
	}

	public ContaPoupanca() {
		
	}

	public String calcularJuros() {
		return "SEM CONEXAO";
	}
	
	public void alterarTaxaJuros(double novaTaxa) {
		this.taxaJuros = novaTaxa;
	}
}
