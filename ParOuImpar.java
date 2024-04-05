import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // solicita ao usuário que digite um número inteiro
        System.out.println("Digite um número inteiro: ");

        int numero = scanner.nextInt();

        // verifica se o número é par ou ímpar
        if (numero % 2 == 0){
            System.out.println("Esse número é par!");
        } else {
            System.out.println("Esse número é ímpar!");
        }

        scanner.close();
    }
}