package it.prova.centrocommerciale.models;

public class Item {

    private String codice;
    private String descrizione;
    private int prezzo;
    private Negozio negozio;

    public Item() {
    }

    public Item(String codice, String descrizione, int prezzo, Negozio negozio) {
        this.codice = codice;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.negozio = negozio;
    }

    @Override
    public String toString() {
        return "Item{" +
                "codice='" + codice + '\'' +
                ", descrizione='" + descrizione + '\'' +
                ", prezzo=" + prezzo +
                '}';
    }
}
