import java.util.Scanner;
public class ejercicio7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		String frase;
		int contadorMayus = 0, contadorMinus = 0, contadorNum = 0, posicion =0;
		
		System.out.println("Escribe una frase:");
		frase=teclado.nextLine();
		
		while(posicion < frase.length()){
			if(frase.charAt(posicion) >= 'A' && frase.charAt(posicion) <= 'Z'){
				contadorMayus++;
			}else if (frase.charAt(posicion) >= 'a' && frase.charAt(posicion) <= 'z'){
				contadorMinus++;
				}else if (frase.charAt(posicion) >= '0' && frase.charAt(posicion) <= '9'){
					contadorNum++;
					}
			posicion++;
			}
			System.out.println("La cadena tiene: "+ contadorMayus + " mayusculas.");
			System.out.println("La cadena tiene: "+ contadorMinus + " minusculas.");
			System.out.println("La cadena tiene: "+ contadorNum + " numeros.");

		}

}
