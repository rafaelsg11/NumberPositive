package positive;

import java.util.Scanner;

public class NumberPositive {

	public static void main(String[] args) {
		int i;
		int soma = 0;
		
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.print("Digite um numero positivo para ser somado ou negativo para sair: ");
			i = ler.nextInt();
			if(i >= 0) {
				soma += i;
			}
		} while(i >= 0);
		System.out.println("A soma eh: " + soma);
	}
}