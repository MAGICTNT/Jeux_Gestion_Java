package fr.mj.dao;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class Fichier {
    private String nomFichier;

    public Charset getCharset() {
        return charset;
    }

    private Charset charset;

    public Fichier(String nomFichier, Charset charset) {
        this.nomFichier = nomFichier;
        this.charset = charset;
    }

    public ArrayList<String> lire() {
        ArrayList<String> lignes = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(
                new FileReader(nomFichier,charset))) {
            String ligne;
            while ((ligne = bufferedReader.readLine()) != null)
                lignes.add(ligne);
        }
        catch (IOException e) {
            System.out.println("Erreur lors de la lecture : " + e.getMessage());
        }
        return lignes;
    }


}
