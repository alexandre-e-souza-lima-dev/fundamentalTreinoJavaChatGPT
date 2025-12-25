package bloco_02;
/*
Operador ternário (? :) Objetivo Treinar:
Condição lógica simples
Leitura de expressões
Substituição de if / else simples
Enunciado
Crie uma classe chamada Ex05 dentro do pacote bloco_02.
Declare:
uma variável int idade
Implemente a lógica usando apenas operador ternário:
Se a idade for maior ou igual a 18, a mensagem deve ser:
Maior de idade
Caso contrário:
Menor de idade
Imprima o resultado no console.
Regras importantes
❌ Não use if
❌ Não use else
✔ Use apenas o operador ternário ? :
💡 Dica (sem entregar a resposta)
A estrutura é:
condicao ? valorSeVerdadeiro : valorSeFalso;
Você pode guardar o resultado em uma String e depois imprimir.
*/

/**
 * The type Ex 05.
 */
public class Ex05 {

  /**
   * Rodar.
   */
  public static void rodar() {
    System.out.println("Rodando exercício 05!");
    System.out.println("Operador ternário (? : )");
    int idade = 18;

    String maioridade = (idade >= 18) ? "Maior de idade" : "Menor de idade";
    System.out.println(maioridade);
  }
}
