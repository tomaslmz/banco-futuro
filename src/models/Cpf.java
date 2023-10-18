package models;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Cpf {
    private String cpf;

    public Cpf(String cpf) {
        setCpf(cpf);
    }

    public void setCpf(String cpf) {
        if(validarCpf(cpf)) {
            this.cpf = cpf;
        } else {
            System.out.println("CPF inválido!");
        }
    }

    public String getCpf() {
        return cpf;
    }

    public boolean validarCpf(String cpf) {
        String regex = "^(\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2})$";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(cpf);

        return matcher.find();
    } 
}
