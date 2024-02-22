package br.edu.fatecpg.tarefa01;

import java.util.Scanner;

public class exercicio03 {

    public static final double PI = 3.14;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double numero1 = 0, numero2 = 0, resultado;
        int opcaoMenu;
        String apresentarMenu = """
                              Escolha uma opcao:
                              1 - Area do Quadrado
                              2 - Area do Circulo
                              """;
                                  
        System.out.println(apresentarMenu);
        
        Scanner ler = new Scanner(System.in);
        opcaoMenu = ler.nextInt();
        
        switch(opcaoMenu){
            case 1:
                System.out.println("Digite o lado do quadrado: ");
                numero1 = ler.nextDouble();
                resultado = numero1 * numero1;
                System.out.println(resultado);
                break;
            case 2:
                System.out.println("Digite o raio do círculo: ");
                numero2 = ler.nextDouble();
                resultado = PI * Math.pow(numero2, 2);
                System.out.println(resultado);
                break;
        }
        ler.close();
    }
}
