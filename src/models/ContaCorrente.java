package models;

public class ContaCorrente extends ContaBancaria {
	private float chequeEspecial;
	private double taxaManutencao = 0.03;
	
	private void aplicarTaxaManutencao() {
		
	}
	
	private String emitirCheque(float valor) {
		return "SEM CONEXAO";
	}
}
