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

    @Override
    public boolean handleItemAdd(Item item) {
        this.negozio.getProdotti().add(item);
        return true;
    }

    @Override
    public boolean handleItemRemove(Item item) {
       this.negozio.getProdotti().remove(item);
       return true;
    }
}
