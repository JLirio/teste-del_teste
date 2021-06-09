package vetores;
import java.util.Scanner;
public class Ex2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] A = new int[6];int[] parA = new int[6];int[] imparA = new int[6];
		int i,impar=0, par=0;
		System.out.println("Digite o valor de suas variaveis: ");
		
		for(i=0;i<=5;i++) {
		A[i]=entrada.nextInt();
				if (A[i] % 2 ==0) {			
					par = par +1;
					parA[i]= A[i];
				}else
					if(A[i]%2 != 0) {
					impar=impar+1;
					imparA[i]= A[i];
				}
		}
		
		for(i=0;i<=5;i++) {
		System.out.println("A["+i+"] ="+A[i]);
		
		}
		
		System.out.println("Os valores pares digitados foram:  ");
		
		for(i=0;i<=5;i++) {
			if (A[i] % 2 ==0) {		
		System.out.println(parA[i]);
		}
		}
		
		System.out.println("Os valores impares digitados foram ");
		
		for(i=0;i<=5;i++) {
			if(A[i]%2 != 0) {
		System.out.println(imparA[i]);}
		}
		
		System.out.println("O valor de numeros pares digitados é: "+par+" e de numeros impares é: "+impar);
		
		
		
	}
}
