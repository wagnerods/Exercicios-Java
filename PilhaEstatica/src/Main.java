import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int opcao = 0;
		String valor;

		Pilha pilha = new Pilha();

		do {
			try {
				System.out.println("\n\n Escolha: " + "\n 1-> empilha" + "\n 2-> desempilha" + "\n 3-> topo"
						+ "\n 4-> tamanho" + "\n 5-> sair");

				Scanner read = new Scanner(System.in);
				opcao = read.nextInt();
				read.nextLine();

				switch (opcao) {
				case 1:
					System.out.print(">>Digite o valor que deseja empilhar: ");
					valor = read.nextLine();
					pilha.empilha(valor);
					break;
				case 2:
					valor = pilha.desempilha();
					System.out.println(">>Desenpilhado: " + valor);
					break;
				case 3:
					valor = pilha.retornaTopo();
					System.out.println(">>Valor no topo: " + valor);
					break;
				case 4:
					System.out.println("Tamanho da pilha: " + pilha.tamanho());
					break;
				case 5:
					System.out.println("Saindo da aplicação...");
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