package it.prova.centrocommerciale.models;

public class PersonaleAmministrativo extends Lavoratore {

    public PersonaleAmministrativo() {

    }

    public PersonaleAmministrativo(String nome, String cognome) {
        super(nome, cognome);
    }

    public PersonaleAmministrativo(String nome, String cognome, Negozio negozio) {
        super(nome, cognome, negozio);
    }
}
