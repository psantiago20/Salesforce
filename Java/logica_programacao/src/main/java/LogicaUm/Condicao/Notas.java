package main.java.LogicaUm.Condicao;

import java.util.Scanner;

//Crie um algoritmo que leia a nota de um aluno e exiba se ele foi aprovado (nota >=
//6) ou reprovado (nota < 6).
public class Notas {
    public static void main(String[] args) {

        //Serve para simplificar a inserção de dados
        Scanner scanner = new Scanner(System.in);

        //Imprime o que será escrito para o usuário
        System.out.println("Digite a nota do aluno: ");

        //Guarda o valor da primeira variável e passa para o próximo comando
        double nota = scanner.nextDouble();

        //verifica se a condição é verdadeira
        if(nota >= 6){
            System.out.println("Aluno aprovado.");
        }
        else{
            System.out.println("Aluno reprovado.");
        }
        scanner.close();
    }
}
