import java.util.*;

public class Ejercicio5{

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int edad,e1;
		String sexo;
		int contf=0, contm=0;
		int n =1;
		do {
			System.out.println("Si "+n);
			System.out.println("Ingrese el sexo de la persona: ");
			sexo = entrada.next();

			System.out.println("Ingrese la edad de la persona: ");
			edad = entrada.nextInt();


			if (edad >= 18 && sexo.equals("f")) {
				contf ++;
				
				
			}

			else if (edad <=18 && sexo.equals ("m") ){
				contm  ++;	
				}
	
			
			System.out.println("Si desea seguir ingresando datos preisone 1 si no presione 0 ");
			n = entrada.nextInt();
		} while (n == 1);
	
		System.out.println("El total de hombres y el total de mujeres es: " + contf);
		System.out.println("El total de hombres y el total de mujeres es: "+ contm );

	}
}