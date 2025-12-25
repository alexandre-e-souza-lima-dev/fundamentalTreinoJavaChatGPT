package bloco_02;
/*
Verificação de Maioridade (if / else)
Objetivo
Treinar:
comparação de valores
uso de if / else
lógica de decisão simples
Enunciado
Crie uma classe chamada Ex01 dentro do pacote bloco_02.
Declare:
uma variável int idade
Implemente a lógica:
se a idade for maior ou igual a 18, imprima:
Você é maior de idade
caso contrário, imprima:
Você é menor de idade
*/

/**
 * The type Ex 01.
 */
public class Ex01 {

  /**
   * Rodar.
   */
  public static void rodar() {
    System.out.println("Rodando exercício 01");
    System.out.println("IF / ELSE");
    int idade = 18;

    if (idade >= 18) {
      System.out.println("Você é maior de idade");
    } else {
      System.out.println("Você é menor de idade");
    }
  }
}
