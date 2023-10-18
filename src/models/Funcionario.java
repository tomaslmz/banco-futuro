package models;

import java.util.Date;

public class Funcionario extends Pessoa {
    private double salario;
    private String cargo;

    public Funcionario(int id, String nome, String email, Cpf cpf, Endereco endereco, String telefone, Date dataNascimento, double salario, String cargo) {
        super(id, nome, email, cpf, endereco, telefone, dataNascimento);
        setSalario(salario);
        setCargo(cargo);
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}
