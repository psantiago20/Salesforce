package main.java.LogicaUm.Variaveis;

import java.util.Scanner;


//Faça um algoritmo que leia o nome, a idade e o salário de uma pessoa e exiba
//essas informações formatadas.
public class InformacoesPessoais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite o seu salário: ");
        double salario = scanner.nextDouble();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: R$" + salario);

        scanner.close();
    }
}
