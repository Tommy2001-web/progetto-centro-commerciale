package it.prova.centrocommerciale.test;

import it.prova.centrocommerciale.models.*;

import java.util.ArrayList;
import java.util.List;

public class TestCentroCommerciale {
    public static void main(String[] args) {

        CentroCommerciale centroCommerciale = new CentroCommerciale();

        Negozio negozio = new Negozio("asdsad","srl");
        Lavoratore commesso = new Commesso("Alfredo", "Gigli", negozio);
        Lavoratore boss = new Boss("Mario", "Rossi", negozio);
        Lavoratore personaleAmministrativo = new PersonaleAmministrativo("Luigi", "Verdi", negozio);
        List<Lavoratore> lavoratori = new ArrayList<>();
        lavoratori.add(commesso);
        lavoratori.add(boss);
        lavoratori.add(personaleAmministrativo); // popolo la lista di lavoratori
        negozio.setLavoratori(lavoratori);// setto la lista al negozio
        Lavoratore commesso1 = new Commesso("Francesco", "Neri");


        Item cellulare = new Item("A32", "Uno smartphone performante", 300, negozio);
        Item matita = new Item("B56", "Una semplice matita", 1, negozio);
        Item lavatrice = new Item("T98", "Una comoda lavatrice", 100, negozio);

        /*List<Item> prodotti = new ArrayList<>();
        prodotti.add(cellulare);
        prodotti.add(matita);
        prodotti.add(lavatrice);*/
        System.out.println("Test della funzione addToItems()");
        System.out.println(negozio.addToItems(commesso, cellulare)); // mi aspetto true
        System.out.println(negozio.getProdotti()); // controllo che il cellulare sia presente nella lista
        System.out.println(negozio.addToItems(boss, matita)); // mi aspetto false
        System.out.println(negozio.getProdotti()); // controllo che solo il cellulare sia presente nella lista
        System.out.println(negozio.addToItems(personaleAmministrativo, matita)); // mi aspetto true
        System.out.println(negozio.getProdotti()); // controllo che sia il cellulare che la matita siano presenti nella lista
        System.out.println(negozio.addToItems(commesso, cellulare)); // mi aspetto false perchè l'oggetto è già presente tra i prodotti
        System.out.println(negozio.getProdotti()); // controllo che non venga aggiunto l'item
        System.out.println(negozio.addToItems(commesso1, lavatrice)); //mi aspetto false perchè il commesso non è presente nel negozio
        System.out.println(negozio.getProdotti()); // controllo che non venga aggiunto l'item
        System.out.println("FINE TEST \n");

        negozio.addToItems(commesso, lavatrice); // popolo la lista anche con l'ultimo oggetto in vista del prossimo test
        System.out.println("Test della funzione removeFromItems()");
        System.out.println(negozio.getProdotti());
        System.out.println(negozio.removeFromItems(commesso, cellulare)); // mi aspetto true
        System.out.println(negozio.getProdotti()); // controllo che il cellulare sia stato rimosso dalla lista
        System.out.println(negozio.removeFromItems(boss, matita)); // mi aspetto false
        System.out.println(negozio.getProdotti()); // controllo che la lista non sia cambiata dalla stampa precedente
        System.out.println(negozio.removeFromItems(personaleAmministrativo, matita)); // mi aspetto false
        System.out.println(negozio.getProdotti()); // controllo che la lista non sia cambiata dalla stampa precedente
        System.out.println(negozio.removeFromItems(commesso, cellulare)); // mi aspetto false perchè l'oggetto non è più presente tra i prodotti
        System.out.println(negozio.getProdotti()); // controllo che la lista non sia cambiata dalla stampa precedente
        System.out.println(negozio.removeFromItems(commesso1, lavatrice)); //mi aspetto false perchè il commesso non è presente nel negozio
        System.out.println(negozio.getProdotti()); // controllo che la lista non sia cambiata dalla stampa precedente
        System.out.println("FINE TEST \n");
    }
}
