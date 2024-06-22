package main.java.salesforce;

import java.util.Locale;
import java.util.Scanner;

//Crie um algoritmo que leia dois números inteiros e exiba a soma, subtração,
//multiplicação e divisão deles
public class Operadores {
    public static void main(String[] args) {

        //Serve para simplificar a inserção de dados
        Scanner scanner = new Scanner(System.in);

        //Imprime o que será escrito para o usuário
        System.out.println("Por favor digite o primeiro número: ");

        //Guarda o valor da primeira variável e passa para o próximo comando
        int num1 = scanner.nextInt();

        //Imprime o que será escrito para o usuário
        System.out.println("Por favor digite o segundo número: ");

        //Guarda o valor da segunda variável e passa para o próximo comando
        int num2 = scanner.nextInt();

        //Imprime o resultado
        System.out.println("Soma: " + (num1 + num2));
        System.out.println("Subtração: " + (num1 - num2));
        System.out.println("Multiplicação: " + (num1 * num2));
        System.out.println("Divisão: " + (num1 / num2));

        //Fecha o comando scanner
        scanner.close();
    }
}
