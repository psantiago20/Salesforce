package main.java.LogicaUm.Condicao;

import java.util.Scanner;

//Desenvolva um algoritmo que calcule a média de três notas e determine se o aluno
//está aprovado (média >= 6) ou reprovado (média < 6).
public class NovaMedia {
    public static void main(String[] args) {

        //Serve para simplificar a inserção de dados
        Scanner scanner = new Scanner(System.in);

        //Imprime o que será escrito para o usuário
        System.out.println("Digite a primeira nota: ");

        //Guarda o valor da primeira variável e passa para o próximo comando
        double nota1 = scanner.nextDouble();

        //Imprime o que será escrito para o usuário
        System.out.println("Digite a segunda nota: ");

        //Guarda o valor da segunda variável e passa para o próximo comando
        double nota2 = scanner.nextDouble();

        //Imprime o que será escrito para o usuário
        System.out.println("Digite a terceira nota: ");

        //Guarda o valor da terceira variável e passa para o próximo comando
        double nota3 = scanner.nextDouble();

        //calcula a media
        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println("Média: " + media);

        //verifca as condições de cada nota
        if(media >= 6){
            System.out.println("Aluno aprovado.");
        }
        else{
            System.out.println("Aluno reprovado.");
        }

        scanner.close();
    }
}
