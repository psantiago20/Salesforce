package main.java.LogicaDois.Operadores;

import java.util.Scanner;

//Leia a temperatura em Celsius e converta para Fahrenheit usando a
//fórmula: fahrenheit = (celsius * 9/5) + 32.
public class Temperatura {
    public static void main(String[] args) {

        //Serve para simplificar a inserção de dados
        Scanner scanner = new Scanner(System.in);

        //Imprime o que será escrito para o usuário
        System.out.println("Digite a temperatura em ºCelsius: ");

        //Guarda o valor da primeira variável e passa para o próximo comando
        double temperatura = scanner.nextDouble();

        double fahrenheit = (temperatura * (9.0 / 5.0) + 32);

        //Imprime o resultado
        System.out.println("A temperatura " + temperatura + "ºC fica " + fahrenheit + "ºF");

        scanner.close();
    }
}
