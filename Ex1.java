package vetores;

public class Ex1 {
	public static void main(String[] args) {
		int[] A = new int[6];
		int i, soma;
		
		A[0] = 1;
		A[1] = 0;
		A[2] = 5;
		A[3] = -2;
		A[4] = -5;
		A[5] = 8;
	
		soma = A[0] +A[1] + A[5];
		System.out.println("O valor dos vetores A s�o : ");
		
		for (i=0;i<=5;i++) {
		System.out.println("A["+i+"] ="+A[i]);
		}
		A[4]=100;
		System.out.println("A posi��o de A[4] modificada �: "+A[4]);
		System.out.println("A soma dos vlores de A0, A1 e A5 �: "+soma);
	}
	}
