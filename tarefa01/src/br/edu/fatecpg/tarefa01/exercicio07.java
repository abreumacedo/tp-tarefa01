package br.edu.fatecpg.tarefa01;

import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade;

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite a Idade: ");

		idade = ler.nextInt();

		if (idade < 18){
			System.out.println("Menor de idade");
		} else if (idade >= 18 && idade < 60) {
			System.out.println("Adulto");
		} else {
			System.out.println("Idoso");
		}
        ler.close();
	}
}
