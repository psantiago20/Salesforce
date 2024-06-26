package main.java.LogicaDois.FuncoesProcedimentos;

import java.util.Scanner;

//Crie uma função que recebe dois números como parâmetros e retorna a
//potência do primeiro número elevado ao segundo.
public class Potencia {
    public static void main(String[] args) {
        //Serve para simplificar a inserção de dados
        Scanner scanner = new Scanner(System.in);

        //Imprime o que será escrito para o usuário
        System.out.println("Digite o primeiro número: ");

        //Guarda o valor da primeira variável e passa para o próximo comando
        double num1 = scanner.nextDouble();

        //Imprime o que será escrito para o usuário
        System.out.println("Digite o segundo número: ");

        //Guarda o valor da segunda variável e passa para o próximo comando
        double num2 = scanner.nextDouble();

        System.out.println("A potência de " + num1 + " elevado a " + num2 + " é: " + potencia(num1,num2));

        scanner.close();
    }

    public static double potencia(Double num1, Double num2){
        return Math.pow(num1, num2);
    }

}
