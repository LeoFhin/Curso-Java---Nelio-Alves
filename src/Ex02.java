/*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.

Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159*/
import java.util.Scanner;
public class Ex02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double pi = 3.14159;

        System.out.println("Informe o raio: ");
        double raio = sc.nextDouble();

        double area = pi * (raio * raio);

        System.out.println(String.format("%.4f", area));
    }
}
