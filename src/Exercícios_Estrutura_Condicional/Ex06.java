package Exercícios_Estrutura_Condicional;

import java.util.Scanner;

//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
//seguir, calcule e mostre o valor da conta a pagar. (usando switch case)
public class Ex06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double p1 = 4;
        double p2 = 4.5;
        double p3 = 5.0;
        double p4= 2;
        double p5 = 1.5;

        System.out.println("Informe o Código: ");
        int item = sc.nextInt();
        System.out.println("Informe a quantidade");
        int quantidade = sc.nextInt();
        double totalCompra = 0.0;

        switch (item){
            case 1:
                totalCompra = quantidade * p1;
                break;
            case 2:
                totalCompra = quantidade * p2;
                break;
            case 3:
                totalCompra = quantidade * p3;
                break;
            case 4:
                totalCompra = quantidade * p4;
                break;
            case 5:
                totalCompra = quantidade * p5;
                break;
            default:
                System.out.println("Código inválido!");
        }

        System.out.println(String.format("Total: R$ %.2f", totalCompra));
    }
}
