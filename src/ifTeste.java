import java.util.Scanner;

public class ifTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double horas;
		
		
		System.out.println("Que horas são? ");
		horas = sc.nextDouble();
		
		if(horas >= 6 && horas <= 12 ) {
			System.out.printf("Bom dia!");
		}else if(horas > 12 && horas < 18) {
			System.out.println("Boa tarde!");
		}else if(horas >= 18 ) {
			System.out.println("Boa noite");
		}
			
		sc.close();
	}

}
