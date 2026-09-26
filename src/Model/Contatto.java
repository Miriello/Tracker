package Model;

public class Contatto {
    private String nome;
    private String cognome;
    private String codiceFiscale;

    public Contatto(String nome, String cognome, String codiceFiscale){
        this.nome=nome;
        this.cognome=cognome;
        this.codiceFiscale=codiceFiscale;
    }

    public Contatto(Contatto c ){
        this.nome=c.nome;
        this.cognome=c.cognome;
        this.codiceFiscale=c.codiceFiscale;
    }

    public String getNome(){
        return nome;
    }

    public String getCognome(){
        return cognome;
    }

    public String getCodiceFiscale(){
        return codiceFiscale;
    }
}
