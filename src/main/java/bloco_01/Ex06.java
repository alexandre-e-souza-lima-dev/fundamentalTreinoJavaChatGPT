package bloco_01;

/*
Cálculo Simples
Objetivo: usar variáveis para cálculo lógico.
Declare:
int anoNascimento
Considere o ano atual como 2025.
Calcule a idade.
Imprima o resultado.
*/

/**
 * The type Ex 06.
 */
public class Ex06 {

  /**
   * Rodar.
   */
  public static void rodar() {
    System.out.println("Rodando o exercício 06!");
    int anoAtual = 2025;
    int anoNascimento = 1994;

    System.out.println("Sua idade é de: "
        + (anoAtual - anoNascimento) + " anos.");
  }

}
