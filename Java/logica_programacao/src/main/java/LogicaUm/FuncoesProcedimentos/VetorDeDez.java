package main.java.LogicaUm.FuncoesProcedimentos;

import java.util.Scanner;

//Faça um procedimento que receba um vetor de 10 inteiros e exiba os valores na
//tela.
public class VetorDeDez {
    public static void main(String[] args) {
        //Serve para simplificar a inserção de dados
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[10];
        int i;

        for(i = 0; i < 10; i++){
            System.out.println("Digite o valor para a posição " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }
        exibirVetor(vetor);

        scanner.close();
    }

    public static Integer exibirVetor(int[] v){
        int i;

        for(i = 0; i < 10; i++){
            System.out.println("Valor na posição " + (i + 1) + ": " + v[i]);
        }
        return 0;
    }

}
