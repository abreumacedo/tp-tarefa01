package br.edu.fatecpg.tarefa01;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
        String  senhaSecreta = "Java123";
        
        boolean senhaCorreta = false;
        
        while (!senhaCorreta) {
            System.out.println("Digite a senha secreta: ");
            String tentativaSenha = ler.nextLine();
            
            if (tentativaSenha.equals(senhaSecreta)) {
                senhaCorreta = true;
                System.out.println("Senha correta. Acesso concedido.");
            } else {
                System.out.println("Senha incorreta. Tente novamente.");
            }
        }
        
        ler.close();
    }
}