package Exercícios_Estruturas_Repetitivas;

//Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
//um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
//4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
//que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
//mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível.

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int gasolina = 0;
        int alcool = 0;
        int diesel = 0;

        System.out.println("Dígite 1: Alcool" +
                "Dígite 2: Gasolina" +
                "Dígite 3: Diesel" +
                "Digite 4: Sair");

        int entrada = sc.nextInt();

        while (entrada != 4){
            if (entrada == 1){
                System.out.println("Você escolheu Gasolina!");
                gasolina += 1;
            }
            else if (entrada == 2) {
                System.out.println("Voce escolheu Alcool!");
                alcool += 1;
            }
            else if (entrada == 3) {
                System.out.println("Você escolheu Diesel!");
                diesel += 1;
            }
            else {
                System.out.println("Entrada Ínvada!" + "Informe uma opção válida:");
            }

            System.out.println("Dígite 1: Alcool" +
                    "Dígite 2: Gasolina" +
                    "Dígite 3: Diesel" +
                    "Digite 4: Sair");

            entrada = sc.nextInt();
        }
        System.out.println("Muito Obrigado!");
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Alcool: " + alcool);
        System.out.println("Diesel: " + diesel);
    }

}
