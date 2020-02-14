import java.util.*;
public class SwitchCondicional {
	public static void main (String args[]){
		int valor;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca un numero entre 0 y 3");
		valor = sc.nextInt(); 
		switch (valor)
		{
		case 0:
		   System.out.println("i es cero.");
		break;
		case 1:
			System.out.println("i es uno.");
		break;
		case 2:
			System.out.println("i es dos.");
		break;
		default:
			System.out.println("i es mayor que 2");
		}
	
	}
	
}
