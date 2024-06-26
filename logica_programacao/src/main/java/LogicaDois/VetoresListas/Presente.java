package main.java.LogicaDois.VetoresListas;

import java.util.Scanner;

//Leia um vetor de 5 elementos e um número N. Verifique se N está
//presente no vetor.
public class Presente {
    public static void main(String[] args) {

        //Serve para simplificar a inserção de dados
        Scanner scanner = new Scanner(System.in);

        int n = 5;
        //Na linguagem Java um vetor é uma "classe, portanto, deve-se utilizar o método new
        int[] v = new int[n];

        for(int i = 0; i < n; i++){
            System.out.println("Digite o número " + (i + 1) + ": ");
            v[i] = scanner.nextInt();
        }

        int num;
        boolean encontrado = false;

        System.out.println("Digite um número para ser encontrado: ");
        num = scanner.nextInt();

        for(int i = 0; i < n; i++){
            if(v[i] == num){
                encontrado = true;
                break;
            }
        }
        if(encontrado){
            System.out.println("O número " + num + " está presente no vetor.");
        }
        else {
            System.out.println("O número " + num + " não está presente no vetor.");
        }

        scanner.close();
    }
}
