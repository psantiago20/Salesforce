package main.java.LogicaDois.Operadores;

import java.util.Scanner;

//Leia o raio de uma esfera e calcule o seu volume usando a fórmula:
//volume = (4/3) * π * raio³.
public class Raio {
    public static void main(String[] args) {

        //define o valor de PI com a biblioteca Math
        double pi = Math.PI;

        //Serve para simplificar a inserção de dados
        Scanner scanner = new Scanner(System.in);

        //Imprime o que será escrito para o usuário
        System.out.println("Digite o valor do raio: ");

        //Guarda o valor da primeira variável e passa para o próximo comando
        double raio = scanner.nextDouble();

        double raioExponencial = Math.pow(raio,3);

        double volume = (4.0 / 3.0) * pi * raioExponencial;

        //Imprime o resultado
        System.out.println("O volume da esfera é: " + volume);

        scanner.close();
    }
}
