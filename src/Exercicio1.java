import java.util.Locale;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'M';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println(product1 + " wich price is $ " + price1);
		System.out.println(product2 + " wich price is $ " + price2);
		System.out.println("Record: "+age+" years old, code "+code+"and gender: "+gender);
		System.out.printf("Measure with: %.8f%n",measure);
		System.out.printf("Rouded: %.3f%n",measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US DECIMAL point: %.3f",measure);
	}

}
