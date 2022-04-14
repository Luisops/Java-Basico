package test;

import beans.Empleado;
import beans.Gerente;
import claseAbstracta.Cuadrado;
import claseAbstracta.FiguraGeometrica;
import claseInterface.AccesoDatos;
import claseInterface.ImplementacionOracle;
import static utileria.Archivo.*;

public class EjecutaCompi {

	public static void main(String[] args) {
		/*
		 * Empleado empleado = new Empleado("Luis", "Guerra",1100); Gerente gerente =
		 * new Gerente("Luis", "Munoz", 10000, "EFS");
		 * 
		 * System.out.println("EMPLEADO: "+empleado.mostrarDetalles());
		 * System.out.println("GERENTE = > "+gerente.mostrarDetalles());
		 * 
		 * FiguraGeometrica cuadrado= new Cuadrado("CUADRADO");
		 * System.out.println(cuadrado); cuadrado.dibujar();
		 * 
		 * AccesoDatos oracle = new ImplementacionOracle(); oracle.insertar();
		 * oracle.listar();
		 * 
		 * System.out.println(AccesoDatos.REGISTROS);
		 */
		
		String rutaArchivo = "D:\\Nueva carpeta\\archivoCreado\\archivoPruebaJava.txt";

	//	creacioArchivo(rutaArchivo);
		
	//	escribirArchivo(rutaArchivo);
		
		//leerArchivo(rutaArchivo);
		
		anexarArchivo(rutaArchivo);
	}

}
