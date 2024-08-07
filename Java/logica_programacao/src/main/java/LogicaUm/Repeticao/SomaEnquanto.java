package main.java.LogicaUm.Repeticao;

import java.util.Scanner;

//Faça um algoritmo que leia 5 números e exiba a soma deles usando a estrutura
//"enquanto".
public class SomaEnquanto {
    public static void main(String[] args) {

        //Serve para simplificar a inserção de dados
        Scanner scanner = new Scanner(System.in);

        int i = 1, num, soma = 0;

        //Enquanto os números digitados forem menor ou igual a 5, continue
        while (i <= 5){
            //i = quantidade de números digitados
            System.out.println("Digite o número " + i + ": ");
            num = scanner.nextInt();
            //Considera o valor da variável SOMA e soma com o número digitado, ficando este o novo valor
            soma = soma + num;
            i = i + 1;
        }
        System.out.println("A soma dos números é: " + soma);

        scanner.close();
    }
}
