package br.com.voeairlines.primeiraavaliação;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		LabArrayList lab1 = new LabArrayList();

		System.out.println("1 - ArrayList | 2 - List | 3- Outros");

		int opcao = scan.nextInt();
		switch (opcao) {
		case 1:
			int opcaoCrud;
			do {
				System.out.println("1 - Adicionar | 2- Listar | 3 - Mostrar uma aeronave | 4 - Remover | 5 - Sair");
				opcaoCrud = scan.nextInt();
				if (opcaoCrud == 1) {
					lab1.adcionarAeronave();
				} else if (opcaoCrud == 2) {
					lab1.listarAeronave();
				} else if (opcaoCrud == 3) {
					System.out.println("Qual indice deseja visualizar? ");
					int indice = scan.nextInt();
					lab1.mostrarAeronave(indice);
				} else if (opcaoCrud == 4) {
					int indice = 0;
					lab1.removerAeronave(indice);
				}

			} while (opcaoCrud != 5);
			System.out.println("Programa encerrado!");
			break;
		}

	}
}