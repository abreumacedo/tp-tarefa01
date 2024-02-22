#### 📝 TAREFA PRÁTICA 1 - POSTE SEU LINK DO GITHUB

| Assignments | 15 de fevereiro de 2024 às 16:59 |
| ----------- | -------------------------------- |
| Vence       | 21 de fevereiro de 2024 às 23:59 |
| Fecha       |                                  |



##### Instruções



1. Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".
2. Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.
3. Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo". Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
4. Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.
5. Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.
6. Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.

7. Faixa Etária: Receba a idade de uma pessoa e imprima se ela é: menor de idade, adulta ou idosa (use, por exemplo, 18 para adulta e 60 para idosa).

8. Soma dos Números Ímpares: Peça ao usuário que insira um número inteiro n. Calcule e imprima a soma dos primeiros n números ímpares. Por exemplo, se o usuário inserir 4, o programa deve calcular a soma de 1 + 3 + 5 + 7 = 16.

9. Lista de Nomes: Peça ao usuário para inserir 5 nomes (um de cada vez). Após inserir todos os nomes, peça outro nome e use um loop for para percorrer a lista e verificar se o 6º(último) nome digitado está presente no array dos 5 nomes informados inicialmente.

10. Senha Secreta: Defina uma senha secreta (por exemplo: "Java123"). Use um loop while para pedir ao usuário que insira a senha. Se a senha estiver incorreta, continue pedindo a senha e informe ao usuário que a tentativa foi inválida. Se ele acertar, saia do loop e imprima uma mensagem de sucesso.

Envie para o Seu repositório no GitHub!



---



1. Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".



````Java
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
````



2. Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.



````Java
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
````



3. Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo". Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.



````Java
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
````



4. Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.



````Java
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
````



5. Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.



````Java
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
````



6. Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.



````Java
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

````



7. Faixa Etária: Receba a idade de uma pessoa e imprima se ela é: menor de idade, adulta ou idosa (use, por exemplo, 18 para adulta e 60 para idosa).



````Java
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

````



8. Soma dos Números Ímpares: Peça ao usuário que insira um número inteiro n. Calcule e imprima a soma dos primeiros n números ímpares. Por exemplo, se o usuário inserir 4, o programa deve calcular a soma de 1 + 3 + 5 + 7 = 16.



````Java
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
````



9. Lista de Nomes: Peça ao usuário para inserir 5 nomes (um de cada vez). Após inserir todos os nomes, peça outro nome e use um loop for para percorrer a lista e verificar se o 6º(último) nome digitado está presente no array dos 5 nomes informados inicialmente.



````Java
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
````



10. Senha Secreta: Defina uma senha secreta (por exemplo: "Java123"). Use um loop while para pedir ao usuário que insira a senha. Se a senha estiver incorreta, continue pedindo a senha e informe ao usuário que a tentativa foi inválida. Se ele acertar, saia do loop e imprima uma mensagem de sucesso.



````Java
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
````



---
