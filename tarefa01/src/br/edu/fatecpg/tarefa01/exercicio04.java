package br.edu.fatecpg.tarefa01;

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero, resultado;

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite um Número: ");
		numero = ler.nextInt();

		System.out.println("Tabuada do " + numero);
		for(int i = 1; i <= 10; i++){
			resultado = numero * i;
			System.out.println(numero + " x " + i + " = " + resultado);
	    }
        ler.close();
    }
}
