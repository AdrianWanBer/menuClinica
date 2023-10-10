package edu.menuClinica.servicios;

import java.util.Scanner;

/**
 * Implementacion de la interfaz menu
 * @author Awb - 61023
 */
public class MenuImplementacion implements MenuInterfaz {

	@Override
	public int mostrarMenuYSeleccion(Scanner comunicacionTecladoM) {
		
		int opcionSeleccionada;
		
		
		System.out.println("###############################");
		System.out.println("1.Cerrar la aplicacion");
		System.out.println("2.Registro paciente");
		System.out.println("3.Ingreso paciente");
		System.out.println("4.Alta de paciente");
		System.out.println("5.Resumen de ingresos y altas");
		System.out.println("6.Historial del paciente");
		System.out.println("###############################");
		System.out.println("Seleccione una opcion: ");
		
		opcionSeleccionada = comunicacionTecladoM.nextInt();
		
		
		return opcionSeleccionada;
	}
}
