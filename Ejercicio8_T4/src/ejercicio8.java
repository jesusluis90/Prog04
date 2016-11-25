import java.util.Scanner;
public class ejercicio8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		String frase, fraseCod="";
		int numCifrado, posicion = 0, caracterCod;
		
		System.out.println("Escribe una frase:");
		frase=teclado.nextLine();
		
		frase=frase.toUpperCase();
		System.out.println("La frase en mayusculas es:" + frase);
		
		System.out.print("Introduce un numero del 1 al 10 para el cifrado: ");
		numCifrado=teclado.nextInt();
		
		if (numCifrado <= 10){
				while(posicion < frase.length()){
					
					
					
				}
				System.out.println("La frase codificada es: "+fraseCod);
		}else
			System.out.println("El numero introducido es incorrecto.");
	}

}
