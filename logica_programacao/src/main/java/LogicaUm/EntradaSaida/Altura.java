package main.java.LogicaUm.EntradaSaida;

import java.util.Scanner;

//Faça um algoritmo que leia o nome e a altura de uma pessoa e exiba uma
//mensagem dizendo "Nome, você tem X metros de altura".
public class Altura {
    public static void main(String[] args) {
        //Serve para simplificar a inserção de dados
        Scanner scanner = new Scanner(System.in);

        //Imprime o que será escrito para o usuário
        System.out.println("Por favor digite o seu nome: ");

        //Guarda o valor da primeira variável e passa para o próximo comando
        String nome = scanner.next();

        //Imprime o que será escrito para o usuário
        System.out.println("Por favor digite a sua altura em metros: ");

        //Guarda o valor da segunda variável e passa para o próximo comando
        double altura = scanner.nextDouble();

        //Imprime o resultado
        System.out.println(nome + ", você tem " + altura + " metros de altura.");

        scanner.close();
    }
}
