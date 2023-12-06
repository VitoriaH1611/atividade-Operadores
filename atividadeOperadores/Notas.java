package atividadeOperadores;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		float nota1, nota2, nota3, nota4 , mediaNota;
		
		System.out.println("\n Entre com a sua primeria nota: ");
		nota1 = leia.nextFloat();
		System.out.println("\n Entre com a sua segunda nota: ");
		nota2 = leia.nextFloat();
		System.out.println("\n Entre com a sua terceira nota: ");
		nota3 = leia.nextFloat();
		System.out.println("\n Entre com a sua quarta nota: ");
		nota4 = leia.nextFloat();
		
		mediaNota = (nota1+nota2+nota3+nota4)/4;
				
        System.out.println("\n A sua média é: " + mediaNota);
		
		leia.close();      
		

	}

}
