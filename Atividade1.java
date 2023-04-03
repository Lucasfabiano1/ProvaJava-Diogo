package Atividade;

import java.util.Scanner;

public class Atividade1 {
    Scanner sc = new Scanner(System.in);

    public void Exer1() {
        System.out.println("Digite 1 para feminino e 2 para masculino");
        int sexo = sc.nextInt();
        System.out.println("Informe sua altura");
        double altura = sc.nextDouble();
        System.out.println("Informe seu peso atual");
        double peso = sc.nextDouble();
        double pesoideal;

        if (sexo == 1) {
            pesoideal = (peso * altura) - 58;
            System.out.println("O seu peso ideal deve ser de: " + pesoideal + "KG");
        }
        if (sexo == 2) {
            pesoideal = (peso * altura) - 44.7;
            System.out.println("O seu peso ideal deve ser de: " + pesoideal + "KG");

        }
        System.out.println("Informe seu peso");
        double pesoIMC = sc.nextDouble();
        System.out.println("Informe seu altura");
        double alturaIMC = sc.nextDouble();
        double IMC = pesoIMC / alturaIMC * alturaIMC;
        System.out.println("Informe sua idade de 1 (16 a 25) 2 (25 a 35), 3(36 a 45), 4(46 a 55), 5(56 a 65) e 5(66+)");
        int idade = sc.nextInt();

        if (IMC < 20 && idade == 1) {
            System.out.println("Recomenda-se a prática de Luta");
        }
        if (IMC < 20 && idade == 2) {
            System.out.println("Recomenda-se a prática de Musculação intensa ou luta");
        }
        if (IMC < 20 && idade == 3) {
            System.out.println("Recomenda-se a prática de Musculação intensa");
        }
        if (IMC < 20 && idade == 4) {
            System.out.println("Recomenda-se a prática de Luta ou Pilates");
        }
        if (IMC < 20 && idade == 5) {
            System.out.println("Recomenda-se a prática de Pilates");
        }
        if (IMC < 20 && idade == 6) {
            System.out.println("Recomenda-se a prática de Pilates");
        }
        if (IMC >= 20 && IMC <= 27 && idade == 1) {
            System.out.println("Recomenda-se a prática de Musculação moderada e dança");
        }
        if (IMC >= 20 && IMC <= 27 && idade == 2) {
            System.out.println("Recomenda-se a prática de Musculação moderada, dança ou corrida");
        }
        if (IMC >= 20 && IMC <= 27 && idade == 3) {
            System.out.println("Recomenda-se a prática de Musculação moderada, dança ou corrida");
        }
        if (IMC >= 20 && IMC <= 27 && idade == 4) {
            System.out.println("Recomenda-se a prática de Musculação moderada, dança ou corrida");
        }
        if (IMC >= 20 && IMC <= 27 && idade == 5) {
            System.out.println("Recomenda-se a prática de Dança ou corrida");
        }
        if (IMC >= 20 && IMC <= 27 && idade == 6) {
            System.out.println("Recomenda-se a prática de Dança");
        }
        if (IMC > 20 && idade == 1) {
            System.out.println("Recomenda-se a prática de Musculação leve ou ioga");
        }
        if (IMC > 20 && idade == 2) {
            System.out.println("Recomenda-se a prática de Ioga");
        }
        if (IMC > 20 && idade == 3) {
            System.out.println("Recomenda-se a prática de Ioga");
        }
        if (IMC > 20 && idade == 4) {
            System.out.println("Recomenda-se a prática de Musculação leve ou ioga");
        }
        if (IMC > 20 && idade == 5) {
            System.out.println("Recomenda-se a prática de Musculação leve ou ioga");
        }
        if (IMC > 20 && idade == 6) {
            System.out.println("Recomenda-se a prática de Musculação leve ou ioga");
        }
    }
}
