package main.java.salesforce;

import java.util.Scanner;

//Faça um algoritmo que leia três números e exiba o maior deles.
public class MaiorNumero {
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

        //define um valor padrão para a variável
        int maior = num1;

        //verifica qual é o maior número
        if(num2 > maior){
            maior = num2;
        }
        if (num3 > maior) {
            maior = num3;
        }
            System.out.println("O maior número é: " + maior);
    }
}
