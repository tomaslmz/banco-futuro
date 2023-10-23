package models;

import java.util.regex.Pattern;

public class Telefone {
    String telefone;

    public Telefone(String telefone) {
        setTelefone(telefone);
    }

    public Telefone() {
        
    }

    public void setTelefone(String telefone) {
        try {
            if(!validarTelefone(telefone)) {
                throw new Exception("O número de telefone deve ser válido!");
            }

            this.telefone = telefone;
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public String getTelefone() {
        return telefone;
    }

    public boolean validarTelefone(String telefone) {
        return Pattern.compile("^(?:(?:\\+|00)?(55)\\s?)?(?:(?:\\(?[1-9][0-9]\\)?)?\\s?)?(?((?:9\\d|[2-9])\\d{3})-?(\\d{4}))$").matcher(telefone).find();
    }
}
