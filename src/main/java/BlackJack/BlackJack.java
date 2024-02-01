package BlackJack;

public class BlackJack {
    private Giocatore g, banco;
    int n_carte, cartaG, cartaB;

    Mazzo m;

    public BlackJack(){
        g = new Giocatore();
        banco = new Giocatore();
        n_carte = 0;
        cartaB = 0;
        cartaG = 0;
        m = new Mazzo();
        pescaG();
        pescaG();
        pescaB();
        pescaB();
    }

    public void pescaG(){
        g.aggiungi_carta(cartaG, m.pesca(n_carte));
        n_carte++;
        cartaG++;
        if(g.getSomma() == 21)
            giocaB();
    }

    private void pescaB(){
        banco.aggiungi_carta(cartaB, m.pesca(n_carte));
        n_carte++;
        cartaB++;
    }

    public void giocaB(){
        while(banco.getSomma() < g.getSomma() && banco.getSomma() < 17 && !g.sballato()){
            pescaB();
        }
    }

    public double vittoria(){
        if(g.sballato())
            return 0;
        else if(banco.sballato())
            return 2;
        else if(g.getSomma() > banco.getSomma())
            if(g.getSomma() == 21 && g.getN_carta() == 2)
                return 2.50;
            else
                return 2;
        else if(g.getSomma() == banco.getSomma())
            return 1;
        else
            if(banco.getSomma() == 21 && banco.getN_carta() == 2)
                return 1;
            else
                return 0;
    }
}
