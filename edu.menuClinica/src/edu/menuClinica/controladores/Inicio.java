package edu.menuClinica.controladores;

import java.util.Scanner;

import edu.menuClinica.servicios.MenuImplementacion;
import edu.menuClinica.servicios.MenuInterfaz;

/**
 * Metodo principal de nuestra aplicación
 * @author awb - 061023
 */


public class Inicio {

public static void main (String[] args) {
	
	int seleccionUsuario;
	boolean cerrarMenu = false;
	Scanner  comunicacionTeclado = new Scanner(System.in);
	MenuInterfaz  mi = new MenuImplementacion();
	
	while(!cerrarMenu) {
	
	seleccionUsuario = mi.mostrarMenuYSeleccion(comunicacionTeclado);
	switch(seleccionUsuario) {
		case 0:
		System.out.print("[INFO] Se ejecuta caso 0");
		cerrarMenu = true;
		break;
		case 1:
		System.out.print("[INFO] Se ejecuta caso 1");
		break;
		case 2:
		System.out.print("[INFO] Se ejecuta caso 2");
		break;
		case 3:
		System.out.print("[INFO] Se ejecuta caso 3");
		break;
		case 4:
		System.out.print("[INFO] Se ejecuta caso 4");
		break;
		case 5:
		System.out.print("[INFO] Se ejecuta caso 5");
		break;
		}
	 }
  }
}