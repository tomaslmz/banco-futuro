package models;

public class ContaCorrente extends ContaBancaria {
	private float chequeEspecial;
	private double taxaManutencao = 0.03;
	
	public void ContaCorrente(int id, int numeroConta, float saldo, String titular, int agencia, float chequeEspecial, double TaxaManutencao) {
//		fazer isso
	}
	
	public float getChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(float chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}

	public double getTaxaManutencao() {
		return taxaManutencao;
	}

	public void setTaxaManutencao(double taxaManutencao) {
		this.taxaManutencao = taxaManutencao;
	}

	private void aplicarTaxaManutencao() {
		
	}
	
	private String emitirCheque(float valor) {
		return "SEM CONEXAO";
	}
}
