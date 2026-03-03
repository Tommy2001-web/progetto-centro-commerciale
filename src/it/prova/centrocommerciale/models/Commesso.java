package it.prova.centrocommerciale.models;

public class Commesso extends Lavoratore {

    public Commesso() {

    }

    public Commesso(String nome, String cognome) {
        super(nome, cognome);
    }

    public Commesso(String nome, String cognome, Negozio negozio) {
        super(nome, cognome, negozio);
    }
}
