import java.util.Scanner;

public class Ejercicio_8 {
	//Programa que lea por teclado un n�mero correspondiente a un mes e indique si es un mes de 28, 30 o 31 d�as y qu� mes es en un String.
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int x = 0;
	int aux = 0;
	boolean v = false;
	
	String [] meses = new String[12];
	
	meses[0] = "Enero, 31 d�as";
	meses[1] = "Febrero, 28 d�as";
	meses[2] = "Marzo, 31 d�as";
	meses[3] = "Abril, 30 d�as";
	meses[4] = "Mayo, 31 d�as";
	meses[5] = "Junio, 30 d�as";
	meses[6] = "Julio, 31 d�as";
	meses[7] = "Agosto, 31 d�as";
	meses[8] = "Septiembre, 30 d�as";
	meses[9] = "Octubre, 31 d�as";
	meses[10] = "Noviembre, 30 d�as";
	meses[11] = "Diciembre, 31 d�as";
	
	do{
		System.out.println("Introduzca el mes, formato 12 meses: ");
    	x = scan.nextInt();
    	if(x < 13 && x > 0){
            System.out.println("El mes es valido");
            v = true;
        }else{
        	v = false;
        	System.out.println("El meses no valido");
        }
    }while(!v);
	
	System.out.println("El mes es " + meses[x-1]);
		
}
}