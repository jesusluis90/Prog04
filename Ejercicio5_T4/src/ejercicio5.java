import java.util.Scanner;
public class ejercicio5 {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		String frase, frasePar = "", fraseImpar = "" ;
		int posicion = 0;
		
		System.out.print("Escribe una frase (max 80 caracteres):");
		frase=teclado.nextLine();
		
		
		if (frase.length() <= 80 ){
			while (posicion < frase.length()){
				if(posicion%2 == 0){
					frasePar=frasePar+frase.charAt(posicion);
					
					}else{
					fraseImpar=fraseImpar+frase.charAt(posicion);
				}
				posicion++;
			}
			System.out.println("La frase par es: " + frasePar);
			System.out.println("La frase impar es: " + fraseImpar);
			
		}else
			System.out.println("Intentalo de nuevo, ¿no sabes contar hasta 80?");
	
		
	}
}