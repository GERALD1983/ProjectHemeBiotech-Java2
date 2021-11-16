package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Implémentation de force brute simple en parcourant toutes les options possibles
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private String filepath;
	
	/**
	 * 
	 * @param filepath un chemin d'accès complet ou partiel au fichier contenant des chaînes de symptômes,
	 *                   une par ligne
	 */
	public ReadSymptomDataFromFile (String filepath) {
		this.filepath = filepath;
	}

	/**
	* recupére les symptomes lus et les stocks dans un arraylist à chaque tour de boucle puis retourne cette
	 * arraylist depuis List
	 */
	
	@Override
	public List<String> getSymptoms() {
		List<String> result = new ArrayList<String>();
		
		if (filepath != null) {
			try {
				BufferedReader reader = new BufferedReader (new FileReader(filepath));
				String line = reader.readLine();
				
				while (line != null) {
					result.add(line);
					line = reader.readLine();
				}
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}

}
