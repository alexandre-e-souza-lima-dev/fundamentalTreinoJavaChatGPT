package bloco_02;
/*
Contador com while Enunciado:
Crie a classe Ex09 no pacote bloco_02
Use um while para imprimir os números de 10 até 1
Saída esperada:
10
9
8
...
1
Regras:
✔ Use while
❌ Não use for
*/

/**
 * The type Ex 09.
 */
public class Ex09 {

  /**
   * Rodar.
   * Imprimir no console decrementando de 10 a 1.
   */
  public static void rodar() {
    System.out.println("Rodando exercício 09!");
    System.out.println("Contador com while");
    int contador = 10;

    while (contador >= 1) {
      System.out.println(contador);
      contador--;
    }
  }
}
