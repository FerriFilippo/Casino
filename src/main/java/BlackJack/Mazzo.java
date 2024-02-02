package BlackJack;

public class Mazzo {
    private Carta[] mazzo;

    public Mazzo(){
        int conta = 0;
        mazzo = new Carta[52];
        String s = "";
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 14; j++) {
                if(i == 0){
                    s ="cuori";
                }
                if(i == 1){
                    s ="quadri";
                }
                if(i == 2){
                    s ="picche";
                }
                if(i == 3){
                    s = "fiori";
                }
                Carta c = new Carta(j, s);
                mazzo[conta] = c;
                conta++;
            }
        }
        mescola();
    }

    private void mescola(){
        for (int i = 0; i < 1000; i++) {
            int i1 = (int) (Math.random() * 52);
            int i2 = (int) (Math.random() * 52);
            Carta temp = mazzo[i1];
            mazzo[i1] = mazzo[i2];
            mazzo[i2] = temp;
        }
    }

    public Carta pesca(int n){
        return mazzo[n];
    }
}
