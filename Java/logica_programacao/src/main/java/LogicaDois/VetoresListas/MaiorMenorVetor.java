package main.java.LogicaDois.VetoresListas;

import java.util.Scanner;

//Leia um vetor de 5 elementos e exiba o maior e o menor elemento.
public class MaiorMenorVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] v = new int[5];
        for(int i= 0; i < v.length; i++){
            System.out.println("Digite o numero " + (i + 1) + ": ");
            v[i] = scanner.nextInt();
        }
        int maior = v[0];
        int menor = v[0];
        for(int i = 0; i < v.length; i++){
            if(v[i] > menor){
                maior = v[i];
            }
            if(v[i] < menor){
                menor = v[i];
            }
        }
        System.out.println("Numerio maior : " + maior);
        System.out.println("Numerio menor : " + menor);

        scanner.close();
    }
}