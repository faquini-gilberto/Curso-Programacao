import java.util.Locale;
import java.util.Scanner;

public class IF_Else {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		//int x, par, y;
		// System.out.println("Informe dois numeros: "); //
		// System.out.println("Informe dois numeros: "); //
		//System.out.println("Informe Horarios de Inicio e Fim do Jogo: ");
		//System.out.println("Informe as coordenadas x e y: ");
		//x = sc.nextInt();
		//y = sc.nextInt();
		
		//double x, y;
		//x = sc.nextDouble();
		//y = sc.nextDouble();
		
		/*
		if (x >= 0) {
			System.out.println("NAO NEGATIVO");
		}
		else {
			System.out.println("NEGATIVO");
		}
	
		par = x % 2;
		if (par == 0) {
			System.out.println("Numero Par");
		}
		else {
			System.out.println("NUmero Impar");
		}
		*/
		
		/*
		if (y < x) {
			par = y;
			y = x;
			x = par;
		}
		
		par = y % x;
		if (par == 0) {
			System.out.println("SAO MULTIPLOS");
		}
		else {
			System.out.println("NAO SAO MULTIPLOS");
		}
		*/
		
		/*
		if (y <= x) {
			y = y + 24;
		}
		int dur = y - x;
		System.out.println("O jogo durou " + dur + "horas.");
				
		*/
		
		/*
		String intervalo = "Intervalo ";
		String colchete = "";
		
		if (x >= 0 && x <= 25) {
			colchete = "[0, 25]";
		}
		else if (x > 25 && x <= 50) {
			colchete = "[25, 50]";
		}
		else if (x > 50 && x <= 75) {
			colchete = "[50, 75]";
		}
		else if (x > 75 && x <= 100) {
			colchete = "[75, 100]";
		}
		else {
			intervalo = "Fora do Intervalo";
		}
		System.out.println(intervalo + colchete);
		*/
		
		/*
		String msg;
		if (x == 0 && y == 0.0) {
			msg = "Origem";
		}
		else if (x == 0.0) {
			msg = "Origem X";
		}
		else if (y == 0) {
			msg = "Origem Y";
		}
		else if (x > 0) {
			if (y > 0) {
				msg = "Q1";
			}
			else {
				msg = "Q4";
			}
		}
		else {
			if (y > 0) {
				msg = "Q2";
			}
			else {
				msg = "Q3";
			}
		}
		System.out.println(msg);
		*/
		
		double oito = 1000.00 * 0.08;
		double dezoito = 1500.00 * 0.18;
		double salario, ir;
	   
		
		System.out.println("Informe o salario :");
		salario = sc.nextDouble();
		if (salario <= 2000.00) {
			System.out.println("ISENTO");
		}
		else {
		if (salario <= 3000.00) {
			ir = (salario - 2000.00) * 0.08;
		}
		else {
		if (salario <= 4500.00) {
			ir = (salario - 3000.00) * 0.18 + oito;
		}
		else {
			ir = (salario - 4500.00) * 0.28 + oito + dezoito;
		}
		System.out.printf("R$ %.2f%n", ir); 
		}
		}
		sc.close();
	}
	
}
