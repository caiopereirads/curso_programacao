import java.util.Scanner;

public class testandoWhile {

	public static void main(String[] args) {
		//Fazer um programa que lê números inteiros até que um zero apareça. 
		//Ao final mostre a soma dos números informados
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int soma = 0;
		
		while(x != 0) {
			soma = soma + x;
			x = sc.nextInt();
		}
		System.out.println(soma);
		sc.close();
	}

}
