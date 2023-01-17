import java.util.Scanner;

public class Ejercicio_7 {

	    public static void main(String[] args) {
	        /*Crea un programa que lea por teclado tres números enteros H, M, S correspondientes a hora, minutos y segundos respectivamente, y comprueba si la hora que indican es una hora válida.
	        Supondremos que se leemos una hora en modo 24 Horas, es decir, el valor válido para las horas será mayor o igual que cero y menor que 24.
	        El valor válido para los minutos y segundos estará comprendido entre 0 y 59 ambos incluidos*/
	        Scanner scan = new Scanner(System.in);
	        
	        int H,M,S;
	        boolean v = false;
	        
	        do{
	            System.out.println("Introduzca la hora, formato 24 horas: ");
	            H = scan.nextInt();
	            if(H < 24 && H > 0){
	                System.out.println("La hora introducida es valida");
	                v = true;
	            }else{
	            	v = false;
	            	System.out.println("La hora introducida no es valida");
	            }
	        }while(!v);
	        
	        do{
	        	System.out.println("Introduzca los minutos, formato 0 a 59 segundos: ");
	            M = scan.nextInt();
	            if(M < 59 && M > 0){
	                System.out.println("El minutaje introducida es valido");
	                v = true;
	            }else{
	            	v = false;
	            	System.out.println("La hora introducida no es valida");
	            }
	        }while(!v);
	        
	        do{
	        	System.out.println("Introduzca los segundos, formato 0 a 59 segundos: ");
	            S = scan.nextInt();
	            if(S < 59 && S > 0){
	                System.out.println("El segundaje introducida es valido");
	                v = true;
	            }else{
	            	v = false;
	            	System.out.println("La hora introducida no es valida");
	            }
	        }while(!v);
	        
	        
	        System.out.println("La hora es: " + H + " , " + M + " minutos y " + S + " segundos");
	    }
	}