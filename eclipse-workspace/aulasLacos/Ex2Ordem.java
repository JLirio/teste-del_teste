package aulasLacos;


import java.util.Scanner;

public class Ex2Ordem {

	public static void main(String[] args) {
		double val1, val2, val3 , vazio;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		val1 = ler.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		val2 = ler.nextInt();
		
		System.out.println("Digite o terceiro valor: ");
		val3 = ler.nextInt();
		
		
		
			
			if(val1>val3) {
				vazio = val1;
				val1  = val3;
				val3  = vazio;
						
			}
			
			if(val2>val3) {
				vazio = val3;
				val3  = val2;
				val2  = vazio;
			}
			if(val1>val2) {
				vazio = val2;
				val2  = val1;
				val1  = vazio;
			}
		
			System.out.println("A orde crescente dos três numeros deigitadosé:\n " + val1 +" "+ val2 +" "+ val3);
			
		
		
		
			
	}

}
