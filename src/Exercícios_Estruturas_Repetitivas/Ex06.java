package Exercícios_Estruturas_Repetitivas;

//Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
//de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
//conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
//peso 5.

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double p1 = 2;
        double p2 = 3;
        double p3 = 5;
        double somaPeso = 10;

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();
            double n3 = sc.nextDouble();

            double media = ((n1 * p1) + (n2 * p2) + (n3 * p3)) / somaPeso;

            System.out.printf("%.2f%n", media);
        }
    }
}