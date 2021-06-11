package aulasLacos;

import java.util.Scanner;

public class Ex4ParEimpar {
	
	public static void main(String[] args) {
	double numer, raiz;
	Scanner ler = new Scanner(System.in);
	
	System.out.println("Digite o numero escolhido : ");
	numer = ler.nextInt();
	
	if(numer % 2 ==0) {
		raiz = Math.sqrt(numer);
		System.out.println("O numero digitado é par, e a sua raiz quadrada é: "+ raiz);
		
	}else {
		raiz = numer*numer;
		System.out.println("O numero digitado é impar, e a sua raiz quadrada é: "+ raiz);
	}
	
	
	
	}
	
}
