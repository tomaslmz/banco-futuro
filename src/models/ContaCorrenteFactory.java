package models;

public class ContaCorrenteFactory implements ContaFactory {
    
    public ContaCorrenteFactory() {

    }

    @Override
    public ContaCorrente criarConta() {
        return new ContaCorrente();
    }

    public ContaCorrente criarConta(int id, int numeroConta, double saldo, Cliente titular, int agencia, float chequeEspecial) {
        return new ContaCorrente(id, numeroConta, saldo, titular, agencia, chequeEspecial);
    }
}
