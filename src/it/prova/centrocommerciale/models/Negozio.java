package it.prova.centrocommerciale.models;

import java.util.ArrayList;
import java.util.List;

public class Negozio {
    private String partitaIva;
    private String ragioneSociale;
    private List<Item> prodotti = new ArrayList<>();
    private List<Lavoratore> lavoratori = new ArrayList<>();

    public Negozio() {

    }

    public Negozio(String partitaIva, String ragioneSociale) {
        this.partitaIva = partitaIva;
        this.ragioneSociale = ragioneSociale;
    }

    public Negozio(String partitaIva, String ragioneSociale, List<Item> prodotti, List<Lavoratore> lavoratori) {
        this.partitaIva = partitaIva;
        this.ragioneSociale = ragioneSociale;
        this.prodotti = prodotti;
        this.lavoratori = lavoratori;
    }

    public String getPartitaIva() {
        return partitaIva;
    }

    public void setPartitaIva(String partitaIva) {
        this.partitaIva = partitaIva;
    }

    public String getRagioneSociale() {
        return ragioneSociale;
    }

    public void setRagioneSociale(String ragioneSociale) {
        this.ragioneSociale = ragioneSociale;
    }

    public List<Item> getProdotti() {
        return prodotti;
    }

    public void setProdotti(List<Item> prodotti) {
        this.prodotti = prodotti;
    }

    public List<Lavoratore> getLavoratori() {
        return lavoratori;
    }

    public void setLavoratori(List<Lavoratore> lavoratori) {
        this.lavoratori = lavoratori;
    }

    public boolean addToItems(Lavoratore lavoratore, Item item) {
        if((this.prodotti.contains(item) ||
                (!this.lavoratori.contains(lavoratore)))) return false;
        return lavoratore.handleItemAdd(item);
    }

    public boolean removeFromItems(Lavoratore lavoratore, Item item) {
        if (!(this.prodotti.contains(item)) ||
                (!this.lavoratori.contains(lavoratore))) return false;
        return lavoratore.handleItemRemove(item);
    }

    @Override
    public String toString() {
        return "Negozio{" +
                "partitaIva='" + partitaIva + '\'' +
                ", ragioneSociale='" + ragioneSociale + '\'' +
                ", prodotti=" + prodotti +
                ", lavoratori=" + lavoratori +
                '}';
    }
}
