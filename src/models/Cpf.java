package models;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Cpf {
    private String cpf;

    public Cpf(String cpf) {
        setCpf(cpf);
    }

    public void setCpf(String cpf) {
        try {
            if(!validarCpf(cpf)) {
                throw new Exception("O CPF deve ser válido!");
            }

            this.cpf = cpf;
        } catch(Exception e) {
            System.out.println(e.getMessage());
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
