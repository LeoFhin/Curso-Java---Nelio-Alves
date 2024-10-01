package Exercícios_Estrutura_Sequencial;/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.*/


import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o código da peça 01: ");
        int peça1 = sc.nextInt();

        System.out.println("Informe o número de peças: ");
        int numPeca = sc.nextInt();

        System.out.println("informe o valor da peça: ");
        double valorPeca = sc.nextDouble();

        double totalCompra01 = numPeca * valorPeca;

        System.out.println("Informe o código da peça 02: ");
        int peça2 = sc.nextInt();

        System.out.println("Informe o número de peças: ");
        int numPeca2 = sc.nextInt();

        System.out.println("informe o valor da peça: ");
        double valorPeca2 = sc.nextDouble();

        double totalCompra02 = numPeca2 * valorPeca2;

        double totalCompraGeral = totalCompra01 + totalCompra02;

        System.out.println(String.format("VALOR A PAGAR %.2f" , totalCompraGeral));
    }
}
