package com.hemebiotech.analytics;



import java.util.*;


public class CountSymptomDataFromFile implements ISymptomCount{

    private List<String> listSymptoms;
    /**
     *  List<String> une liste de chaine de caractere contenant des chaînes de symptômes
    */


    /**
     *
     * @param listSymptoms la liste des symptomes que l on souhaite compter
     */
    public CountSymptomDataFromFile (List<String> listSymptoms) {
        this.listSymptoms = listSymptoms;
    }

    /**
     *
     * @return le dictionnaire Tree map classé par ordre alphabetique
     */

    @Override
    public Map<String,Integer> countSymptoms()  {



        Map<String, Integer> dictionnaireSymptome = new TreeMap<>();
        try {

            for (int j = 0; j < listSymptoms.size(); j++) {

                String symptomeActuel =  listSymptoms.get(j);

                if (!dictionnaireSymptome.containsKey(symptomeActuel)) {

                 int  nbOccurenceSymptomeActuel = 0;

                    for (int k = j; k < listSymptoms.size(); k++) {


                        if (listSymptoms.get(j).equals(listSymptoms.get(k))) {
                            nbOccurenceSymptomeActuel++;

                        }
                    }
                    dictionnaireSymptome.put(symptomeActuel, nbOccurenceSymptomeActuel);
                }
            }

            return  dictionnaireSymptome;

        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return null;
    }


}
