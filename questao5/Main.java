package questao5;

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        boolean cont = true;

        while(cont) {

            System.out.println("1- Inverter palavra\n" +
                               "2- Sair");

            System.out.println("Informe uma opção: ");
            int opcao = input.nextInt();
            input.nextLine();

            switch(opcao) {
                case 1:
                    System.out.println("Informe uma palavra: ");
                    String palavra = input.nextLine();

                    String palavraInvertida = "";

                    for(int i = palavra.length() - 1; i>=0; i--) {
                        palavraInvertida += palavra.charAt(i);
                    }

                    System.out.println("A palavra invertida é: " + palavraInvertida);

                break;

                case 2:
                   cont = false;
                   break;
            }
        }
    }
}