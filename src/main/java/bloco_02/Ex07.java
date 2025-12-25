package bloco_02;
/*
Agora vamos treinar decisão múltipla limpa,
muito usada em menus, opções e fluxos.
Ex07 — Menu de Opções (switch) Enunciado:
Crie a classe Ex07 no pacote bloco_02
Declare:
int opcao
Use switch para:
1 → "Cadastrar usuário"
2 → "Listar usuários"
3 → "Sair"
qualquer outro valor → "Opção inválida"
Regras:
✔ Use switch
✔ Use break
❌ Não use if
*/

/**
 * The type Ex 07.
 */
public class Ex07 {

  /**
   * Rodar.
   */
  public static void rodar() {
    System.out.println("Rodando exercício 07!");
    System.out.println("(switch / case)");
    int opcao = 0;

    switch (opcao) {
      case 1 -> System.out.println("Cadastrar usuário");
      case 2 -> System.out.println("Listar usuários");
      case 3 -> System.out.println("Sair");
      default -> System.out.println("Opção inválida");
    }
  }
}
