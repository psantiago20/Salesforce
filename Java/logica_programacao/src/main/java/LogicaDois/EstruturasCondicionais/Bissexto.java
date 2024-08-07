package main.java.LogicaDois.EstruturasCondicionais;

import java.util.Scanner;

//Leia um ano e verifique se ele é bissexto.
public class Bissexto {
    public static void main(String[] args) {

        //Serve para simplificar a inserção de dados
        Scanner scanner = new Scanner(System.in);

        //Imprime o que será escrito para o usuário
        System.out.println("Digite o ano para verificar se é bissexto: ");

        //Guarda o valor da primeira variável e passa para o próximo comando
        int ano = scanner.nextInt();

        if((ano % 4 == 0) && (ano % 100 != 0 || ano % 400 == 0)){
            System.out.println("O ano é bissexto!");
        }
        else {
            System.out.println("O ano não é bissexto!");
        }
        scanner.close();
    }
}
