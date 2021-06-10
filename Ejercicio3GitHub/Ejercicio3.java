import java.util.*;

public class Ejercicio3{



	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		int n;
		int nFactorial =1;

		System.out.println("Ingrese un numero entero");
		n = entrada.nextInt();

			for (int i=1; i <= n  ; i++ ) {

				nFactorial = nFactorial*i;
		
			}

				System.out.println(" El factorial de  " + n + " es " + nFactorial);

	}
}	