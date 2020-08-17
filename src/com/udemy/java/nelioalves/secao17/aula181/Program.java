package com.udemy.java.nelioalves.secao17.aula181;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {

		String path = "C:\\Users\\Eduardo\\Desktop\\in.txt";
		FileReader fr = null;
		BufferedReader br = null;

		try {
			// stream(sequencia de leitura)
			fr = new FileReader(path);
			br = new BufferedReader(fr);

			// leitura de uma linha
			String line = br.readLine();

			// enquanto line for diferente de null,
			// significa que a leitura foi feita com sucesso
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			try {
				if (br != null) {
					br.close();
				}
				if (fr != null) {
					fr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
