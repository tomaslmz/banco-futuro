package models;

import java.util.regex.Pattern;

public class Email {
    String email;

    public Email(String email) {
        setEmail(email);
    }

    public Email() {

    }

    public void setEmail(String email) {
        try {
            if(!validarEmail(email)) {
                throw new Exception("O email deve ser válido!");
            }

            this.email = email;
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public String getEmail() {
        return email;
    }

    public boolean validarEmail(String email) {
        return Pattern.compile("^(.+)@(\\S+)$").matcher(email).find();
    }
}
