package br.edu.fatecpg.tarefa01;

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int numero = ler.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println(numero + " é um número par.");
        } else {
            System.out.println(numero + " é um número ímpar.");
        }
        
        ler.close();
    }
}