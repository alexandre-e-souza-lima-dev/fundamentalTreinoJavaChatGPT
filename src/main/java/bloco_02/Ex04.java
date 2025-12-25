package bloco_02;

/**
 * The type Ex 04.
 */
/*
Comparação entre dois números. Objetivo Treinar:
Comparação entre valores Uso correto de if / else if / else
Leitura de condições mutuamente exclusivas
Enunciado
Crie uma classe chamada Ex04 dentro do pacote bloco_02. Declare:
duas variáveis int:
numero1
numero2
Implemente a lógica:
Se numero1 for maior que numero2, imprima:
O primeiro número é maior
Se numero2 for maior que numero1, imprima:
O segundo número é maior
Caso contrário, imprima:
Os dois números são iguais
Regras importantes
Use apenas if / else if / else
Não use operadores lógicos (&& ou ||)
Pense bem na ordem das comparaçõe
💡 Dica (não é código pronto)
Você só precisa de: >, <
else para o caso de igualdad
*/
public class Ex04 {

  /**
   * Rodar.
   */
  public static void rodar() {
    System.out.println("Rodando exercício 04!");
    System.out.println("IF / ELSE / ELSE IF");
    int numero1 = 1;
    int numero2 = 1;

    if (numero1 > numero2) {
      System.out.println("O primeiro número é maior");
    } else if (numero2 > numero1) {
      System.out.println("O segundo número é maior");
    } else {
      System.out.println("Os dois números são iguais");
    }
  }
}
