package main.java.LogicaDois.FuncoesProcedimentos;

import java.util.Scanner;

//Crie um procedimento que recebe um número como parâmetro e imprime
//um triângulo com esse número de linhas.
public class ImprimeTriangulo {
    public static void main(String[] args) {
        //Serve para simplificar a inserção de dados
        Scanner scanner = new Scanner(System.in);

        //Imprime o que será escrito para o usuário
        System.out.println("Digite o número de linhas do triângulo: ");

        //Guarda o valor da primeira variável e passa para o próximo comando
        int linha = scanner.nextInt();

        imprimirTriangulo(linha);

        scanner.close();
    }

    public static void imprimirTriangulo(Integer linha){
        for (int i = 1; i <= linha; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
