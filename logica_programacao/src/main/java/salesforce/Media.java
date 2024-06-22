package main.java.salesforce;

import java.util.Scanner;

//Crie um algoritmo que leia três números inteiros e exiba a média deles
public class Media {
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

        //Imprime o que será escrito para o usuário
        System.out.println("Por favor digite o terceiro número: ");

        //Guarda o valor da primeira variável e passa para o próximo comando
        int num3 = scanner.nextInt();

        int media = (num1 + num2 + num3)/3;

        System.out.println("A média é: " + media);

        scanner.close();
    }
}
