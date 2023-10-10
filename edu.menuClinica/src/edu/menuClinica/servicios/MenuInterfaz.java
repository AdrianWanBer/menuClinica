package edu.menuClinica.servicios;

import java.util.Scanner;

/**
 * Interfaz de enumera los metodos de la funcionalidad del menu
 * @author Awb - 031023
 */

public interface MenuInterfaz {
	
	/**
	 * Mostrar el menu al usuario y que recoja la opcion
	 * @author awb -031023
	 * @return (int) el numero de la accion que seleccione el usuario
	 */
	
	public int mostrarMenuYSeleccion(Scanner comunicacionTecladoM);
	
	
}
