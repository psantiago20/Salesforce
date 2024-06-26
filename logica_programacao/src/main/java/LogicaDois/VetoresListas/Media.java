package main.java.LogicaDois.VetoresListas;

import java.util.Scanner;

//Leia uma lista de 5 elementos e exiba a média dos elementos
public class Media {
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

        double media = (double) soma / n;

        System.out.println("A média dos números é: " + media);

        scanner.close();
    }
}
