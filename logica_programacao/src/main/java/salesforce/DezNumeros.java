package main.java.salesforce;

import java.util.Scanner;

//Crie um algoritmo que leia 10 números inteiros e exiba a média deles.
public class DezNumeros {
    public static void main(String[] args) {

        //Serve para simplificar a inserção de dados
        Scanner scanner = new Scanner(System.in);

        int numeros = 10;
        //Na linguagem Java um vetor é uma "classe, portanto, deve-se utilizar o método new
        int[] v = new int[numeros];
        int i, soma = 0;

        for(i = 0; i < 10; i++){
            System.out.println("Digite o número " + (i + 1) + ": ");
            v[i] = scanner.nextInt();
            soma = soma + v[i];
        }

        double media = (double) soma / 10;

        System.out.println("A média dos números é: " + media);
    }
}
