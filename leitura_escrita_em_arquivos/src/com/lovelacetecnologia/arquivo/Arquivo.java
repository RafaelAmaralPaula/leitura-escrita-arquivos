package com.lovelacetecnologia.arquivo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Arquivo {

	public static Path CAMINHO = Paths.get("/tmp/aula/arquivos05.txt");
	List<String> lista = new ArrayList<String>();

	
	public void criar() throws IOException {

		CAMINHO.toFile().createNewFile();
	}

	
	public void escrever(List<String> lista) throws IOException {

		Files.write(CAMINHO, lista);

	}

	
	public void ler() throws IOException {

		Files.readAllLines(CAMINHO);
	}

}
