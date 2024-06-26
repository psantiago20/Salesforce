package main.java.LogicaDois.VetoresListas;

import java.util.Scanner;

//Leia um vetor de 5 elementos e exiba a soma de seus elementos
public class SomaVetor {
    public static void main(String[] args) {

        //Serve para simplificar a inserção de dados
        Scanner scanner = new Scanner(System.in);

        int n = 5;
        //Na linguagem Java um vetor é uma "classe, portanto, deve-se utilizar o método new
        int[] v = new int[n];
        int i, soma = 0;

        for(i = 0; i < n; i++){
            System.out.println("Digite o número " + (i + 1) + ": ");
            v[i] = scanner.nextInt();
            soma = soma + v[i];
        }

        System.out.println("A soma dos números é: " + soma);

        scanner.close();
    }
}
