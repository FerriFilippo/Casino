public class Slot {
    private int[] display;

    public Slot(){
        this.display = new int[3];
    }

    public void Spin(){
        for (int i = 0; i < 3; i++) {
            this.display[i] = (int)(Math.random() * 7);
        }
    }

    private int contasei(){
        int n = 0;
        for (int i = 0; i < 3; i++) {
            if(display[i] == 6)
                n++;
        }
        return n;
    }

    public int CheckWin(){
        if(contasei() == 1)
            return 2;
        else if(contasei() == 2)
            return 5;
        else if(display[0] == display[1] && display[1] == display[2] && display[0] == 0)
            return 25;
        else if(display[0] == display[1] && display[1] == display[2] && display[0] == 1)
            return 50;
        else if(display[0] == display[1] && display[1] == display[2] && display[0] == 2)
            return 75;
        else if(display[0] == display[1] && display[1] == display[2] && display[0] == 3)
            return 100;
        else if(display[0] == display[1] && display[1] == display[2] && display[0] == 4)
            return 250;
        else if(display[0] == display[1] && display[1] == display[2] && display[0] == 5)
            return 1000;
        else if(contasei() == 3)
            return 500;
        else
            return 0;
    }

    public int[] getDisplay(){
        int[] temp = new int[3];
        for (int i = 0; i < 3; i++) {
            temp[i] = display[i];
        }
        return temp;
    }
}

