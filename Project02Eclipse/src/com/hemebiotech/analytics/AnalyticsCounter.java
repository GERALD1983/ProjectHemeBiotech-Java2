package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class AnalyticsCounter {
    private static int headacheCount = 0;    // initialize to 0
    private static int rashCount = 0;        // initialize to 0
    private static int pupilCount = 0;        // initialize to 0

    public static void main(String args[]) throws Exception {
        // first get input
        BufferedReader reader = new BufferedReader(new FileReader("Project02Eclipse/symptoms.txt"));

        String line = reader.readLine();
        ArrayList<String> tableau = new ArrayList<>();


        System.out.println(tableau);

        int i = 0;    // set i to 0
        int headCount = 0;    // counts headaches
        while (line != null) {
            tableau.add(line);

            i++;    // increment i
            System.out.println("symptom from file: " + line);

            if (line.equals("headache")) {
                headacheCount++;
                headCount++;

                System.out.println("number of headaches: " + headCount);
            } else if (line.equals("rash")) {
                rashCount++;
            } else if (line.contains("pupils")) {
                pupilCount++;
            }

            line = reader.readLine();    // get another symptom

        }
       // Collections.sort(tableau);

      //  System.out.println(tableau.size());

        //  int nb = 0;
        int nbOccurenceSymptomeActuel = 0;

        Map<String, Integer> dictionnaireSymptome = new TreeMap<>();


        for (int j = 0; j < tableau.size(); j++) {

            String symptomeActuel = tableau.get(j);

            if (!dictionnaireSymptome.containsKey(symptomeActuel)) {

                nbOccurenceSymptomeActuel = 0;

                for (int k = j; k < tableau.size(); k++) {


                    if (tableau.get(j).equals(tableau.get(k))) {
                        nbOccurenceSymptomeActuel++;
                    /*
                    if (tableau.get(j).equals("anxiety")) {
                        nb++;

                    }*/
                    }
                }
                dictionnaireSymptome.put(symptomeActuel, nbOccurenceSymptomeActuel);
            }
        }

        System.out.println(dictionnaireSymptome);
        // System.out.println("anxiety nombre  = "+ nb);
        // next generate output
        FileWriter writer = new FileWriter("result.out");
        writer.write("headache: " + headacheCount + "\n");
        writer.write("rash: " + rashCount + "\n");
        writer.write("dialated pupils: " + pupilCount + "\n");
        writer.close();
    }
}
