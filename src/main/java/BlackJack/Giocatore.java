package BlackJack;

public class Giocatore {
    private Carta[] mano;
    private int somma;

    int n_carta;

    public Giocatore(){
        this.mano = new Carta[6];
        this.somma = 0;
        this.n_carta = 0;
    }

    public int getSomma(){
        return somma;
    }

    public void aggiungi_carta(int n, Carta c){
        mano[n] = c;
        n_carta++;
    }

    public boolean sballato(){
        return somma > 21;
    }

    public int getN_carta(){
        return n_carta;
    }
}
