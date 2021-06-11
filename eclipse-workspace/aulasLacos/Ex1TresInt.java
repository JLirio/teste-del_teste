package aulasLacos;

import java.util.Scanner;
public class Ex1TresInt {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		
		int valor1, valor2, valor3, maior=0;
		
		System.out.println("Digite o primeiro valor: ");
		valor1 = ler.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		valor2 = ler.nextInt();
		
		System.out.println("Digite o terceiro valor: ");
		valor3 = ler.nextInt();
		
		if (valor1 > maior) {
			maior = valor1;
		} if(valor2 > maior) {
			maior = valor2;
		} if(valor3 > maior) {
			maior = valor3;
		}
		System.out.println("O maior valor digitad foi: " + maior);
		
		
		
		
		
		
	}
}
