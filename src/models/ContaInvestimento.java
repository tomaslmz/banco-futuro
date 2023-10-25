package models;

import java.util.ArrayList;

public class ContaInvestimento extends ContaBancaria {
	private ArrayList<String> investimentos = new ArrayList<>();

	private double valor;
	private double tempo;
	private double taxaJuro = 2.5;
	
	public ContaInvestimento(int id, int numeroConta, double saldo, Cliente titular, int agencia) {
		super(id, numeroConta, saldo, titular, agencia);
	}

	public ContaInvestimento() {

	}

	public void setValor(double valor) {
		try {
            if(valor <= 0) { // Teste para verificar se existe um erro
                throw new Exception("Operação invalida!"); // Avisando que há um erro
            }
            System.out.println("Valor adicionado a investimento" +valor);
            this.valor = valor;
        } catch(Exception e) {
            // Quando haver um erro, o código irá pular direto para esta linha e imprimir a mensagem conforme o que eu configurar aqui
            System.out.println(e.getMessage());
        }
	}

	public double getValor() {
		return valor;
	}

	public void setTempo(double ptempo) {
		try {
            if(ptempo <= 0) { // Teste para verificar se existe um erro
                throw new Exception("Operação invalida!"); // Avisando que há um erro
            }
            System.out.println("Tempo informado:" +ptempo);
            this.tempo = ptempo;
        } catch(Exception e) {
            // Quando haver um erro, o código irá pular direto para esta linha e imprimir a mensagem conforme o que eu configurar aqui
            System.out.println(e.getMessage());
        }
	}

	public double getTempo() {
		return tempo;
	}

	public void investir(double valor, double tempo) {
		double valorFuturo = ((valor*tempo)*taxaJuro);
		
		String mensagem = "\nValor: " + valor + "\nTempo: " + tempo + "\nTaxa:" + taxaJuro + "\nValor futuro: " + valorFuturo;
		investimentos.add(mensagem);
	}

	public ArrayList<String> getInvestimentos() {
		return investimentos;
	}
}

/*
 * O usuário deve inserir:
 * valorInvestido
 * tempoInvestimento
 */
