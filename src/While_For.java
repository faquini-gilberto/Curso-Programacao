import java.util.Locale;
import java.util.Scanner;

public class While_For {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		
		/*
		int senha = sc.nextInt();
				
		while (senha != 2002) {
			System.out.println("Senha Invalida");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		*/

		/*
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		int tipo;
		
		
		boolean fim = false;
		
		while (fim == false) {
			System.out.println("Digite 1 - Alcool, 2 - Gasolina, 3 - Diesel, 4 - Fim\n");
			tipo = sc.nextInt();
			switch (tipo) {
			case 1:
				gasolina += 1;
				break;
			case 2:
				alcool += 1;
				break;
			case 3:
				diesel += 1;
				break;
			case 4:
				fim = true;
				break;
			}
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		*/
		
		/*
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i+=2) {
			System.out.println(i);
		}
		*/
		
		/*
		int num = sc.nextInt();
		int dentro = 0;
		int fora = 0;
		
		for (int i = 1; i <= num; i++) {
			int valor = sc.nextInt();
			if (valor < 10 || valor > 20) {
				fora += 1;
			} 
			else {
				dentro += 1;
			}	
			
					
		System.out.println(dentro + " in");
		System.out.println(fora + " out");

		}
		*/
		
		/*
		int num = sc.nextInt();
		double n1, n2, n3, media;
		
		for (int i = 1; i <= num; i+=1) {
			
			n1 = sc.nextDouble();
			n2 = sc.nextDouble();
			n3 = sc.nextDouble();
			media = ((n1 * 2.0) + (n2 * 3.0) + (n3 * 5.0)) / 10.0;
			
			System.out.printf("%.1f%n", media);
		}
		*/
		
		int num = sc.nextInt();
		int fatorial = 1;
				
		for (int i = num; i > 0; i--) {
			fatorial *= i;
		}
		
		System.out.println(fatorial);
		sc.close();
	}

}
