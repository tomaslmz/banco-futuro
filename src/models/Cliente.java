package models;

public class Cliente extends Pessoa {
    private ContaBancaria conta;

    public Cliente(int id, String nome, Email email, Cpf cpf, Endereco endereco, Telefone telefone, String dataNascimento, ContaBancaria conta) {
        super(id, nome, email, cpf, endereco, telefone, dataNascimento);
        setConta(conta);
    }

    public Cliente() {
        
    }

    public void setConta(ContaBancaria conta) {
        this.conta = conta;
    }

    public ContaBancaria getConta() {
        return conta;
    }
}
