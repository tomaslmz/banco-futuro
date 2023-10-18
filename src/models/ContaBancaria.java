package models;

abstract class ContaBancaria {
	private int id;
	private int numeroConta;
	private double saldo;
	private String titular;
	private int agencia;
	
	public ContaBancaria(int id, int numeroConta, double saldo, String titular, int agencia) {
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
		this.id = id;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
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
