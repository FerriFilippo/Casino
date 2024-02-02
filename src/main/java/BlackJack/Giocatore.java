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

    public void aggiungi_carta(Carta c){
        mano[n_carta] = c;
        n_carta++;
        if(c.getValore() >= 10){
            somma+=10;
        }else{
            somma+=c.getValore();
        }
    }

    public Carta getCarta(int n){
        return mano[n];
    }

    public Carta[] getMano(){
        Carta[] temp = new Carta[2];
        temp[0] = mano[0];
        temp[1] = mano[1];
        return temp;
    }
    public boolean sballato(){
        return somma > 21;
    }

    public int getN_carta(){
        return n_carta;
    }
}
