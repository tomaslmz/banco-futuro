package models;

import models.Cliente;
import java.util.ArrayList;

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
		if(numeroConta >= 0) {
			this.numeroConta = numeroConta;
		} else {
			System.out.println("Número da conta inválido!");
		}

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
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
