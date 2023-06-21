package fundamentos;

import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um Numero");
		double numero = entrada.nextDouble();
		if(numero > 1)
			System.out.println("numero positivo");
		else
			System.out.println("numero negativo");
	}

}
