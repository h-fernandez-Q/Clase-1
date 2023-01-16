import java.util.Scanner;

public class Ejercicio_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//El numero -25 en este caso no lo hemos contado como negativo al ejercer como llave de flujo, de contarlo como numero negativo sería añadir 1 a auxN
		Scanner scan = new Scanner(System.in);
		int x = 0;
		boolean v = false;
		
		int aux0 = 0;
		int auxN = 0;
		
		do{
			System.out.println("Introduzca un numero entero: ");
	    	x = scan.nextInt();
	    	if(x == -25){
	    		v = true;	            
	        }else if(x == 0){
	        	aux0++;
	        	v = false;
	        }else if(x < 0){
	        	auxN++;
	        	v = false;
	        }
	    }while(!v);
		
		System.out.println("La cantidad de ceros introducida es: " + aux0 + " y la cantidad de numeros negativos es: " + auxN);
		
	}

}
