package main.java.LogicaDois.FuncoesProcedimentos;

import java.util.Scanner;

//Crie um procedimento que recebe uma mensagem como parâmetro e a
//exibe na tela.
public class Mensagem {
    public static void main(String[] args) {

        //Serve para simplificar a inserção de dados
        Scanner scanner = new Scanner(System.in);

        //Imprime o que será escrito para o usuário
        System.out.println("Digite uma letra de A até E e saiba o quanto você precisará estudar hoje: ");

        //Guarda o valor da primeira variável e passa para o próximo comando
        String letra = scanner.next();

        String m = letra.toUpperCase();

        System.out.println(mensagem(m));

        scanner.close();
    }

    public static String mensagem(String m){

        switch (m){
            case "A":{
                System.out.println("Hoje eu preciso estudar 5 horas!");
                break;
            }
            case "B":{
                System.out.println("Hoje eu preciso estudar 2 horas!");
                break;
            }
            case "C":{
                System.out.println("Hoje é dia de descanso!");
                break;
            }
            case "D":{
                System.out.println("Hoje eu preciso estudar 10 horas!");
                break;
            }
            case "E":{
                System.out.println("Pausa para um cafézinho!");
                break;
            }
        }
        return "Parabéns!(ou não ;p)";
    }
}
