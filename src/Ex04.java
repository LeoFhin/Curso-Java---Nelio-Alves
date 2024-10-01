/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais*/

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o número do Funcionário: ");
        int numero = sc.nextInt();

        System.out.println("Informe a quantidade de horas trabalhadas: ");
        int horasTrabalhadas = sc.nextInt();

        System.out.println("Informe o valor da hora: ");
        double valorHora = sc.nextDouble();

        double salario = horasTrabalhadas * valorHora;

        System.out.println("NUMBER: " + numero);
        System.out.println(String.format("SALARY: %.2f" , salario));

    }
}
