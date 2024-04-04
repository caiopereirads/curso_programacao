import java.util.Scanner;

public class estruturaSwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int semana = 7;
		
		System.out.println("Insira um dia da semana de 1 a 7: ");
		semana = sc.nextInt();
		
		switch(semana) {
			case 1:
				System.out.println("Hoje é domingo.");
				break;
			case 2:
				System.out.println("Hoje é segunda-feira.");
				break;
			case 3:
				System.out.println("Hoje é terça-feira.");
				break;
			case 4:
				System.out.println("Hoje é quarta-feira.");
				break;
			case 5:
				System.out.println("Hoje é quinta-feira.");
				break;
			case 6:
				System.out.println("Hoje é sexta-feira.");
				break;
			case 7:
				System.out.println("Hoje é sábado");
				break;
			default:
				System.out.println("Valor informado é inválido!!!");
		}
		
		
		
		sc.close();
	}

}
