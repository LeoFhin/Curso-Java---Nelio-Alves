package Exercícios_Estrutura_Condicional;

import java.util.Scanner;
//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
//seguir, calcule e mostre o valor da conta a pagar.


public class Ex05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cod1 = 1;
        int cod2 = 2;
        int cod3 = 3;
        int cod4 = 4;
        int cod5 = 5;

        double p1 = 4;
        double p2 = 4.5;
        double p3 = 5.0;
        double p4= 2;
        double p5 = 1.5;

        double valorTotal = 0.0;

        System.out.println("Informe o código do item:");
        int codigo = sc.nextInt();
        System.out.println("Informe a quantidade:");
        float quantidade = sc.nextInt();

        if (codigo == cod1){
            valorTotal = quantidade * p1;
        } else if (codigo == cod2){
            valorTotal = quantidade * p2;
        } else if (codigo == cod3) {
            valorTotal = quantidade * p3;
        } else if (codigo == cod4) {
            valorTotal = quantidade * p4;
        } else if (codigo == cod5) {
            valorTotal = quantidade * p5;
        } else {
            System.out.println("Código inválido!");
        }

        System.out.println(String.format("Total: R$ %.2f", valorTotal));
    }
}
