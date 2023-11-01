package models;

public class ContaPoupancaFactory implements ContaFactory {

    public ContaPoupancaFactory() {
        
    }

    @Override
    public ContaPoupanca criarConta() {
        return new ContaPoupanca();
    }

    public ContaPoupanca criarConta(int id, int numeroConta, double saldo, Cliente titular, int agencia) {
        return new ContaPoupanca(id, numeroConta, saldo, titular, agencia);
    }

}
