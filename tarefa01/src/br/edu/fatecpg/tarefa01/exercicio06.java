package br.edu.fatecpg.tarefa01;

import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int numero, fatorial = 1;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite um Número: ");
        numero = ler.nextInt();

       for (int i = 1; i <= numero; i++) {
            fatorial =  fatorial * i;
        }

        System.out.println("Fatorial de " + numero + " = " + fatorial);
        ler.close();
    }
}
