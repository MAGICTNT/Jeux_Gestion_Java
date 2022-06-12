package fr.mj.gestion;

import java.util.Objects;

public class Materielle implements Comparable<Materielle>{

    private String nom;
    private String valeur;

    public Materielle(String nom, String valeur) {
        this.nom = nom;
        this.valeur = valeur;
    }

    public String getNom() {
        return nom;
    }

    public String getValeur() {
        return valeur;
    }

    @Override
    public int compareTo(Materielle o) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Materielle that = (Materielle) o;
        return Objects.equals(nom, that.nom) && Objects.equals(valeur, that.valeur);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, valeur);
    }

    @Override
    public String toString() {
        return "Materielle{" +
                "nom='" + nom + '\'' +
                ", valeur='" + valeur + '\'' +
                '}';
    }
}
