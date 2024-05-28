import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean adicionarNovoAluno = true;

        while (adicionarNovoAluno) {
            System.out.print("Digite o nome do aluno: ");
            String nomeAluno = scanner.nextLine();

            System.out.println("Digite a primeira nota: ");
            double nota1 = scanner.nextDouble();

            System.out.println("Digite a segunda nota: ");
            double nota2 = scanner.nextDouble();

            System.out.println("Digite a terceira nota: ");
            double nota3 = scanner.nextDouble();

            System.out.println("Digite a quarta nota: ");
            double nota4 = scanner.nextDouble();

            double media = (nota1 + nota2 + nota3 + nota4) / 4;

            if (media >= 7) {
                System.out.println(nomeAluno + ", você está aprovado com média " + media);
            } else if (media >= 5) {
                System.out.println(nomeAluno + ", você está em recuperação com média " + media);
            } else {
                System.out.println(nomeAluno + ", você está reprovado com média " + media);
            }

            System.out.print("Deseja adicionar outro aluno? (S/N): ");
            String resposta = scanner.next();
            adicionarNovoAluno = resposta.equalsIgnoreCase("S") || resposta.equalsIgnoreCase("s")|| resposta.equalsIgnoreCase("sim");
            scanner.nextLine(); // Consumir a quebra de linha após a resposta
        }

        System.out.println("Encerrando o programa. Obrigado!");
    }
}
