package main.java.LogicaUm.FuncoesProcedimentos;

import java.util.Scanner;

//Crie uma função que receba um número inteiro e retorne seu fatorial.
public class Fatorial {
    public static void main(String[] args) {

        //Serve para simplificar a inserção de dados
        Scanner scanner = new Scanner(System.in);

        int num;

        //Imprime o que será escrito para o usuário
        System.out.println("Digite um número: ");

        //Guarda o valor da variável e passa para o próximo comando
        num = scanner.nextInt();

        System.out.println("O fatorial de " + num + " é: " + fatorial(num));

        //Fecha o comando scanner
        scanner.close();

    }

    //Cria uma função que faz o calculo fatorial e será chamada na main
    public static int fatorial(Integer n){
        int i, resultado = 1;

        for(i = 1; i <= n; i++){
            resultado = resultado * i;
        }
        return resultado;
    }
}
