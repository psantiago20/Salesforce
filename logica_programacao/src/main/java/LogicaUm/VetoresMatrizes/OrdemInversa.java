package main.java.LogicaUm.VetoresMatrizes;

import java.util.Scanner;

//Desenvolva um algoritmo que leia um vetor de 5 posições e exiba os elementos
//em ordem inversa.
public class OrdemInversa {
    public static void main(String[] args) {

        //Serve para simplificar a inserção de dados
        Scanner scanner = new Scanner(System.in);

        int n = 5;
        //Na linguagem Java um vetor é uma "classe, portanto, deve-se utilizar o método new
        int[] v = new int[n];
        int i;

        for(i = 0; i < 5; i++){
            System.out.println("Digite o valor para a posição " + (i + 1) + ": ");
            v[i] = scanner.nextInt();
        }
        System.out.println("Os valores em ordem inversa são: \n");

        for(i = 4; i >= 0; i--){
            System.out.println(v[i]);
        }

        scanner.close();
    }
}
