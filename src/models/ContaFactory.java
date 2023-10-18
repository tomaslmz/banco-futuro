package models;
import models.ContaBancaria;
import models.ContaCorrente;
import models.ContaInvestimento;
import models.ContaPoupanca;

public class ContaFactory {
    public ContaFactory() {

    }

    public ContaBancaria criarContaBancaria(int id, int numeroConta, double saldo, String titular, int agencia) {
        return new ContaBancaria(id, numeroConta, saldo, titular, agencia);
    }

    public ContaBancaria criarContaBancaria() {
        return new ContaBancaria();
    }

    public ContaCorrente criarContaCorrente(int id, int numeroConta, double saldo, String titular, int agencia, float chequeEspecial, double TaxaManutencao) {
        return new ContaCorrente(id, numeroConta, saldo, titular, agencia, chequeEspecial, TaxaManutencao);
    }

    public ContaCorrente criarContaCorrente() {
        return new ContaCorrente();
    }

    public ContaPoupanca criarContaPoupanca(int id, int numeroConta, double saldo, String titular, int agencia, double taxaJuros) {
        return new ContaPoupanca(id, numeroConta, saldo, titular, agencia, taxaJuros);
    }

    public ContaPoupanca criarContaPoupanca() {
        return new ContaPoupanca();
    }

    public ContaInvestimento criarContaInvestimento(int id, int numeroConta, double saldo, String titular, int agencia) {
        return new ContaInvestimento(id, numeroConta, saldo, titular, agencia);
    }

    public ContaInvestimento criarContaInvestimento() {
        return new ContaInvestimento();
    }
}
