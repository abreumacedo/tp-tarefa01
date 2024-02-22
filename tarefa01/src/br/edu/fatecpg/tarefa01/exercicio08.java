package br.edu.fatecpg.tarefa01;

import java.util.Scanner;

public class exercicio08 {
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        int fatorial, numero;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite um Número: ");
        numero = ler.nextInt();

        fatorial = (int) Math.pow(numero, 2);

        System.out.println("Soma dos primeiros " + numero + " números ímpares: " + fatorial);
        ler.close();
    }
}