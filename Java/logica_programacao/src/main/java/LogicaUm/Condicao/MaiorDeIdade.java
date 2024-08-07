package main.java.LogicaUm.Condicao;

import java.util.Scanner;

//Desenvolva um algoritmo que leia a idade de uma pessoa e determine se ela é
//maior de idade (idade >= 18).
public class MaiorDeIdade {
    public static void main(String[] args) {

        //Serve para simplificar a inserção de dados
        Scanner scanner = new Scanner(System.in);

        //Imprime o que será escrito para o usuário
        System.out.println("Por favor digite a sua idade: ");

        //Guarda o valor da primeira variável e passa para o próximo comando
        int idade = scanner.nextInt();

        //verifica se a condição é verdadeira
        if(idade >= 18){
            System.out.println("Você é maior de idade.");
        }
        else{
            System.out.println("Você é menor de idade.");
        }
        scanner.close();
    }
}
