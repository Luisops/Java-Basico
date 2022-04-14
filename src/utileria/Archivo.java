package utileria;

import java.io.*;

public class Archivo {

	public static void creacioArchivo(String miArchivo) {
		File file = new File(miArchivo);
		
		try {
			PrintWriter salida = new PrintWriter(file);
			salida.close();
			
			System.out.println("Ya se creo el archivo");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(System.out);
		}
		
	}
	
	public static void escribirArchivo(String archivoEscribir) {
		File file = new File(archivoEscribir);
		
		try {
			PrintWriter salida = new PrintWriter(file);
			String contenido = "Escribiendo mi Archvio ";
			salida.println(contenido);
			salida.println();
			salida.println("Fin de escritura de archivo");
			
			salida.close();
			System.out.println("Se ha guardado exitosamente");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(System.out);
		}	
		
	}

	public static void leerArchivo(String leyendoArchivo) {
		File file = new File(leyendoArchivo);
		try {
			BufferedReader entrada =  new BufferedReader(new FileReader(file));
			String leerLinea = entrada.readLine();
			while (leerLinea != null) {
				System.out.println(leerLinea);
				leerLinea = entrada.readLine();	
			}
			entrada.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace(System.out);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(System.out);
		}
		
	}

	public static void anexarArchivo(String anexandoArchivo) {
		File file = new File(anexandoArchivo);
		
		try {
			PrintWriter salida = new PrintWriter(new FileWriter(file,true));
			String escribir = "Anexando archivo";
			salida.println(escribir);
			salida.println();
			salida.println("Finaliza el anexo");
			salida.close();
			
			System.out.println("Se ha finalizado el anexo");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
