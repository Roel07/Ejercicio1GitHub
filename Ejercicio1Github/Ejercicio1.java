import java.util.*;

public class Ejercicio1{



public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	int n, p=0, imp=0;

	System.out.println("Ingrese un numero entero");
	n = entrada.nextInt();

	for (int i=1; i <= n ; i++ ) {

	int numero = (int)(Math.random()*100+1);
	System.out.println("  " + numero);

		if (numero % 2 == 0){
			p =  p +1;	
		}else {
			imp = imp + 1;
		} 

		System.out.println(" La cantidad de pares es: " + p);
		System.out.println(" La cantidad de impares es: " + imp);
	}
}

}
