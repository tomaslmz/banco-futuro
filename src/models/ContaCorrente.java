package models;

public class ContaCorrente extends ContaBancaria {
	private double taxaManutencao = 0.03;
	
	public ContaCorrente(int id, int numeroConta, double saldo, Cliente titular, int agencia, float chequeEspecial) {
		super(id, numeroConta, saldo, titular, agencia);
	}

	public ContaCorrente() {

	}

	@Override
	public void transferir(float quantidade, String destino) {
		try {
			if(0 >= quantidade) {
				throw new Exception("Quantidade de transferência inválida!");
			}

			if(destino.isEmpty()) {
				throw new Exception("Destino de transferência inválida!");
			}

			if(quantidade > getSaldo()) {
				throw new Exception("Saldo insuficiente!");
			}
			
			System.out.println("Transferência de R$" + quantidade + " para " + destino);
			setSaldo(getSaldo() - (quantidade + quantidade*taxaManutencao));
			addExtrato("TRANSFERÊNCIA", quantidade, destino, quantidade*taxaManutencao);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public double getTaxaManutencao() {
		return taxaManutencao;
	}

	public void setTaxaManutencao(double taxaManutencao) {
		this.taxaManutencao = taxaManutencao;
	}
}
