package LecturaYEscritura;
import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Desafio {
	public static void crearArchivo(String directorio, String fichero) {
		// Validar que el nombre del fichero termine con ".txt"
		if (!fichero.endsWith(".txt")) {
			System.out.println("El nombre del fichero debe terminar con .txt");
			return;
		}

		// Validar que el directorio no exista
		Path pathDirectorio = Paths.get(directorio);
		if (!Files.exists(pathDirectorio)) {
			try {
				Files.createDirectories(pathDirectorio);
			} catch (IOException e) {
				System.out.println("Error al crear directorio");
				return;
			}
		}

		// Crear el archivo dentro del directorio
		Path pathFichero = pathDirectorio.resolve(fichero);
		try (BufferedWriter writer = Files.newBufferedWriter(pathFichero)) {
			ArrayList<String> lista = new ArrayList<>();
			lista.add("Perro");
			lista.add("Gato");
			lista.add("Juan");
			lista.add("Daniel");
			lista.add("Juan");
			lista.add("Gato");
			lista.add("Perro");
			lista.add("Camila");
			lista.add("Daniel");
			lista.add("Camila");

			Iterator<String> iterator = lista.iterator();
			while (iterator.hasNext()) {
				writer.write(iterator.next());
				writer.newLine();
			}
		} catch (IOException e) {
			System.out.println("Error al escribir en el archivo");
		}

}

	//método para buscar texto en el archivo
	public static void buscarTexto(String nombreFichero, String texto){
		Path pathFichero = Paths.get(nombreFichero);

	//Validar que el fichero exista
	if(!Files.exists(pathFichero)){
		System.out.println("El fichero ingresado no existe");
		return;
	}

	//Buscar el texto en el fichero y contar las ocurrencias
	int contador = 0;
	try (BufferedReader reader = Files.newBufferedReader(pathFichero)) {
		String linea;
		while ((linea = reader.readLine()) != null) {
			if (linea.contains(texto)){
				contador++;
			}
		}
	} catch (IOException e) {
		System.out.println("Error al leer el archivo");
	}
		//Mostrar la cantidad de repeticiones del texto
		System.out.println("Cantidad de repeticiones del texto: " + contador);
	}






}
