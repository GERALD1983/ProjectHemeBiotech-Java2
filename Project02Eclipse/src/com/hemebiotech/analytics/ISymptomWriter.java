package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.Map;

/**
 * Tout ce qui lira les données d'un dictionnaire à partir d'une source dictionnaire
 * La partie importante est la valeur de retour de l'opération, qui est un dictionnaire de chaînes et nombres,
 * ecrit les valeurs du dictionnaire à l aide de file writer dans un fichier a chaque tour de boucle dans le dictionnaire
 * L'implémentation n'a pas besoin de commander le dictionnaire
 */

public interface ISymptomWriter {

    /**
     *
     * @return un dictionnaire et ecrit ses valeurs dans un  fichier result.out
     * @throws IOException traque les exeptions d'erreur recu
     */
    Map<String,Integer> writeSymptoms() throws IOException;
}
