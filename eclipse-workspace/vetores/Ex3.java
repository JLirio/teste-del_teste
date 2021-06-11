package vetores;
import java.util.Scanner;
public class Ex3 {

public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int[][] matrizA = new int[3][3];
		int[][] maior = new int[3][3];
		
		
		for(int l = 0; l < 3; l++) {
			for(int c = 0; c < 3; c++) {
				System.out.printf("Digite as notas: [%d][%d] ", (l+1), (c+1));
				matrizA[l][c] = entrada.nextInt();
				if (matrizA[l][c]> 10) {
				maior[l][c]= matrizA[l][c];
						}
			}
			
			System.out.println();
			}
		
		for(int l = 0; l < 3; l++) {
			for(int c = 0; c < 3; c++) {
				if (maior[l][c]> 10) {
				System.out.println("["+(l+1)+"]"+"["+(c+1)+"] = "+maior[l][c] + " / ");
				}}
}}}
