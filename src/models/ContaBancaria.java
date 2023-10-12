package models;

public class ContaBancaria {
	private int id;
	private int numeroConta;
	private float saldo;
	private String titular;
	private int agencia;
	
	public void ContaBancaria(int id, int numeroConta, float saldo, String titular, int agencia) {
		setId(id);
		setNumeroConta(numeroConta);
		setSaldo(saldo);
		setTitular(titular);
		setAgencia(agencia);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public void sacar(float quantidade) {
		this.saldo = saldo-quantidade;
	}
	
	public void depositar(float quantidade) {
		this.saldo+=quantidade;
	}
	
	public String gerarExtrato() {
		return "SEM CONEXAO";
	}
	
	public void transferir(float quantidade, String destino) {
		
	}
	
	public void pagar(float quantidade, String destino) {
		
	}
}
