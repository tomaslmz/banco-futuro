package models;

import java.util.Date;

public class Pessoa {
    private int id;
    private String nome;
    private String email;
    private Cpf cpf;
    private Endereco endereco;
    private String telefone;
    private Date dataNascimento;

    public Pessoa(int id, String nome, String email, Cpf cpf, Endereco endereco, String telefone, Date dataNascimento) {
        setId(id);
        setNome(nome);
        setEmail(email);
        setCpf(cpf);
        setEndereco(endereco);
        setTelefone(telefone);
        setDataNascimento(dataNascimento);
    }

    public Pessoa() {
        
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Cpf getCpf() {
        return this.cpf;
    }

    public void setCpf(Cpf cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
