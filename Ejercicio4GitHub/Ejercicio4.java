import java.util.*;

public class Ejercicio4{

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int edad;
	
		for (int i=1; i<=20 ;i++ ) {

			int mayor=0, menor=0;
			System.out.println("Ingrese las edades: ");
			edad = entrada.nextInt();


			if (edad >= 18) {
				System.out.println("mayor de edad; " + i);
				
			}else {
				System.out.println("menor de edad" + i);
			}

			
		}

	}
}