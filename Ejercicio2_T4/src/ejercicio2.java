import java.util.Scanner;
public class ejercicio2 {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		String frase;
		int longitudMax, contadorMinus=0,contadorMayus=0, posicion = 0;
		
		System.out.print("Escribe una frase (max 80 caracteres):");
		frase=teclado.nextLine();
		longitudMax = frase.length();
		
		if (longitudMax <= 80 ){
			while (posicion < longitudMax){
				if(frase.charAt(posicion)>= 65 && frase.charAt(posicion) <= 90){
					contadorMayus++;
					
				}else if(frase.charAt(posicion)>= 97 && frase.charAt(posicion) <= 122){
					contadorMinus++;
					
				}
					posicion++;
						
				}
				System.out.print("La cadena tiene: "+ contadorMayus + " mayusculas.");
				System.out.print("La cadena tiene: "+ contadorMinus + " minusculas.");
		}else
			System.out.println("Intentalo de nuevo, ¿no sabes contar hasta 80?");
	}
		
}
	

