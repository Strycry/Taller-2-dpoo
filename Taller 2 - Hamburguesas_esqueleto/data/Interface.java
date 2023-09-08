package uniandes.dpoo.procesamiento;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import uniandes.dpoo.modelo.Combo;
import uniandes.dpoo.modelo.ProductoMenu;

// APLICACION

public class interface{
	
public static void main(String[] args): void {
	boolean continuar = true
			while continuar {
			System.out.println("Selecciona una de las siguientes opciones para continuar: ");
			input numero = System.out.println("1 Para inciar un nuevo pedido");
			input numero = System.out.println("2 Para cerrar pedido: ");
			
			if (numero == 2) {
				continuar = false; 
			}
			
			else if (numero == 1) {
				mostrar menu ();
			}
			
}
}

public void mostrar menu (){
	system.out.println ()
}
	

public ejecutarOpcion (int opcionSeleccionada): void 

// RESTAURANTE 

public Restaurante ()

public iniciarPedido (String nombreCliente, String direccionCliente): void

public cerrarYGuardarPedido(): void

public getPedidoEnCurso (): Pedido

public getMenuBase (): Arraylist<product>

public getingredientes ():Arraylist<ingrediente>

public cargarinformacionRestaurante (File archivoingredientes, File archivoMenu, File archivoCombos): void

private cargaringredientes(File archivoingredientes, File archivoMenu, File archivoCombos): void

private cargarMenu(File archivoMenu):void

private cargarCombos(File archivoCombos):void 

// INGREDIENTE

private nombre : String 

private costoAdicional : int 

///////////////////////

public ingrediente (string:nombre, int costoAdicional)

public getNombre(): String

public getCostoAdicional(): int


//PRODUCTO MENU  

private nombre: string 

private precioBase : int 

///////////////////////

public ProductoMenu (String nombre, int precioBase)

public getNombre(): String

public getPrecio(): int

public generarTextoFactura(): String


// PRODUCTO AJUSTADO  

public ProductoAjustado (ProductoMenu base)


public getNombre(): String


public getPrecio(): int


public generarTextoFactura(): String


// INTERFACE PRODUCTO 

public getPrecio(): int 

public getNombre(): String 

public generarTextoFactura (): String


// PEDIDO

private numeroPedidos: int 

private idPedido: int 

private nombreCliente: String

private direccionCliente: String

///////////////////////

public Pedido (String nombreCliente, String direccionCliente)

public getidPedido(): int 

public agregarProducto(Producto nuevoitem): void

private getPrecioNetoPedido(): int

private getPrecioTotalPedido(): int

private getPrecioIVAPedido(): int

private generarTextoFactura(): String

public guardarFactura(File archivo): void


// COMBOS

private descuento: double

private nombreCombo: String 

///////////////////////

public Combo(string nombre, double descuento)


public agregaritemACombo(Producto itemCombo): void


public getPrecio(): int


public generarTextoFactura(): String
public getNombre(): string ^
}

