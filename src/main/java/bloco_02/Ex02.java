package bloco_02;
/*
Objetivo Treinar:
uso de if / else if / else
comparação por faixas de valores
leitura sequencial de condições
Enunciado
Crie uma classe chamada Ex02 dentro do pacote bloco_02.
Declare:
uma variável int nota
Implemente a lógica:
se a nota for maior ou igual a 7, imprima:
Aprovado
se a nota for maior ou igual a 5 e menor que 7, imprima:
Recuperação
caso contrário, imprima:
Reprovado
*/

/**
 * The type Ex 02.
 */
public class Ex02 {

  /**
   * Rodar.
   */
  public static void rodar() {
    System.out.println("Rodando exercício 02!");
    System.out.println("IF / ELSE / ELSE IF");
    int nota = 5;

    if (nota >= 7) {
      System.out.println("Aprovado");
    } else if (nota >= 5 && nota < 7) {
      System.out.println("Recuperação");
    } else {
      System.out.println("Reprovado");
    }
  }
}
