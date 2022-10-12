package app;


import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int atletas, i;
        double som, count, countM, countH, porcentagem, peso, Mediap;
        som = 0;
        peso = 0;
        Mediap = 0;

        System.out.print("Qual a quantidade de atletas? ");
        atletas = sc.nextInt();
        sc.nextLine();
        //---------------------------------------------
        for( i = 1; i <= atletas; i++ ) {
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
            peso = sc.nextDouble();
            sc.nextLine();

           if (peso <= 0) {
                System.out.print("Valor invalido! Favor digitar um valor positivo:");
                peso = sc.nextDouble();
            } else {
               som = som + peso;
           }
        }

        System.out.println("\n");
        System.out.println("RELATÓRIO:");
        Mediap = som / atletas;
        System.out.printf("Peso médio dos atletas: %.2f\n" , Mediap);


        sc.close();
    }

}
