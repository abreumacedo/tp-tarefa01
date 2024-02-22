package br.edu.fatecpg.tarefa01;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        double numero1, numero2;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite um Número: ");
        numero1 = ler.nextDouble();
        
        System.out.println("Digite outro Número: ");
        numero2 = ler.nextDouble();

        if (numero1 == numero2){
            System.out.println("Numeros Iguais");
        } else if (numero1 > numero2){
            System.out.println("Numeros Diferentes - 1- é maior");
        } else if (numero1 < numero2) {
            System.out.println("Numeros Diferentes - 2- é maior");
        }
        ler.close();
    }
}
