package ar.com.educacionit.console.file;

import java.io.File;
import java.util.Arrays;

public class FileMain {

	public static void mainOld(String[] args) {

		//crear un File a un archivo en disco
		String path = "C:\\desarrollo\\educationit\\bootcamp-java-universidad-2023"; 
		
		//File file= new File(path + "\\test.ext");
		File file= new File(path);
		
		//saber si es un archivo
		boolean isAFile = file.isFile();
		boolean isADirectory = file.isDirectory();
		boolean exists = file.exists();
		
		System.out.println(exists);
		System.out.println(isAFile);
		System.out.println(isADirectory);
		
		System.out.println(file.getName());
		System.out.println(file.getParent());
		System.out.println(file.getParentFile());
		
		//archivos dentro del Directory
		System.out.println(Arrays.toString(file.list()));		
	}
	
	public static void main(String[] args) {

		//crear un File a un archivo en disco
		String path = "C:\\desarrollo\\educationit\\bootcamp-java-universidad-2023";
		
		//File file= new File(path + "\\test.ext");
		File file= new File(path);
		
		//dad la raiz
		//quiero recorrer todos los niveles internos de los directorios
		//mostrando que archivos que tiene
		//hasta el último
		
		//C:\\desarrollo\\educationit\\bootcamp-java-universidad-2023
		/*
		 A
		 >a.txt
		 >B
		  >b.txt
		  >C
		   >c.txt
		*/		
		recorrer(file);
	}
	
	public static void recorrer(File[] files) {
		if(files.length == 0)
			return ;
		
		for(File aux : files) {
			recorrer(aux);
		}
	}
	public static void recorrer(File file) {
		//1 - existe?
		if(file == null || !file.exists()) {
			System.out.println("No existe el File");
			return;
		}
		
		if(file.isHidden()) {
			return;
		}

		//caso base!
		if(file.isFile()) {
			System.out.printf(">",file.getName());
			return;
		}
		
		if(file.isDirectory()) {
			System.out.printf(file.getName());
			File[] filesInDirectory = file.listFiles();
			recorrer(filesInDirectory);			
		}
		System.out.println();
	}
	
	
}
