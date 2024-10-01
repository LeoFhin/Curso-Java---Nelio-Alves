package Exercícios_Estrutura_Condicional;

import java.util.Scanner;

//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
public class Ex01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int num = sc.nextInt();

        if (num >= 0){
            System.out.println("Número Positivo!");
        }
        else {
            System.out.println("Número Negativo!");
        }
        sc.close();
    }
}
