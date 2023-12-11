package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;

        while (true) {
            System.out.println("Digite quantos números você irá inserir: ");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                break;
            }

            else {
                System.out.println("O número digitado precisa ser inteiro.");
                System.out.println("Por favor, digite a quantidade de números que você irá inserir: ");
                sc.next();
            }
        }

        double[] vect = new double[n];
        double highValue;
        int positionHighValue = 1;

        System.out.println("Digite um número: ");
        vect[0] = sc.nextDouble();
        highValue = vect[0];

        for(int i=1; i<vect.length; i++) {
            System.out.println("Digite um número: ");
            vect[i] = sc.nextDouble();

            if (vect[i] > highValue) {
                highValue = vect[i];
                positionHighValue = i + 1;
            }
        }

        System.out.println("MAIOR VALOR = "+ highValue);
        System.out.println("POSIÇÃO DO MAIOR VALOR = " + positionHighValue);

        sc.close();
    }
}
