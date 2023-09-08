package aplicacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import Logica.Restaurante;

public class Aplicacion {
	// APLICACION
	
	private Restaurante restaurante = new Restaurante();
	
	
	public String input(String mensaje)
	{
		try
		{
			System.out.print(mensaje + ": ");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			return reader.readLine();
		}
		catch (IOException e)
		{
			System.out.println("Error leyendo de la consola");
			e.printStackTrace();
		}
		return null;
	}		
	
	public static void main(String[] args) {
		Aplicacion consola = new Aplicacion();
		consola.interface_ahorasi();
		
	}
	
	
			
	
	public void interface_ahorasi () {
		boolean continuar = true;
	
		while (continuar ){
			System.out.println("Selecciona una de las siguientes opciones para continuar: ");
			
			int numero = Integer.parseInt(input("1 Para inciar un nuevo pedido\n\"2 Para cerrar pedido:"))  ;
			
			
			if (numero == 2) {
				continuar = false; 
			}
			
			else if (numero == 1) {
				mostrar_menu();
			}
		}
	}


	public void mostrar_menu (){
		int numero = Integer.parseInt(input("Presiona el numero anterior al mostrado en la oferta para selccionar tu pedido: \r\n")
				+"1 - corral;14000\r\n"
				+ "2- corral queso;16000\r\n"
				+ "3- corral pollo;15000\r\n"
				+ "4- corralita;13000\r\n"
				+ "5- todoterreno;25000\r\n"
				+ "6- 1/2 libra;25000\r\n"
				+ "7- especial;24000\r\n"
				+ "8- casera;23000\r\n"
				+ "9- mexicana;22000\r\n"
				+ "10- criolla;22000\r\n"
				+ "11- costeña;20000\r\n"
				+ "12- hawaiana;20000\r\n"
				+ "13- wrap de pollo;15000\r\n"
				+ "14- wrap de lomo;22000\r\n"
				+ "15- ensalada mexicana;20900\r\n"
				+ "16- papas medianas;5500\r\n"
				+ "17- papas grandes;6900\r\n"
				+ "18- papas en casco medianas;5500\r\n"
				+ "19- papas en casco grandes;6900\r\n"
				+ "20- agua cristal sin gas;5000\r\n"
				+ "21- agua cristal con gas;5000\r\n"
				+ "22- gaseosa;5000");
		
		ejecutarOpcion (numero);
	
		}
	




	public void ejecutarOpcion (int numero) {
		ArrayList<String> pedido = new ArrayList<String>();
		if (numero == 1) {
			pedido.add("corral-14000");
		}
		if (numero == 2) {
			pedido.add("corral queso - 16000");
		}
		if (numero == 3) {
			pedido.add("corral pollo - 15000");
		}
		if (numero == 4) {
			pedido.add("corralita - 13000");
		}
		if (numero == 5) {
			pedido.add("todoterreno - 25000");
		}
		if (numero == 6) {
			pedido.add("1/2 libra - 25000");
		}
		if (numero == 7) {
			
		}
	}
	
	
}



