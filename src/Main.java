import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		double x = 3.141596;
		String nome = "Teste";
		int idade = 12;
		double valor = 3.15;
		System.out.println("Palmeiras");
		System.out.print("Porco...");
		System.out.println("1914");
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", x);
		System.out.println("Palmeiras " + x + " Porco");
		System.out.printf("Palmeiras %.4f Porco\n", x);
		System.out.printf("%s tem %d anos e ganha %.2f reais\n", nome, idade, valor );
		System.out.print("Fim");
	}
	

}
