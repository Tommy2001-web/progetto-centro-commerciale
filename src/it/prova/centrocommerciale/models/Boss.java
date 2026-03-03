package it.prova.centrocommerciale.models;

public class Boss extends Lavoratore {

    public Boss() {

    }

    public Boss(String nome, String cognome) {
        super(nome, cognome);
    }

    public Boss(String nome, String cognome, Negozio negozio) {
        super(nome, cognome, negozio);
    }

    @Override
    public boolean handleItemAdd(Item item) {
        return false;
    }

    @Override
    public boolean handleItemRemove(Item item) {
        return false;
    }

}
