package models;

public class Funcionario extends Pessoa {
    private double salario;
    private String cargo;

    public Funcionario(int id, String nome, Email email, Cpf cpf, Endereco endereco, Telefone telefone, String dataNascimento, double salario, String cargo) {
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
