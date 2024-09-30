package questao2;

import java.util.Scanner;

public class Main {

    public static boolean pertenceFibonacci(int numero) {
        int a = 0;
        int b = 1;

        if(numero == 0 || numero == 1) {
            return true;
        }

        while(b < numero) {
            int proximo = a + b;
            a = b;
            b = proximo;
        }
        return b == numero;
    }

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int numero = input.nextInt();

        if(pertenceFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence a sequência de Fibonacci");
        } else{
            System.out.println("O número " + numero + " não pertence a sequência de Fibonacci");
        }
    }
}