package com.udemy.java.nelioalves.secao17.aula183;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {

		/*
		 * FileWriter (stream de escrita de caracteres em arquivos)
		 * 
		 * Cria/recria o arquivo: new FileWriter(path)
		 * Acrescenta ao arquivo existente: new FileWriter(path, true)
		 */
		
		String[] lines = { "Good morning", "Good afternoon", "Good night" };

		String path = "C:\\Users\\Eduardo\\Desktop\\out.txt";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
