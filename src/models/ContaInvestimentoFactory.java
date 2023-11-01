package models;

public class ContaInvestimentoFactory implements ContaFactory {
    
    public ContaInvestimentoFactory() {
        
    }

    @Override
    public ContaInvestimento criarConta() {
        return new ContaInvestimento();
    }

    public ContaInvestimento criarConta(int id, int numeroConta, double saldo, Cliente titular, int agencia) {
        return new ContaInvestimento(id, numeroConta, saldo, titular, agencia);
    }

}
