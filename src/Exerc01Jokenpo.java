
import java.util.Scanner;

public class Exerc01Jokenpo {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		System.out.println("------------------------------");
		System.out.println("      J O K E N P O");
		System.out.println("------------------------------");
		System.out.println("Escolha uma das op��es abaixo:");
		System.out.println("1 - Pedra");
		System.out.println("2 - Papel");
		System.out.println("3 - Tesoura");
		System.out.println("------------------------------");
		System.out.println(" ");
		System.out.print("Digite sua op��o: ");

		int opcaoUsuario = leitor.nextInt();

		int opcaoComputador = (int) (Math.random() * 4);

		System.out.println(" ");

		// Refaz op��o do computador se valor for zero
		if (opcaoComputador < 1) {
			for (int contador = 0; contador <= opcaoComputador; contador = contador + 1) {
				if (opcaoComputador < 1) {
					opcaoComputador = (int) (Math.random() * 4);
				}
			} // final do for
		} // final do if

		// Valida op��o do usu�rio e s� aceita opc�es entre 1 e 3
		if ((opcaoUsuario < 1) || (opcaoUsuario > 3)) {
			System.out.print("Op��o " + opcaoUsuario + " inv�lida! " + "Digite entre 01 e 03: ");
			opcaoUsuario = leitor.nextInt();
			String opcaoValida = "N";

			while (opcaoValida == "N") {
				if ((opcaoUsuario > 0) && (opcaoUsuario < 4)) {
					opcaoValida = "S";
				} else {
					System.out.print("Op��o " + opcaoUsuario + " inv�lida! " + "Digite entre 01 e 03: ");
					opcaoUsuario = leitor.nextInt();
				} // final do if
			} // final do while
			System.out.println(" ");
		} // final do if

		// Informa op��o escolhida pelo usu�rio
		if (opcaoUsuario == 1) {
			System.out.println("Voc� escolheu Pedra");
		} else if (opcaoUsuario == 2) {
			System.out.println("Voc� escolheu Papel");
		} else {
			System.out.println("Voc� escolheu Tesoura");
		} // final do if

		// Informa op��o escolhida pelo computador
		if (opcaoComputador == 1) {
			System.out.println("Computador escolheu Pedra");
		} else if (opcaoComputador == 2) {
			System.out.println("Computador escolheu Papel");
		} else {
			System.out.println("Computador escolheu Tesoura");
		} // final do if

		System.out.println(" ");

		// Decide quem vence entre usu�rio e computador
		if ((opcaoUsuario == 1) && (opcaoComputador == 1)) {
			System.out.println("Empate");
		} else if ((opcaoUsuario == 1) && (opcaoComputador == 2)) {
			System.out.println("Computador ganhou!");
		} else if ((opcaoUsuario == 1) && (opcaoComputador == 3)) {
			System.out.println("Voc� ganhou!");
		} else if ((opcaoUsuario == 2) && (opcaoComputador == 2)) {
			System.out.println("Empate");
		} else if ((opcaoUsuario == 2) && (opcaoComputador == 1)) {
			System.out.println("Voc� ganhou!");
		} else if ((opcaoUsuario == 2) && (opcaoComputador == 3)) {
			System.out.println("Computador ganhou!");
		} else if ((opcaoUsuario == 3) && (opcaoComputador == 3)) {
			System.out.println("Empate");
		} else if ((opcaoUsuario == 3) && (opcaoComputador == 1)) {
			System.out.println("Computador ganhou!");
		} else if ((opcaoUsuario == 3) && (opcaoComputador == 2)) {
			System.out.println("Voc� ganhou!");
		} // final do if

		leitor.close();

	} // final do main

} // final da classe Jokenpo
