package main.java.salesforce;

import java.util.Scanner;

//Faça um algoritmo que leia três números e exiba se todos são iguais.
public class NumerosIguais {
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

        //Guarda o valor da terceira variável e passa para o próximo comando
        int num3 = scanner.nextInt();

        //verifica se a condição for verdadeira
        if(num1 == num2 && num1 == num3){
            System.out.println("Todos os números são iguais.");
        }
        else{
            System.out.println("Os números não são todos iguais.");
        }
        scanner.close();
    }
}
