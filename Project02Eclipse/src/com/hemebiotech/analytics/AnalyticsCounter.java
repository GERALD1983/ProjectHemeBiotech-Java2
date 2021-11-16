package com.hemebiotech.analytics;


public class AnalyticsCounter {


    public static void main(String args[]) throws Exception {


        ISymptomReader fichier = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");


        ISymptomCount tableau = new CountSymptomDataFromFile(fichier.getSymptoms());


        ISymptomWriter resultat = new WriteSymptomDataFromFile(tableau.countSymptoms());

        resultat.writeSymptoms();


    }


}
