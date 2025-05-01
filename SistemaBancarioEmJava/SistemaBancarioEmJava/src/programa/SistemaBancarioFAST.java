package programa;

import java.util.Locale;
import java.util.Scanner;

import entities.Banco;

public class SistemaBancarioFAST {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		Banco clienteBanco01 = new Banco("111.222.333-44", "João", "45-99", "14098-1", "12345");
		Banco clienteBanco02 = new Banco("222.333.444-10", "Maria", "23-12", "89732-9", "222333");
		
		System.out.println("       Olá, bem vindo ao Banco FAST :)\n");
		
		System.out.println("Você quer:\n1 - CRIAR uma conta\n2 - ACESSAR sua conta\n");
		System.out.println("Clique 1 para CRIAR uma conta ou 2 para ACESSAR sua conta: ");
		
		int usuario;
		String cpf = clienteBanco02.getCpf();
		
		do {
			usuario = input.nextInt();
			if (usuario != 1 && usuario != 2) {
				System.out.println("Opps!\nApenas 1 para CRIAR ou 2 para ACESSAR.");				
			}
			input.nextLine();
			if (usuario == 1 ) {
				System.out.println("\nFicamos felizes que você decidiu criar uma conta com a gente :)");
				System.out.print("- Digite seu CPF (apenas números): ");
				cpf = clienteBanco02.getCpf();
				System.out.println(cpf);
				
				System.out.print("- Digite seu primeiro nome: ");
				String nome = clienteBanco02.getNome().toUpperCase();
				System.out.println(nome);
				
				System.out.println("\nOk! Tudo certo, agora geraremos uma Conta, uma Agência e uma Senha para você.");
				
		        System.out.println(clienteBanco02.toString());
			}

			if (usuario == 2) {
				
				System.out.println("Olá ツ " + clienteBanco02.getNome() + ", para entrar digite sua senha: ");
				 
				String senha = clienteBanco02.getSenha();
				senha = input.nextLine();
			
				if (clienteBanco02.getSenha().equals(senha)) {
					System.out.println(clienteBanco02.toString());
				}
				
				else{
					while (!clienteBanco02.getSenha().equals(senha)) {
					    System.out.println("Opps! Senha incorreta!");
					    senha = input.nextLine();
					}
					System.out.println(clienteBanco02.toString());
				}		
				
				System.out.println("\nClique S para ver o saldo.");
				
	}
			
		} while (usuario != 1 && usuario != 2);
			
		System.out.println("\n© Todos os direitos reservados a Khayke Rennoan Matias de Medeiros. 2025");
		
		input.close();

	}

}
