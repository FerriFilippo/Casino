package Slot;

public class Conto {
    private int DepositaConto;
    private int RitiraFiches;
    private int RitiraSoldi;
    private int Giocata;
    private int Conto;
    private int Fiches;
    public Conto (){
        this.DepositaConto =0;
        this.RitiraFiches =0;
        this.RitiraSoldi=0;
        this.Giocata=0;
        this.Conto=0;
        this.Fiches=0;
    }

    public void Aumenta(int k){
        if (k==1)
            DepositaConto +=500;
        if (k==2)
            RitiraFiches +=500;
        if (k==3)
            RitiraSoldi+=500;
        if (k==4 && Giocata<5000)
            Giocata+=500;
    }

    public void Diminuisci(int k){
        if (k==1)
            DepositaConto -=500;
        if (k==2)
            RitiraFiches -=500;
        if (k==3)
            RitiraSoldi-=500;
        if (k==4)
            Giocata-=500;

        if (DepositaConto <0 )
            DepositaConto =0;
        if (RitiraFiches <0 )
            RitiraFiches =0;
        if (RitiraSoldi<0 )
            RitiraSoldi=0;
        if (Giocata<0 )
            Giocata=0;
    }

    public void Azzera(int k){
        if (k==1)
            DepositaConto=0;
        if (k==2)
            RitiraFiches=0;
        if (k==3)
            RitiraSoldi=0;
    }

    public void ImpostaConto(){
        Conto += DepositaConto;
    }
    public void ImpostaFiches(){
        if (Conto>=RitiraFiches){
            Conto -= RitiraFiches;
            Fiches += RitiraFiches;
        }
    }

    public void RitiraSoldi(){
        if (Fiches>= RitiraSoldi) {
            Conto += RitiraSoldi;
            Fiches -= RitiraSoldi;
        }
    }

    public void gioca(){
        Fiches -= Giocata;
    }


    public void ritira(int n){
        Fiches += n;
    }


    public int getGiocata() {
        return Giocata;
    }

    public int getDepositaConto() {
        return DepositaConto;
    }

    public int getRitiraFiches() {
        return RitiraFiches;
    }

    public int getRitiraSoldi() {
        return RitiraSoldi;
    }

    public int getConto() {
        return Conto;
    }

    public int getFiches() {
        return Fiches;
    }
}
