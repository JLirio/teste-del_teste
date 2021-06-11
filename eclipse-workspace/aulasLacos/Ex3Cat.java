package aulasLacos;


import java.util.Scanner;

public class Ex3Cat {

	public static void main(String[] args) {
		
		int idade;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		idade = ler.nextInt();
		
		if (idade <= 14) {
			System.out.println("Sua categoria é infantil.");

		}else
		if (idade <= 17 && idade >= 15) {
			System.out.println("Sua categoria é juvenil.");

		}else
		if (idade >= 18) {
			System.out.println("Sua categoria é adulto.");

		}

	}

}
