package app;


import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int atletas, i;
        double som, countAlturaM, countM, countH, porcentagemH, peso, alturaMediaM, Mediap, greatestHeight, altura;
        String tallestAthlete = null;

        countAlturaM = 0;
        altura = 0;
        alturaMediaM = 0;
        countM = 0;
        porcentagemH = 0;
        countH = 0;
        greatestHeight = 0;
        som = 0;
        peso = 0;
        Mediap = 0;

        System.out.print("Qual a quantidade de atletas? ");
        atletas = sc.nextInt();
        sc.nextLine();

        for (i = 1; i <= atletas; i++) {
            System.out.print("Digite os dados do atleta numero " + i + ":\n");
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("sexo: ");
            char sexo = sc.next().charAt(0);
            while (sexo != 'F' && sexo != 'M') {
                System.out.print("Valor invalido! Favor digitar F ou M :");
                sexo = sc.next().charAt(0);
            }
            if (sexo == 'M') {
                countH += +1;
                porcentagemH = 100.0 * countH / atletas;
            }

            System.out.print("altura: ");
            altura = sc.nextDouble();

            while (altura <= 0) {
                System.out.print("Valor invalido! Favor digitar um valor positivo :");
                altura = sc.nextDouble();
            }
            if (altura > greatestHeight) {
                greatestHeight = altura;
                tallestAthlete = nome;
            }

            if (sexo == 'F') {
                countAlturaM += altura;
                countM += +1;
                alturaMediaM = countAlturaM / countM;
            }

            System.out.print("Peso: ");
            peso = sc.nextDouble();
            sc.nextLine();

            while (peso <= 0) {
                System.out.print("Valor invalido! Favor digitar um valor positivo:");
                peso = sc.nextDouble();
            }
            if (peso > 0) {
                som = som + peso;
                Mediap = som / atletas;
            }
        }

        System.out.println("\n");
        System.out.println("RELATÓRIO:");
        System.out.printf("Peso médio dos atletas: %.2f\n", Mediap);
        System.out.println("Atleta mais alto: " + tallestAthlete);
        System.out.printf("Porcentagem de homens: %.1f %%%n", porcentagemH);

        if (countM == 0) {
            System.out.println("Não há mulheres cadastradas ");
        } else {
            System.out.printf("Altura média das mulheres: %.2f\n ", alturaMediaM);
        }
        
        sc.close();
    }
}