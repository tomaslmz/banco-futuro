package models;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

abstract class ContaBancaria {
	private int id;
	private int numeroConta;
	private double saldo;
	private Cliente titular;
	private int agencia;
	private ArrayList<String> extrato = new ArrayList<>();
	
	public ContaBancaria(int id, int numeroConta, double saldo, Cliente titular, int agencia) {
		setId(id);
		setNumeroConta(numeroConta);
		setSaldo(saldo);
		setTitular(titular);
		setAgencia(agencia);
	}

	public ContaBancaria() {
		
	}

	public void addExtrato(String tipo, double quantidade, String destino) {		
		try {
			if(tipo.isEmpty()) {
				throw new Exception("O tipo não pode estar vazio!");
			}

			if(tipo != "SAQUE" && tipo != "PAGAMENTO" && tipo != "TRANSFERÊNCIA" && tipo != "DEPÓSITO") {
				throw new Exception("Tipo inválido!");
			}

			if(0 > quantidade) {
				throw new Exception("Quantidade inválida!");
			}

			if(destino.isEmpty()) {
				throw new Exception("Destino inválido!");
			}

			String extrato = "Tipo: " + tipo + "\nQuantidade R$" + quantidade + "\nDestino: " + destino + "\nData: " + getDataAtual() + " " + getHoraAtual();
			
			this.extrato.add(extrato);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void addExtrato(String tipo, double quantidade) {		
		try {
			if(tipo.isEmpty()) {
				throw new Exception("O tipo não pode estar vazio!");
			}

			if(tipo != "SAQUE" && tipo != "PAGAMENTO" && tipo != "TRANSFERÊNCIA" && tipo != "DEPÓSITO") {
				throw new Exception("Tipo inválido!");
			}

			if(0 > quantidade) {
				throw new Exception("Quantidade inválida!");
			}

			String extrato = "Tipo: " + tipo + "\nQuantidade R$" + quantidade + "\nData: " + getDataAtual() + " " + getHoraAtual();
			
			this.extrato.add(extrato);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public String getDataAtual() {
		Date data = new Date();
		return new SimpleDateFormat("dd/MM/yyyy").format(data);
	}

	public String getHoraAtual() {
		Date hora = new Date();
		return new SimpleDateFormat("HH:mm:ss").format(hora);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		try {
			if(id < 0) {
				throw new Exception("ID inválido!");
			}

			this.id = id;
		} catch(Exception e) {
			System.out.println(e);
		}
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		try {
			if(0 > numeroConta) {
				throw new Exception("Número da conta inválido!");
			}

			this.numeroConta = numeroConta;
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		try {
			if(0 > agencia) {
				throw new Exception("Agência inválida!");
			}

			this.agencia = agencia;
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	
	public void sacar(float quantidade) {
		try {
			if(quantidade <= 0) {
				throw new Exception("Quantidade de saque inválida!");
			}

			if(quantidade > saldo) {
				throw new Exception("Saldo insuficiente!");
			}

			this.saldo = saldo-quantidade;
			
			System.out.println("Saque de R$" + quantidade + " realizado com sucesso");
			addExtrato("SAQUE", quantidade);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void depositar(float quantidade) {
		try {
			if(0 > quantidade) {
				throw new Exception("Quantidade de depósito inválida!");
			}

			this.saldo += quantidade;

			System.out.println("Depósito de R$" + quantidade + " realizado com sucesso");
			addExtrato("DEPÓSITO", quantidade);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public ArrayList<String> getExtrato() {
		return extrato;
	}
	
	public void transferir(float quantidade, String destino) {
		try {
			if(0 >= quantidade) {
				throw new Exception("Quantidade de transferência inválida!");
			}

			if(destino.isEmpty()) {
				throw new Exception("Destino de transferência inválida!");
			}

			if(quantidade > saldo) {
				throw new Exception("Saldo insuficiente!");
			}
			
			System.out.println("Transferência de R$" + quantidade + " para " + destino);
			this.saldo -= quantidade;
			addExtrato("TRANSFERÊNCIA", quantidade, destino);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void pagar(float quantidade, String destino) {
		try {
			if(0 >= quantidade) {
				throw new Exception("Quantidade de pagamento inválida!");
			}

			if(destino.isEmpty()) {
				throw new Exception("Destino de pagamento inválida!");
			}

			if(quantidade > saldo) {
				throw new Exception("Saldo insuficiente!");
			}
			
			System.out.println("Pagamento de R$" + quantidade + " para " + destino);
			this.saldo -= quantidade;
			addExtrato("PAGAMENTO", quantidade, destino);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
