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
        try {
            if(0 > salario) {
                throw new Exception("Insira um salário válido!");
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        try {
            if(cargo.isEmpty() || 4 > cargo.length()) {
                throw new Exception("Insira um cargo válido!");
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
