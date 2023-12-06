package atividadeOperadores;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		
		

		
		Scanner leia = new Scanner(System.in);
		float salario, abono, novoSalario ;
		

		System.out.println("\n Entre com o seu salário: ");
		salario = leia.nextFloat();
		System.out.println("\n Entre com o seu abono: ");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.println("\n O valor atual do seu salário é: " + novoSalario);
		
		leia.close();
		
		 
	}

}