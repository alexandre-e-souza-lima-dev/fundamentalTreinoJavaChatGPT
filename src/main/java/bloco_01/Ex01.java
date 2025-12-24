package bloco_01;
/*
Exercício 1 — Primeiras Variáveis
Objetivo: aprender a declarar variáveis e imprimir valores.
Crie uma classe chamada Ex01.
Declare:
String nome
int idade
Atribua valores fixos.
Imprima no console:
nome: x
idade: y
*/
public class Ex01 {
  public static void rodar() {
    System.out.println("Rodando Exercício 01!");
    String nome = "Alex";
    int idade = 27;

    System.out.println("Meu nome é " + nome + " e tenho " + idade + " anos.");
  }
}
