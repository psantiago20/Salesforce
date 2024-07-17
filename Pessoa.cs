using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace C_Sharp
{
    public class Pessoa
    {
        public string Nome;
        public int Idade;

        public Pessoa(string nome, int idade){
            Nome = nome;
            Idade = idade;
        }

        public void MostrarInformacoes()
        {
            Console.WriteLine("Nome: " + Nome);
            Console.WriteLine("Idade: " + Idade);
        }
    }

    class Program
    {
        static void Main(){
            Pessoa pessoa1 = new Pessoa("Maria", 30);

            pessoa1.MostrarInformacoes();
        }
    }
}