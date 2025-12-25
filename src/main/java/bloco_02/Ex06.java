package bloco_02;
/*
Verificação de Nota (if / else if / else)
Objetivo
Treinar:
- múltiplas condições
- uso de if / else if / else
- lógica encadeada
Enunciado
Crie uma classe chamada Ex06 dentro do pacote bloco_02.
Declare:
- uma variável double nota
Implemente a lógica:
- se a nota for maior ou igual a 7.0, imprima:
  Aprovado
- se a nota for maior ou igual a 5.0 e menor que 7.0, imprima:
  Recuperação
- caso contrário, imprima:
  Reprovado
*/

/**
 * The type Ex 06.
 */
public class Ex06 {

  /**
   * Rodar.
   */
  public static void rodar() {
    System.out.println("Rodando exercício 06!");
    System.out.println(
        "múltiplas condições - uso de if / else if / else - lógica encadeada"
    );
    double nota = 4.9;

    if (nota >= 7) {
      System.out.println("Aprovado");
    } else if (nota >= 5) {
      System.out.println("Recuperação");
    } else {
      System.out.println("Reprovado");
    }
  }
}
