package models;

import java.util.Date;

public class Cliente extends Pessoa {
    private ContaBancaria conta;

    public Cliente(int id, String nome, String email, Cpf cpf, Endereco endereco, String telefone, Date dataNascimento, ContaBancaria conta) {
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
