package main;
import java.util.Scanner;

public class FazerCalculos {

    public static void Soma() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Escolha um numero inteiro: ");
        int a = scanner.nextInt();
        
        System.out.print("Escolha outro numero inteiro: ");
        int b = scanner.nextInt();
        
        int soma = a + b;
        System.out.println("Valor da soma: " + soma);
        
        scanner.close();
    }
    
    public static void Subtracao() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Escolha um numero inteiro: ");
        int a = scanner.nextInt();
        
        System.out.print("Escolha outro numero inteiro: ");
        int b = scanner.nextInt();
        
        int subtracao = a - b;
        System.out.println("Valor da soma: " + subtracao);
        
        scanner.close();
    }
    
    public static void Produto() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Escolha um numero inteiro: ");
        int a = scanner.nextInt();
        
        System.out.print("Escolha outro numero inteiro: ");
        int b = scanner.nextInt();
        
        int produto = a * b;
        System.out.println("Valor da soma: " + produto);
        
        scanner.close();
    }
    
    public static void Divisao() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Escolha um numero inteiro: ");
        int a = scanner.nextInt();
        
        System.out.print("Escolha outro numero inteiro: ");
        int b = scanner.nextInt();
        
        int divisao = a + b;
        System.out.println("Valor da soma: " + divisao);
        
        scanner.close();
    }
}