import java.util.Scanner;

public class exercicio1FixacaoWhile {
	public static void main(String[] args) {
		/* Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
		incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
		impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira a senha: ");
		int senha = sc.nextInt();
		
		while (senha != 876852) {
			System.out.println("Senha inválida. Tente novamente: ");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso permitido!");
		
		sc.close();
	}
}
