package it.prova.centrocommerciale.models;

public class Item {

    private String codice;
    private String descrizione;
    private int prezzo;

    public Item() {
    }

    public Item(String codice, String descrizione, int prezzo) {
        this.codice = codice;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
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
