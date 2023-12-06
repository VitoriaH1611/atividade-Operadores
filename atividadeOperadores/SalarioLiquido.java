package atividadeOperadores;

import java.util.Scanner;

public class SalarioLiquido {

	public static void main(String[] args) {
		 
		Scanner leia = new Scanner(System.in);
		float salarioBruto, adicional, horaExtra, desconto , salarioLiquido;
		
		System.out.println("\n Insira o valor do salário bruto do colaborador: ");
		salarioBruto = leia.nextFloat();
		System.out.println("\n Insira o valor do adicional noturno: ");
		adicional = leia.nextFloat();
		System.out.println("\n Insira o valor das horas extras: ");
		horaExtra= leia.nextFloat();
		System.out.println("\n Insira o valor dos descontos: ");
		desconto = leia.nextFloat();
		
		
		salarioLiquido = (salarioBruto+adicional+(horaExtra*5)- desconto);
				
        System.out.println("\n O salário líquido do colaborador é: " + salarioLiquido);
		
		leia.close();      
		

	}

}
