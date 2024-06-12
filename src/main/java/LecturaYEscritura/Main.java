package LecturaYEscritura;

import static LecturaYEscritura.Desafio.buscarTexto;
import static LecturaYEscritura.Desafio.crearArchivo;

public class Main {
	public static void main(String[] args) {

		// Crear el archivo en el directorio especificado
		crearArchivo("directorioEjemplo", "ficheroEjemplo.txt");

		// Buscar un texto en el fichero
		buscarTexto("directorioEjemplo/ficheroEjemplo.txt", "Juan");

		//Profesor Marcos, Luis, este fue el desafío que menos entendí de todos. Sinceramente me apoyé bastante de chatgpt
		// para
		// lograrlo, pero
		// me pesó mucho haberme perdido la clase específica en la cual abordan este tema de los ficheros externos.
		// Espero se pueda hacer algún repaso de esto en otro momento, con mayor detención. Aún no me doy el tiempo de
		// ver la clase tampoco.
	}

}
