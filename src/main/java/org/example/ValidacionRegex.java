package org.example;
import java.util.regex.Pattern;

public class ValidacionRegex {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Proporciona una cadena de texto");
            return;
        }

        String input = args[0];

        String R1 = "\\bHola mundo\\b";
        String R2 = "(?i)\\bHola mundo\\b";
        String R3 = "\\b(Java|Python|Go|Pascal|Perl)\\b";
        String R4 = "^[a-zA-Z0-9._%+-]+@(unison\\.mx|uson\\.mx)$";
        String R5 = "^ISI\\d{4}-[12]\\.(txt|csv)$";

        String Regex = R1;  // Cambia a R1, R2, R3, R4 o R5 según lo que quieras probar

        Pattern pattern = Pattern.compile(Regex);

        boolean isMatch = pattern.matcher(input).matches();

        if (isMatch) {
            System.out.println("La cadena es válida.");
        } else {
            System.out.println("La cadena invalida.");
        }
    }
}