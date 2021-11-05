package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.io.FileWriter;


public class WriteSymptomDataFromFile implements ISymptomWriter {
        private TreeMap dictionnaire;

    public WriteSymptomDataFromFile (TreeMap dictionnaire) {
        this.dictionnaire = dictionnaire;
    }

    public TreeMap WriteSymptoms() throws IOException {
        System.out.println(dictionnaire);

        Map<String, Integer> dictionnaireMaper = dictionnaire;


        try {
            FileWriter writer = new FileWriter("result.out");

            for (Map.Entry element : dictionnaireMaper.entrySet()) {
                System.out.println("clé: " + element.getKey()
                        + " | valeur: " + element.getValue());
                writer.write(element.getKey() + " : " + element.getValue() + "\n");
            }

            writer.close();
            return (TreeMap) dictionnaire;
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return null;

    }
}
