package bloco_02;
/*
Verificação de Número Positivo, Negativo ou Zero. Objetivo Treinar:
if / else if / else comparação com zero
leitura correta da ordem das condições lógica mutuamente exclusiva
Enunciado
Crie uma classe chamada Ex03 dentro do pacote bloco_02.
Declare:
uma variável int numero
Implemente a lógica:
Se o número for maior que zero, imprima:
Número positivo
Se o número for menor que zero, imprima:
Número negativo
Caso contrário, imprima:
Número é zero
Regras importantes (leia antes de codar)
Use apenas if / else if / else
Não use operadores lógicos (&& ou ||)
Pense na ordem correta das condições
*/

/**
 * The type Ex 03.
 */
public class Ex03 {

  /**
   * Rodar.
   */
  public static void rodar() {
    System.out.println("Rodando exercício 03!");
    System.out.println("IF / ELSE / ELSE IF");
    int numero = 0;

    if (numero > 0) {
      System.out.println("Número positivo");
    } else if (numero < 0) {
      System.out.println("Número negativo");
    } else {
      System.out.println("Número é zero");
    }
  }
}
