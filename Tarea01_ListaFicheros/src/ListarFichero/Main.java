package ListarFichero;

import java.io.File;
import java.util.ArrayList;

public class Main {
	public static void main(String[] arg) {
	
		File directorio = new File("D:\\usuario");
		ruta(directorio);
		
		
		
	}
	public static File ruta(File directorio) {
		File[]ficheros = directorio.listFiles();
		System.out.println("\n+Ruta Directorio: "+directorio);
		System.out.println("Total de directorios: "+directorio(ficheros));
		directorioV(ficheros);
		System.out.println("Total de archivos: "+archivos(ficheros));
		archivosV(ficheros);
		for (int i = 0; i < ficheros.length; i++) {
			
		}
		for (int i = 0; i < ficheros.length; i++) {
			if(ficheros[i].isDirectory()) {
				directorio = ficheros[i];
				ruta(directorio);
			}	
		}
		return directorio;
	}
	public static int archivos(File[]ficheros) {
		ArrayList<File> archivosArrayList = new ArrayList<File>();
		for (int i = 0; i < ficheros.length; i++) {
			if(ficheros[i].isFile()) {
				archivosArrayList.add(ficheros[i]);
				}
		}
		return archivosArrayList.size();
	}
	public static int directorio(File[]ficheros) {
		ArrayList<File> directorioArrayList = new ArrayList<File>();
		for (int i = 0; i < ficheros.length; i++) {
			if(!ficheros[i].isFile()) {
				directorioArrayList.add(ficheros[i]);
				}
		}
		return directorioArrayList.size();
		
	}
	public static void archivosV(File[]ficheros) {
		ArrayList<File> archivosArrayList = new ArrayList<File>();
		for (int i = 0; i < ficheros.length; i++) {
			if(ficheros[i].isFile()) {
				archivosArrayList.add(ficheros[i]);
				System.out.println("\t"+ficheros[i].getName());
				}
		}
	}
	public static void directorioV(File[]ficheros) {
		ArrayList<File> directorioArrayList = new ArrayList<File>();
		for (int i = 0; i < ficheros.length; i++) {
			if(!ficheros[i].isFile()) {
				directorioArrayList.add(ficheros[i]);
				System.out.println("\t"+ficheros[i].getName());
				}
		}
		
	}
}
