package models;

import java.util.regex.Pattern;

public class Endereco {
    private String cep;
    private String rua;
    private String cidade;
    private String pais;

    public void setCep(String cep) {
        try {
            if(!validarCep(cep)) {
                throw new Exception("Insira um CEP válido!");
            }

            this.cep = cep;
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public String getCep() {
        return cep;
    }

    public boolean validarCep(String cep) {
        return Pattern.compile("\\d{5}-\\d{3}").matcher(cep).find();
    }

    public void setRua(String rua) {
        try {
            if(rua.isEmpty()) {
                throw new Exception("A rua não pode estar vazia!");
            }

            this.rua = rua;
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public String getRua() {
        return rua;
    }

    public void setCidade(String cidade) {
        try {
            if(cidade.isEmpty()) {
                throw new Exception("A cidade não pode estar vazia!");
            }

            this.cidade = cidade;
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public String getCidade() {
        return cidade;
    }

    public void setPais(String pais) {
        try {
            if(pais.isEmpty()) {
                throw new Exception("O país não pode estar vazia!");
            }

            this.pais = pais;
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public String getPais() {
        return pais;
    }
}
