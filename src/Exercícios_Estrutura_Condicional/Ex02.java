package Exercícios_Estrutura_Condicional;

import java.util.Scanner;

//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
public class Ex02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um Número: ");
        float num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println("Par!");
        }
        else {
            System.out.println("Impar!");
        }

    }
}
