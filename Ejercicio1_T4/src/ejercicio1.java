import java.util.Scanner;
public class ejercicio1 {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		String frase;
		int longitudMax, contador =1;
		
		System.out.print("Escribe una frase (max 80 caracteres):");
		frase=teclado.next();
		longitudMax = frase.length();
		
		if (longitudMax <= 80 ){
			while (contador <= longitudMax){
			System.out.println(frase.substring(0,contador));
			
			contador++;
			}
		}else	
			
			System.out.println("La frase tiene mas de 80 caracteres.");	
	}
	
}
