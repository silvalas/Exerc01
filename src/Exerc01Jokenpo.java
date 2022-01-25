
import java.util.Scanner;

public class Exerc01Jokenpo {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		System.out.println("------------------------------");
		System.out.println("      J O K E N P O");
		System.out.println("------------------------------");
		System.out.println("Escolha uma das opções abaixo:");
		System.out.println("1 - Pedra");
		System.out.println("2 - Papel");
		System.out.println("3 - Tesoura");
		System.out.println("------------------------------");
		System.out.println(" ");
		System.out.print("Digite sua opção: ");

		int opcaoUsuario = leitor.nextInt();

		int opcaoComputador = (int) (Math.random() * 4);

		System.out.println(" ");

		// Refaz opção do computador se valor for zero
		if (opcaoComputador < 1) {
			for (int contador = 0; contador <= opcaoComputador; contador = contador + 1) {
				if (opcaoComputador < 1) {
					opcaoComputador = (int) (Math.random() * 4);
				}
			} // final do for
		} // final do if

		// Valida opção do usuário e só aceita opcões entre 1 e 3
		if ((opcaoUsuario < 1) || (opcaoUsuario > 3)) {
			System.out.print("Opção " + opcaoUsuario + " inválida! " + "Digite entre 01 e 03: ");
			opcaoUsuario = leitor.nextInt();
			String opcaoValida = "N";

			while (opcaoValida == "N") {
				if ((opcaoUsuario > 0) && (opcaoUsuario < 4)) {
					opcaoValida = "S";
				} else {
					System.out.print("Opção " + opcaoUsuario + " inválida! " + "Digite entre 01 e 03: ");
					opcaoUsuario = leitor.nextInt();
				} // final do if
			} // final do while
			System.out.println(" ");
		} // final do if

		// Informa opção escolhida pelo usuário
		if (opcaoUsuario == 1) {
			System.out.println("Você escolheu Pedra");
		} else if (opcaoUsuario == 2) {
			System.out.println("Você escolheu Papel");
		} else {
			System.out.println("Você escolheu Tesoura");
		} // final do if

		// Informa opção escolhida pelo computador
		if (opcaoComputador == 1) {
			System.out.println("Computador escolheu Pedra");
		} else if (opcaoComputador == 2) {
			System.out.println("Computador escolheu Papel");
		} else {
			System.out.println("Computador escolheu Tesoura");
		} // final do if

		System.out.println(" ");

		// Decide quem vence entre usuário e computador
		if ((opcaoUsuario == 1) && (opcaoComputador == 1)) {
			System.out.println("Empate");
		} else if ((opcaoUsuario == 1) && (opcaoComputador == 2)) {
			System.out.println("Computador ganhou!");
		} else if ((opcaoUsuario == 1) && (opcaoComputador == 3)) {
			System.out.println("Você ganhou!");
		} else if ((opcaoUsuario == 2) && (opcaoComputador == 2)) {
			System.out.println("Empate");
		} else if ((opcaoUsuario == 2) && (opcaoComputador == 1)) {
			System.out.println("Você ganhou!");
		} else if ((opcaoUsuario == 2) && (opcaoComputador == 3)) {
			System.out.println("Computador ganhou!");
		} else if ((opcaoUsuario == 3) && (opcaoComputador == 3)) {
			System.out.println("Empate");
		} else if ((opcaoUsuario == 3) && (opcaoComputador == 1)) {
			System.out.println("Computador ganhou!");
		} else if ((opcaoUsuario == 3) && (opcaoComputador == 2)) {
			System.out.println("Você ganhou!");
		} // final do if

		leitor.close();

	} // final do main

} // final da classe Jokenpo
