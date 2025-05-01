package programa;

import java.util.Locale;
import java.util.Scanner;

import entities.Banco;

public class SistemaBancarioFAST {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		Banco banco = new Banco();
		
		System.out.println("       Olá, bem vindo ao Banco FAST :)\n");
		
		System.out.println("Você quer CRIAR uma conta ou ACESSAR sua conta?...");
		
		
		
		input.close();

	}

}
