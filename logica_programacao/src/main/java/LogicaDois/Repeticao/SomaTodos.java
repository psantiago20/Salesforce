package main.java.LogicaDois.Repeticao;

import java.util.Scanner;

//Leia um número N e exiba a soma de todos os números de 1 a N.
public class SomaTodos {
    public static void main(String[] args) {

        int i = 1;
        int num, soma = 0;

        //Serve para simplificar a inserção de dados
        Scanner scanner = new Scanner(System.in);

        //Imprime o que será escrito para o usuário
        System.out.println("Digite quantos números serão calculados: ");

        //Guarda o valor da primeira variável e passa para o próximo comando
        int n = scanner.nextInt();

        //Enquanto os números digitados forem menor ou igual a N, continue
        while (i <= n){
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
