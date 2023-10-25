package models;

public class ContaPoupanca extends ContaBancaria {
	private double taxaJuros = 0.05;
	
	public ContaPoupanca(int id, int numeroConta, double saldo, Cliente titular, int agencia) {
		super(id, numeroConta, saldo, titular, agencia);
	}

	public ContaPoupanca() {
		
	}

	public void aplicarTaxa() {
		setSaldo(getSaldo() + getSaldo()*taxaJuros);
	}

	public void setTaxaJuros(double taxa) {
		try {
			if(0 > taxa) {
				throw new Exception("Insira uma taxa válida!");
			}

			this.taxaJuros = taxa;
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public double getTaxaJuros() {
		return taxaJuros;
	}
}
