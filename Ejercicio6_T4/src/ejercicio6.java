import java.util.Scanner;
public class ejercicio6 {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		String frase;
		int posicion = 0,contadorVocal=0,contadorCons=0,contadorNum=0;
		
		System.out.print("Escribe una frase (max 80 caracteres):");
		frase=teclado.nextLine();
		
		if (frase.length() <= 80 ){
			while (posicion < frase.length()){
				if(frase.charAt(posicion) == 'a' || frase.charAt(posicion) == 'e' || frase.charAt(posicion) == 'i' || frase.charAt(posicion) == 'o' || frase.charAt(posicion) == 'u' ){
					contadorVocal++;
				}else if(frase.charAt(posicion) >= 'a' && frase.charAt(posicion) <= 'z'){
						contadorCons++;
						}else if(frase.charAt(posicion) >= '0' && frase.charAt(posicion) <= '9'){
							contadorNum++;
							}
				posicion++;
			}
			System.out.println("La cadena tiene: "+ contadorVocal + " vocales.");
			System.out.println("La cadena tiene: "+ contadorCons + " consonantes.");
			System.out.println("La cadena tiene: "+ contadorNum + " numeros.");		
				
			}else
			System.out.println("Intentalo de nuevo, ¿no sabes contar hasta 80?");
	}
}
			
	
