package main.java.LogicaDois.Repeticao;

import java.util.Scanner;

//Leia um número N e exiba o fatorial de N
public class Fatorial {
    public static void main(String[] args) {

        //Serve para simplificar a inserção de dados
        Scanner scanner = new Scanner(System.in);

        int n;

        //Imprime o que será escrito para o usuário
        System.out.println("Digite um número: ");

        //Guarda o valor da variável e passa para o próximo comando
        n = scanner.nextInt();

        int i, fatorial = 1;

        for(i = 1; i <= n; i++){
            fatorial = fatorial * i;
        }

        System.out.println("O fatorial de " + n + " é: " + fatorial);

        //Fecha o comando scanner
        scanner.close();

    }

}
