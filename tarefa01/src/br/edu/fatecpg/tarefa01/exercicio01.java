package br.edu.fatecpg.tarefa01;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        double numero;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite um Número: ");
        numero = ler.nextDouble();
        
        if ( numero > 0 ){
            System.out.println("Número Positivo");
        } else if ( numero < 0 ) {
            System.out.println("Número Negativo");
        } else {
            System.out.println("Nulo");
        }
        ler.close();
    }
}
