package main;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escolha uma opcao de calculo (1: Soma, 2: Subtracao, 3: Produto, 4: Divisao): ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Escolhido Soma");
                FazerCalculos.Soma();
                break;
            case 2:
                System.out.println("Escolhido Subtracao");
                FazerCalculos.Subtracao();
                break;
            case 3:
                System.out.println("Escolhido Produto");
                FazerCalculos.Produto();
                break;
            case 4:
                System.out.println("Escolhido Divisao");
                FazerCalculos.Divisao();
                break;
            default:
                System.out.println("Opcao invalida!");
                break;
        }
        scanner.close();
    }
}
