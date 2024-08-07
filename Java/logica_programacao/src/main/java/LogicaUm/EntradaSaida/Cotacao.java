package main.java.LogicaUm.EntradaSaida;

import java.util.Scanner;

//Desenvolva um algoritmo que leia um valor em reais e a cotação do dólar, e exiba
//o valor convertido para dólares.
public class Cotacao {
    public static void main(String[] args) {
        //Serve para simplificar a inserção de dados
        Scanner scanner = new Scanner(System.in);

        //Imprime o que será escrito para o usuário
        System.out.println("Digite o valor em reais: ");

        //Guarda o valor da primeira variável e passa para o próximo comando
        double reais = scanner.nextDouble();

        //Imprime o que será escrito para o usuário
        //Cotação em 21/06/2024 - US$ 1 = R$ 5,44.
        System.out.println("Digite a cotação do dólar: ");

        //Guarda o valor da primeira variável e passa para o próximo comando
        double cotacao = scanner.nextDouble();

        //Variável que calcula a cotação
        double dolares = reais / cotacao;

        //Imprime o resultado
        System.out.println("\"O valor em dólares US$: " + dolares);

        scanner.close();
    }
}
