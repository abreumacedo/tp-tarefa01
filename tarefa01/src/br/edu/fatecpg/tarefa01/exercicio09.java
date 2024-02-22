package br.edu.fatecpg.tarefa01;

import java.util.Scanner;

public class exercicio09 {

    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	
        Scanner ler = new Scanner(System.in);
        String[] nomes = new String[5];
        String sextoNome;
        boolean encontrado = false;

        System.out.println("Insira 5 nomes:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = ler.nextLine();
        }

        System.out.print("Insira outro nome: ");
        sextoNome = ler.nextLine();

        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equals(sextoNome)) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println(sextoNome + " está na lista de nomes");
        } else {
            System.out.println(sextoNome + " não está na lista de nomes");
        }

        ler.close();
    }
}
