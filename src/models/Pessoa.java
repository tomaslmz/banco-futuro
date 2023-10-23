package models;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;

public class Pessoa {
    private int id;
    private String nome;
    private Email email;
    private Cpf cpf;
    private Endereco endereco;
    private Telefone telefone;
    private LocalDateTime dataNascimento;

    public Pessoa(int id, String nome, Email email, Cpf cpf, Endereco endereco, Telefone telefone, String dataNascimento) {
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
        try {
			if(id < 0) {
				throw new Exception("ID inválido!");
			}

			this.id = id;
		} catch(Exception e) {
			System.out.println(e);
		}
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        try {
            if(nome.isEmpty()) {
                throw new Exception("O nome não pode estar vazio!");
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Email getEmail() {
        return this.email;
    }

    public void setEmail(Email email) {
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

    public Telefone getTelefone() {
        return this.telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public LocalDateTime getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        try {
            if(!Pattern.compile("^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$").matcher(dataNascimento).find()) {
                throw new Exception("Data de nascimento inválido!");
            }

            this.dataNascimento = LocalDateTime.parse(dataNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
