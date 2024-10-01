package Exercícios_Estrutura_Condicional;

import java.util.Scanner;

//Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
//Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
//ordem crescente ou decrescente
public class Ex03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        int A = sc.nextInt();
        System.out.println("Informe o segundo número: ");
        int B = sc.nextInt();

        if (A % B == 0 || B % A == 0){
            System.out.println("São Multiplos!");
        }
        else {
            System.out.println("Não são Multiplos!");
        }
    }
}
