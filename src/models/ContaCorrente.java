package models;

public class ContaCorrente extends ContaBancaria {
	private double chequeEspecial;
	private double taxaManutencao = 0.03;
	
	public ContaCorrente(int id, int numeroConta, double saldo, Cliente titular, int agencia, float chequeEspecial, double TaxaManutencao) {
		super(id, numeroConta, saldo, titular, agencia);
		setChequeEspecial(chequeEspecial);
		setTaxaManutencao(TaxaManutencao);
	}

	public ContaCorrente() {

	}
	
	public double getChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(double chequeEspecial) {
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
	
	private String emitirCheque(double valor) {
		return "SEM CONEXAO";
	}
}
