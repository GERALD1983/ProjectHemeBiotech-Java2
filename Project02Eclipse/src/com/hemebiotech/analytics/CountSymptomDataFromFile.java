package com.hemebiotech.analytics;



import java.util.*;


public class CountSymptomDataFromFile implements ISymptomCount{

    private ArrayList ArraySymptoms;

    public CountSymptomDataFromFile (ArrayList ArraySymptoms) {
        this.ArraySymptoms = ArraySymptoms;
    }

    @Override
    public TreeMap CountSymptoms()  {


      //  System.out.println(ArraySymptoms);


        // boucle de comptage
        int nbOccurenceSymptomeActuel = 0;


        Map<String, Integer> dictionnaireSymptome = new TreeMap<>();
        try {

            for (int j = 0; j < ArraySymptoms.size(); j++) {

                String symptomeActuel = (String) ArraySymptoms.get(j);

                if (!dictionnaireSymptome.containsKey(symptomeActuel)) {

                    nbOccurenceSymptomeActuel = 0;

                    for (int k = j; k < ArraySymptoms.size(); k++) {


                        if (ArraySymptoms.get(j).equals(ArraySymptoms.get(k))) {
                            nbOccurenceSymptomeActuel++;

                        }
                    }
                    dictionnaireSymptome.put(symptomeActuel, nbOccurenceSymptomeActuel);
                }
            }

          //  System.out.println(dictionnaireSymptome);


            return (TreeMap) dictionnaireSymptome;

        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return null;
    }


}
