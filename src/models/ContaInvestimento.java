package models;

class ContaInvestimento extends ContaBancaria {
	String[] investimentos;
	
	public ContaInvestimento(int id, int numeroConta, double saldo, String titular, int agencia) {
		super(id, numeroConta, saldo, titular, agencia);
	}

	public ContaInvestimento() {
		
	}

	public void investir(float valor, int tipo) {
		
	}
	
	public String getInvestimento(int tipo) {
		return "SEM CONEXAO";
	}
}
