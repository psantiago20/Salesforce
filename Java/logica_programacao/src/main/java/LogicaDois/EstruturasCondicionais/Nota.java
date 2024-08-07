package main.java.LogicaDois.EstruturasCondicionais;

import java.util.Scanner;

//Leia a nota de um aluno e exiba o conceito (A, B, C, D, E) de acordo com
//a tabela:
//|  A    |  B  |   C  |   D  |  E
//|90-100 |80-89| 70-79| 60-69| 0-59
public class Nota {
    public static void main(String[] args) {

        //Serve para simplificar a inserção de dados
        Scanner scanner = new Scanner(System.in);

        //Imprime o que será escrito para o usuário
        System.out.println("Digite a nota do aluno(0-100): ");

        //Guarda o valor da primeira variável e passa para o próximo comando
        int nota = scanner.nextInt();

        if(nota>=90){
            System.out.println("A nota é A");
        } else if (nota >=80) {
            System.out.println("A nota é B");
        } else if (nota >=70) {
            System.out.println("A nota é C");
        } else if (nota >=60) {
            System.out.println("A nota é D");
        }
        else {
            System.out.println("A nota é E");
        }
        scanner.close();
    }
}
