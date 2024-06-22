package main.java.salesforce;

import java.util.Scanner;

//Crie um algoritmo que leia dois números e exiba se o primeiro é maior, menor ou
//igual ao segundo.
public class NumeroMaior {
    public static void main(String[] args) {
        //Serve para simplificar a inserção de dados
        Scanner scanner = new Scanner(System.in);

        //Imprime o que será escrito para o usuário
        System.out.println("Por favor digite o primeiro número: ");

        //Guarda o valor da primeira variável e passa para o próximo comando
        int num1 = scanner.nextInt();

        //Imprime o que será escrito para o usuário
        System.out.println("Por favor digite o segundo número: ");

        //Guarda o valor da primeira variável e passa para o próximo comando
        int num2 = scanner.nextInt();

        if(num1 > num2){
            System.out.println("O primeiro número é maior que o segundo.");
        } else if (num1 < num2) {
            System.out.println("O segundo número é maior que o primeiro.");
        }
        else{
            System.out.println("Os dois números são iguais.");
        }
        scanner.close();
    }
}
