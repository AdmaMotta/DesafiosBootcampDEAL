package desafios;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ConsultaFuncionarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        Map<String, List<FuncionarioX>> departamentoFuncionarios = new HashMap<>();

        // Le os dados dos funcionarios
        for (int i = 0; i < n; i++) {
            String nome = scanner.nextLine();
            String departamento = scanner.nextLine();
            double salario = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline

            // TODO: Adicionar o funcionario ao departamento correspondente
            // Use o metodo computeIfAbsent para obter a lista do departamento e adicionar o funcionário a essa lista.
            departamentoFuncionarios.computeIfAbsent(departamento, k -> new LinkedList<>()).add(new FuncionarioX(nome, salario));
        }
        String departamentoConsulta = scanner.nextLine();

        List<FuncionarioX> funcionarios = departamentoFuncionarios.getOrDefault(departamentoConsulta, new LinkedList<>());
        for (FuncionarioX f : funcionarios) {
            System.out.printf("Nome: %s - Salario: %.2f\n", f.nome, f.salario);
        }

        scanner.close();
    }
}

class FuncionarioX {
    String nome;
    double salario;

    FuncionarioX(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
}
