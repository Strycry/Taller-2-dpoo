package Logica;

import java.io.File;
import java.util.ArrayList;

public class Restaurante {
	
	private 
	private ArrayList <Pedido> pedidos ;
	private Pedido pedido = new Pedido(null, null);
	private ArrayList <Ingrediente> ingredientes;
	
	
	public Restaurante (){
		
	}
	public void iniciarPedido (String nombreCliente, String direccionCliente) {
	
	}
	

	public void cerrarYGuardarPedido() {
		
	}

	public Pedido getPedidoEnCurso() {
		return pedido;

	}

	public ArrayList<Producto> getMenuBase(){
		return null;
		
	}

	public ArrayList<Ingrediente> getingredientes (){
		return ingredientes;
		
	}

	public void cargarinformacionRestaurante (File archivoingredientes, File archivoMenu, File archivoCombos) {
		
	}

	private void cargaringredientes(File archivoingredientes, File archivoMenu, File archivoCombos) {
		
	}

	private void cargarMenu(File archivoMenu) {
		
	}

	private void cargarCombos(File archivoCombos) {
		
	}
}
