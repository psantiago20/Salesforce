package main.java.salesforce;

import java.util.Scanner;

//Desenvolva uma função que receba um vetor de 5 reais e retorne a soma dos
//elementos.
public class FuncaoDeCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] vetor = new double[5];
        int i;

        for(i = 0; i < 5; i++){
            System.out.println("Digite o valor para a posição " + (i + 1) + ": ");
            vetor[i] = scanner.nextDouble();
        }
        System.out.println("A soma dos valores no vetor é: " + somaVetor(vetor));
    }

    public static Double somaVetor(double[] v){
        int i;
        double soma = 0;

        for(i = 0; i < 5; i++){
            soma = soma + v[i];
        }
        return soma;
    }
}
