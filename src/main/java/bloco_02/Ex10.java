package bloco_02;
/*
Executa ao menos uma vez. Enunciado:
Crie a classe Ex10 no pacote bloco_02
Use do while
Imprima no console:
Executou pelo menos uma vez
A condição deve ser falsa desde o início,
para provar que o do while executa ao menos uma vez.
Regras:
✔ Use do while
❌ Não use for nem while
*/

/**
 * The type Ex 10.
 */
public class Ex10 {

  /**
   * Rodar.
   * Imprimir no console ao menos uma vez, com condição falha.
   */
  public static void rodar() {
    System.out.println("Rodando exercício 10!");
    System.out.println("Exemplo de do while");
    int contador = 0;

    do {
      System.out.println("Executou pelo menos uma vez");
    } while (contador > 10);
      System.out.println(
          "O programa saiu do loop porque 0 não é maior que 10.");
  }
}
