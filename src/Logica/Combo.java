package Logica;

import java.io.File;

public class Combo implements Producto {
	
	private double descuento;

	private String nombreCombo;

	@Override
	public int getPrecio() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String generarTextoFactura() {
		// TODO Auto-generated method stub
		return null;
	}
	

	public Combo(String nombre, double descuento) {
		
	}


	public void agregarItemACombo(Producto itemCombo) {
		
	}


	public void guardarFactura (File archivo) {
		
	}
	
}
