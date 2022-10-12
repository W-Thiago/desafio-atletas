package app;


import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a quantidade de atletas? ");
        int atletas = sc.nextInt();
        double som = 0;
        sc.nextLine();
        //---------------------------------------------
        for(int i = 1; i <= atletas; i++ ) {
            //---------------------------------------------
            System.out.print("Digite os dados do atleta numero " + i + ":\n");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            //---------------------------------------------

            System.out.print("sexo: ");
            char sexo =sc.next().charAt(0);
            while (sexo != 'F' && sexo != 'M') {
                System.out.println("Valor invalido! Favor digitar F ou M:");
                sexo = sc.next().charAt(0);
            }
            //---------------------------------------------
            System.out.print("altura: ");
            double altura = sc.nextDouble();

            while (altura <= 0) {
                System.out.print("Valor invalido! Favor digitar um valor positivo:");
                altura = sc.nextDouble();
            }

            //---------------------------------------------
            System.out.print("Peso: ");
            double peso = sc.nextDouble();
            sc.nextLine();

            while (peso <= 0) {
                System.out.print("Valor invalido! Favor digitar um valor positivo:");
                peso = sc.nextDouble();
            }
        }





        sc.close();
    }

}
