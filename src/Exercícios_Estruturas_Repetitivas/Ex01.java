package Exercícios_Estruturas_Repetitivas;

//Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
//incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
//impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int senha = 2002;
        System.out.println("Informe a senha:");

        int inserirSenha = sc.nextInt();

        while (inserirSenha != senha){
            System.out.println("Senha incorreta, tente novamente!");
            inserirSenha = sc.nextInt();
        }

        System.out.println("Login efetuado!");
    }
}
