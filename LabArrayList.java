package br.com.voeairlines.primeiraavaliação;

import java.util.ArrayList;
import java.util.Scanner;

public class LabArrayList {
	String aeronave;
	ArrayList<String> aeronaves = new ArrayList<String>();
	Scanner scan = new Scanner(System.in);

	public void adcionarAeronave() {
		System.out.println("Informe a aeronave: ");
		aeronave = scan.nextLine();
		aeronaves.add(aeronave);
	}

	public void listarAeronave() {
		for (String aeronave : aeronaves) {
			System.out.println(" * " + aeronaves.indexOf(aeronave) + " " + aeronave + " * ");
		}
	}

	public void mostrarAeronave(int indice) {
		String aeronaveEscolhida = aeronaves.get(indice - 1);
		System.out.println(aeronaveEscolhida);

	}
	public void removerAeronave(int indice) {
		aeronaves.remove(indice - 1); 
	}
}
