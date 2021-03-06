import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int opcao = 0;
		String valor;
		int posicao;
		Lista lista = new Lista();

		System.out.println("Sistema em JAVA para testar a execução de uma lista estática,\n");

		do {
			try {
				System.out.println(
						"\nDigite: " + "\n1. Inserir no inicio" + "\n2. Inserir no fim" + "\n3. Inserir em uma posicao"
								+ "\n4. Tamaho" + "\n5. Listar" + "\n6. Remover elemento" + "\n9 Sair");

				Scanner scanner = new Scanner(System.in);
				opcao = scanner.nextInt();
				scanner.nextLine();

				switch (opcao) {
				case 1:
					System.out.print("Digite um valor para inserir no inicio.: ");
					valor = scanner.nextLine();
					lista.insereNoInicio(valor);
					break;
				case 2:
					System.out.println("Digite um valor para inserir no fim: ");
					valor = scanner.nextLine();
					lista.insereNoFim(valor);
					break;
				case 3:
					System.out.print("Digite um valor para inserir:");
					valor = scanner.nextLine();
					System.out.print("Digite a posiçao: ");
					posicao = scanner.nextInt();
					scanner.nextLine();
					lista.insereNaPosicao(posicao, valor);
					break;
				case 4:
					System.out.println("Tamanho da lista " + lista.tamanho());
					break;
				case 5:
					lista.imprimeLista();
					break;
				case 6:
					System.out.println("Digite a posiçao que deseja remover: ");
					posicao = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Removido: " + lista.removeDaPosicao(posicao));
					break;
				case 9:
					System.out.println("Saindo do sistema.");
					break;

				default:
					System.out.println("Opção inválida.");
					break;
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (opcao != 9);

	}

}