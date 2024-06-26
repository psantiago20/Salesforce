package main.java.LogicaDois.Repeticao;

import java.util.Scanner;

//Leia um número N e exiba a tabuada de 1 a 10 desse número.
public class TabuadaDez {
    public static void main(String[] args) {

        //Serve para simplificar a inserção de dados
        Scanner scanner = new Scanner(System.in);

        //Imprime o que será escrito para o usuário
        System.out.println("Digite qual número será multiplicado: ");

        //Guarda o valor da primeira variável e passa para o próximo comando
        int n = scanner.nextInt();

        int i;

        //a cada iteração verifica o valor de i e gera i+1
        for(i = 1; i <= 10; i ++){
            //multiplica o número de acordo com a tabuada de 1 a 10
            System.out.println(n + " x " + i + " = " + (n * i));
        }
        scanner.close();
    }
}
