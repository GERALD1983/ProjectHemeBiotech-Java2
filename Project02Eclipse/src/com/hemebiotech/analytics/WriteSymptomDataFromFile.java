package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.Map;
import java.io.FileWriter;


public class WriteSymptomDataFromFile implements ISymptomWriter {
        private Map<String,Integer> dictionnaire;

    /**
     *  Map<String,Integer> un dictionnaire de chaine de caractere et un nombre contenant un objet de chaînes et de nombres
     */

    public WriteSymptomDataFromFile (Map<String,Integer>  dictionnaire) {
        this.dictionnaire = dictionnaire;
    }

    /** Méthode d'ecriture dans le fichier result.out pousse les valeur du dictionnaire dans le fichier result.out
     * a chaque tour de boucle
     *
     * @return a la fin de la boucle renvoie tout le dictionnaire Tree map classer par ordre alphabetique et le fichier result.out classer
     */

    public Map<String,Integer>  writeSymptoms() throws IOException {


        Map<String, Integer> dictionnaireMaper = dictionnaire;


        try {
            FileWriter writer = new FileWriter("result.out");

            for (Map.Entry<String,Integer> element : dictionnaireMaper.entrySet()) {

                writer.write(element.getKey() + " : " + element.getValue() + "\n");
            }

            writer.close();
            return  dictionnaire;
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return null;

    }
}
