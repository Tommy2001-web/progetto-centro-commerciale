package it.prova.centrocommerciale.models;

public abstract class Lavoratore {

    protected String nome;
    protected String cognome;
    protected Negozio negozio;

    public Lavoratore() {

    }

    public Lavoratore(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    public Lavoratore(String nome, String cognome, Negozio negozio) {
        this.nome = nome;
        this.cognome = cognome;
        this.negozio = negozio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Negozio getNegozio() {
        return negozio;
    }

    public void setNegozio(Negozio negozio) {
        this.negozio = negozio;
    }

    @Override
    public String toString() {
        return "Lavoratore{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", negozio=" + negozio +
                '}';
    }
}
