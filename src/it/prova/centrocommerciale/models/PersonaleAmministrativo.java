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

    @Override
    public boolean handleItemAdd(Item item) {
        this.negozio.getProdotti().add(item);
        return true;
    }

    @Override
    public boolean handleItemRemove(Item item) {
        return false;
    }
}
