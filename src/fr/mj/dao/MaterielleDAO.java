package fr.mj.dao;

import fr.mj.gestion.Materielle;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class MaterielleDAO {

    private Fichier fichier;

    public MaterielleDAO(String nomDeFichier) {
        fichier = new Fichier(nomDeFichier, StandardCharsets.UTF_8);
    }

    public ArrayList<Materielle> lire() {
        ArrayList<String> lignes = fichier.lire();
        ArrayList<Materielle> nourriture = new ArrayList<>();
        for (String ligne : lignes)
            nourriture.add(StringToMaterielle(ligne));
        return nourriture;
    }

    private Materielle StringToMaterielle(String ligne) {
        String[] colonnes = ligne.split("/");
        return new Materielle(colonnes[0], colonnes[1]);
    }

}
