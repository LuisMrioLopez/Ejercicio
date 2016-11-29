import java.util.Scanner;
public class TipoDias {
	public static void main (String[] args) {
		System.out.println("Introduce un dia de la semana");
		Scanner sc = new Scanner(System.in);
		String diaSemana = sc.next();
		String diaSemanaMinuscula = diaSemana.toLowerCase();
		sc.close();
		//System.out.printf("Dia de la semana introducido %s%n" , diaSemanaMinuscula);
		
		String mensaje ="";
		switch (diaSemanaMinuscula) {
			case "lunes"  :
				mensaje = "laborable";
				break;
			
			case "martes"  :
				mensaje = "laborable";
				break;
			
			case "miercoles"  :
				mensaje = "laborable";
				break;
			
			case "jueves"  :
				mensaje = "laborable";
				break;
			
			case "viernes"  :
				mensaje = "laborable";
				break;
			
			case "sabado"  :
				mensaje = "no es laborable";
				break;
			
			case "domingo"  :
				mensaje = "no es laborable";
				break;
			default :
				mensaje = "no es un dia";
		}
		System.out.printf("%s %s%n" , diaSemanaMinuscula, mensaje);
	}
}
