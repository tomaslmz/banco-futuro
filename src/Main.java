import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import models.ContaFactory;
import models.ContaCorrente;

public class Main {

    public static boolean validarCpf(String cpf) {
        // String regex = "^(\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2})$";
        // Pattern pattern = Pattern.compile(regex);

        // Matcher matcher = pattern.matcher(cpf);

        // return matcher.find();

        return Pattern.compile("^(\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2})$").matcher(cpf).find();
    } 

    public static void main(String[] args) {
        System.out.println(validarCpf("153.801.479-3d3"));
    }
}