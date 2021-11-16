package com.hemebiotech.analytics;

import java.util.Map;

/**
 * Tout ce qui lira les données de arraylist à partir d'une source List string
 * La partie importante est la valeur de retour de l'opération, qui est un dictionnaire de chaînes et nombres,
 * pouvant contenir de nombreux symptomes en un seul objet contenant le nombre qui réprésente le nombre d'occurence du symptome
 * recu dans la liste aprés les avoirs compter
 * <p>
 * tri des occurences de symptomes par ordre alphabétiques
 */
public interface ISymptomCount {
    /**
     * si auncune données n'est disponible retourne null
     *
     * @return un dictionnaire d'objet de symptomes string et de nombre integer depuis une liste et trier par
     * ordre alphebetique pas de doublons
     */
    Map<String, Integer> countSymptoms();
}
