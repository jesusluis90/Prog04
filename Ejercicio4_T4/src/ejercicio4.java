import java.util.Scanner;
public class ejercicio4 {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		String frase,cambio;
		int longitudMax;
		
		System.out.print("Escribe una frase (max 80 caracteres):");
		frase=teclado.nextLine();
		longitudMax = frase.length();
		
		if (longitudMax <= 80 ){
			System.out.print("Escribe mayusculas o minusculas para cambiar la frase:");
			cambio=teclado.nextLine();
			switch (cambio){
				case "mayusculas":
					System.out.println(frase.toUpperCase());
					break;
				case "minusculas":
					System.out.println(frase.toLowerCase());
					break;
			}
		
		}else
			System.out.println("Intentalo de nuevo, ¿no sabes contar hasta 80?");
	
		
	}
}