import java.util.Scanner;

public class Entrada_Dados_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double x;
		String y;
		int z;
		y = sc.next();
		x = sc.nextDouble();
		z = sc.nextInt();
		System.out.println("String: " + y + " Double: " + x + " Int: " + z);
		System.out.printf("String: %s Double: %.2f Int: %d\n", y, x, z);
	

		sc.close();
	}

}
