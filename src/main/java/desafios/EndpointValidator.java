package desafios;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EndpointValidator {
    public static String validateEndpoint(String endpoint) {

        // TODO: Verifique se o endpoint fornecido segue o formato padrão de endpoint de API:

        // Expressão regular para validar o endpoint
        String regex = "^/api/\\w+(/\\w+)*$";

        // Verifica se o endpoint corresponde à expressão regular
        if (Pattern.matches(regex, endpoint)) {
            return "Endpoint valido.";
        } else {
            return "Endpoint invalido.";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String endpoint = scanner.nextLine();
        System.out.println(validateEndpoint(endpoint));
    }
}
