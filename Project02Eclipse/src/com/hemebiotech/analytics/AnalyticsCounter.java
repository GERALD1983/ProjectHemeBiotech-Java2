package com.hemebiotech.analytics;

<<<<<<< HEAD

public class AnalyticsCounter {


    public static void main(String args[]) throws Exception {


        ISymptomReader fichier = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");


        ISymptomCount tableau = new CountSymptomDataFromFile(fichier.getSymptoms());


        ISymptomWriter resultat = new WriteSymptomDataFromFile(tableau.countSymptoms());

        resultat.writeSymptoms();


    }


=======
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class AnalyticsCounter {
	private static int headacheCount = 0 ;	// initialize to 0
	private static int rashCount = 0;		// initialize to 0
	private static int pupilCount = 0;		// initialize to 0
	
	public static void main(String args[]) throws Exception {
		
		// first get input
		BufferedReader reader = new BufferedReader (new FileReader("Project02Eclipse/symptoms.txt"));
		String line = reader.readLine();

		int i = 0;	// set i to 0
		int headCount = 0;	// counts headaches
		while (line != null) {
			i++;	// increment i
			System.out.println("symptom from file: " + line);
			if (line.equals("headache")) {
				headCount++;
				System.out.println("number of headaches: " + headCount);
			}
			else if (line.equals("rush")) {
				rashCount++;
			}
			else if (line.contains("pupils")) {
				pupilCount++;
			}

			line = reader.readLine();	// get another symptom
		}
		
		// next generate output
		FileWriter writer = new FileWriter ("result.out");
		writer.write("headache: " + headacheCount  + "\n");
		writer.write("rash: " + rashCount + "\n");
		writer.write("dialated pupils: " + pupilCount + "\n");
		writer.close();
	}
>>>>>>> 2adbe4a67202f114c06cbef48cfe9a0873508698
}
