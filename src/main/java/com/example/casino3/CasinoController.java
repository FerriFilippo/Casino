package com.example.casino3;

import BlackJack.BlackJack;
import Slot.Conto;
import Slot.Slot;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.nio.file.Paths;

public class CasinoController {
    public Label lblFiches;
    public Label lblimportoGiocato;
    public Label lblRisultato;
    public Label lblImportoVinto;
    public Label lblConto;
    public Label lblRitiraSoldi;
    public Label lblRitiraFiches;
    public Label lblDepositaConto;
    public File f;
    public Image img;
    public FileInputStream file;
    public ImageView slot1;
    public ImageView slot2;
    public ImageView slot3;
    public Label lblImportoVintoBlack;
    public Label lblimportoGiocato1;
    public Label lblRisultatoBlack;

    public ImageView b1, b2, b3, b4, b5, b6, g1, g2, g3, g4, g5, g6;
    public ImageView[] giocatore, banco;
    public Image[] carte = new Image[13];

    Slot slot = new Slot();

    Conto conto= new Conto();
    public BlackJack blackJack;
    @FXML
    public void initialize() throws URISyntaxException, FileNotFoundException {
        giocatore = new ImageView[6];
        banco = new ImageView[6];
        banco[0] = b1;
        banco[1] = b2;
        banco[2] = b3;
        banco[3] = b4;
        banco[4] = b5;
        banco[5] = b6;
        giocatore[0] = g1;
        giocatore[1] = g2;
        giocatore[2] = g3;
        giocatore[3] = g4;
        giocatore[4] = g5;
        giocatore[5] = g6;
        f = Paths.get(CasinoController.class.getResource("carte/asso.png").toURI()).toFile();
        file = new FileInputStream(f);
        carte[0] = new Image(file);
        f = Paths.get(CasinoController.class.getResource("carte/due.png").toURI()).toFile();
        file = new FileInputStream(f);
        carte[1] = new Image(file);
        f = Paths.get(CasinoController.class.getResource("carte/tre.png").toURI()).toFile();
        file = new FileInputStream(f);
        carte[2] = new Image(file);
        f = Paths.get(CasinoController.class.getResource("carte/quattro.png").toURI()).toFile();
        file = new FileInputStream(f);
        carte[3] = new Image(file);
        f = Paths.get(CasinoController.class.getResource("carte/cinque.png").toURI()).toFile();
        file = new FileInputStream(f);
        carte[4] = new Image(file);
        f = Paths.get(CasinoController.class.getResource("carte/sei.png").toURI()).toFile();
        file = new FileInputStream(f);
        carte[5] = new Image(file);
        f = Paths.get(CasinoController.class.getResource("carte/sette.png").toURI()).toFile();
        file = new FileInputStream(f);
        carte[6] = new Image(file);
        f = Paths.get(CasinoController.class.getResource("carte/otto.png").toURI()).toFile();
        file = new FileInputStream(f);
        carte[7] = new Image(file);
        f = Paths.get(CasinoController.class.getResource("carte/nove.png").toURI()).toFile();
        file = new FileInputStream(f);
        carte[8] = new Image(file);
        f = Paths.get(CasinoController.class.getResource("carte/dieci.png").toURI()).toFile();
        file = new FileInputStream(f);
        carte[9] = new Image(file);
        f = Paths.get(CasinoController.class.getResource("carte/jack.png").toURI()).toFile();
        file = new FileInputStream(f);
        carte[10] = new Image(file);
        f = Paths.get(CasinoController.class.getResource("carte/donna.png").toURI()).toFile();
        file = new FileInputStream(f);
        carte[11] = new Image(file);
        f = Paths.get(CasinoController.class.getResource("carte/re.png").toURI()).toFile();
        file = new FileInputStream(f);
        carte[12] = new Image(file);
    }

//CONTO
    public void AumentaConto(ActionEvent actionEvent) {
        conto.Aumenta(1);
        lblDepositaConto.setText(""+ conto.getDepositaConto());
    }
    public void DiminuisciConto(ActionEvent actionEvent) {
        conto.Diminuisci(1);
        lblDepositaConto.setText(""+ conto.getDepositaConto());
    }
    public void AumentaRitisaFiches(ActionEvent actionEvent) {
        conto.Aumenta(2);
        lblRitiraFiches.setText(""+ conto.getRitiraFiches());
    }
    public void DiminuisciRitisaFiches(ActionEvent actionEvent) {
        conto.Diminuisci(2);
        lblRitiraFiches.setText(""+ conto.getRitiraFiches());
    }

    public void AumentaRitisaSoldi(ActionEvent actionEvent) {
        conto.Aumenta(3);
        lblRitiraSoldi.setText(""+ conto.getRitiraSoldi());
    }

    public void DiminuisciRitisaSoldi(ActionEvent actionEvent) {
        conto.Diminuisci(3);
        lblRitiraSoldi.setText(""+ conto.getRitiraSoldi());
    }
    public void AumentaGiocata(ActionEvent actionEvent) {
        conto.Aumenta(4);
        lblimportoGiocato.setText(""+ conto.getGiocata());
        lblimportoGiocato1.setText(""+ conto.getGiocata());
    }
    public void DiminuisciGiocata(ActionEvent actionEvent) {
        conto.Diminuisci(4);
        lblimportoGiocato.setText(""+ conto.getGiocata());
        lblimportoGiocato1.setText(""+ conto.getGiocata());
    }


    public void DepositaConto(ActionEvent actionEvent) {
        conto.ImpostaConto();
        conto.Azzera(1);
        lblDepositaConto.setText(""+ conto.getDepositaConto());
        lblConto.setText("" + conto.getConto());
    }

    public void RitiraFiches(ActionEvent actionEvent) {
        conto.ImpostaFiches();
        conto.Azzera(2);
        lblConto.setText(""+conto.getConto());
        lblFiches.setText(""+conto.getFiches());
        lblRitiraFiches.setText(""+conto.getRitiraFiches());
    }

    public void RitiraSoldi(ActionEvent actionEvent) {
        conto.RitiraSoldi();
        conto.Azzera(3);
        lblConto.setText(""+conto.getConto());
        lblFiches.setText(""+conto.getFiches());
        lblRitiraSoldi.setText(""+conto.getRitiraSoldi());
    }

    //SLOT
    public void onGiocaSlotButtonClick(ActionEvent actionEvent) throws URISyntaxException, FileNotFoundException {
        if(conto.getFiches()>=conto.getGiocata()){
            conto.gioca();
            slot.Spin();
            conto.ritira(conto.getGiocata() * slot.CheckWin());
            lblFiches.setText(""+conto.getFiches());
        }
        if (slot.getDisplay()[0] == 0){
            f  = Paths.get(CasinoController.class.getResource("Immagini/ciliegia.png").toURI()).toFile();
        }
        else if (slot.getDisplay()[0] == 1){
            f  = Paths.get(CasinoController.class.getResource("Immagini/uva.png").toURI()).toFile();
        }
        else if (slot.getDisplay()[0] == 2){
            f  = Paths.get(CasinoController.class.getResource("Immagini/anguria.png").toURI()).toFile();
        }
        else if (slot.getDisplay()[0] == 3){
            f  = Paths.get(CasinoController.class.getResource("Immagini/limone.png").toURI()).toFile();
        }
        else if (slot.getDisplay()[0] == 4){
            f  = Paths.get(CasinoController.class.getResource("Immagini/sette.png").toURI()).toFile();
        }
        else if (slot.getDisplay()[0] == 5){
            f  = Paths.get(CasinoController.class.getResource("Immagini/triplo-sette.png").toURI()).toFile();
        }
        else if (slot.getDisplay()[0] == 6){
             f  = Paths.get(CasinoController.class.getResource("Immagini/diamante.png").toURI()).toFile();
        }
        file = new FileInputStream(f);
        img = new Image(file);
        this.slot1.setImage(img);
        if (slot.getDisplay()[1] == 0){
            f  = Paths.get(CasinoController.class.getResource("Immagini/ciliegia.png").toURI()).toFile();
        }
        else if (slot.getDisplay()[1] == 1){
            f  = Paths.get(CasinoController.class.getResource("Immagini/uva.png").toURI()).toFile();
        }
        else if (slot.getDisplay()[1] == 2){
            f  = Paths.get(CasinoController.class.getResource("Immagini/anguria.png").toURI()).toFile();
        }
        else if (slot.getDisplay()[1] == 3){
            f  = Paths.get(CasinoController.class.getResource("Immagini/limone.png").toURI()).toFile();
        }
        else if (slot.getDisplay()[1] == 4){
            f  = Paths.get(CasinoController.class.getResource("Immagini/sette.png").toURI()).toFile();
        }
        else if (slot.getDisplay()[1] == 5){
            f  = Paths.get(CasinoController.class.getResource("Immagini/triplo-sette.png").toURI()).toFile();
        }
        else if (slot.getDisplay()[1] == 6){
            f  = Paths.get(CasinoController.class.getResource("Immagini/diamante.png").toURI()).toFile();
        }
        file = new FileInputStream(f);
        img = new Image(file);
        this.slot2.setImage(img);

        if (slot.getDisplay()[2] == 0){
            f  = Paths.get(CasinoController.class.getResource("Immagini/ciliegia.png").toURI()).toFile();
        }
        else if (slot.getDisplay()[2] == 1){
            f  = Paths.get(CasinoController.class.getResource("Immagini/uva.png").toURI()).toFile();
        }
        else if (slot.getDisplay()[2] == 2){
            f  = Paths.get(CasinoController.class.getResource("Immagini/anguria.png").toURI()).toFile();
        }
        else if (slot.getDisplay()[2] == 3){
            f  = Paths.get(CasinoController.class.getResource("Immagini/limone.png").toURI()).toFile();
        }
        else if (slot.getDisplay()[2] == 4){
            f  = Paths.get(CasinoController.class.getResource("Immagini/sette.png").toURI()).toFile();
        }
        else if (slot.getDisplay()[2] == 5){
            f  = Paths.get(CasinoController.class.getResource("Immagini/triplo-sette.png").toURI()).toFile();
        }
        else if (slot.getDisplay()[2] == 6){
            f  = Paths.get(CasinoController.class.getResource("Immagini/diamante.png").toURI()).toFile();
        }
        file = new FileInputStream(f);
        img = new Image(file);
        this.slot3.setImage(img);
        if (slot.CheckWin()!= 0){
            lblRisultato.setText("hai vinto:");
            lblImportoVinto.setText(""+ (conto.getGiocata()*slot.CheckWin()));
        }else {
            lblRisultato.setText("hai perso");
            lblImportoVinto.setText(""+conto.getGiocata());
        }
    }

    //BLACKJACK
    public void onCartaButtonClick(ActionEvent actionEvent) {
        if(blackJack.giocabile()) {
            blackJack.pescaG();
            giocatore[blackJack.getCartaG() - 1].setImage(carte[blackJack.getvaloreG(blackJack.getCartaG() - 1) - 1]);
            giocatore[blackJack.getCartaG() - 1].setVisible(true);
        }
    }

    public void onStopButtonClick(ActionEvent actionEvent) {
        blackJack.giocaB();
        banco[0].setImage(carte[blackJack.primoB()-1]);
        banco[0].setVisible(true);
        for (int i = 2; i < blackJack.getCartaB(); i++) {
            banco[i].setImage(carte[blackJack.getvaloreB(blackJack.getCartaB()-1)-1]);
            banco[i].setVisible(true);
        }
        if(blackJack.vittoria() != 0)
            lblRisultatoBlack.setText("hai vinto");
        else
            lblRisultatoBlack.setText("hai perso");
        conto.ritira((int)(conto.getGiocata() * blackJack.vittoria()));
        lblImportoVintoBlack.setText("" + conto.getGiocata() * blackJack.vittoria());
    }

    public void onGiocaBlackjackButtonClick(ActionEvent actionEvent) {
        blackJack = new BlackJack();
        giocatore[2].setVisible(false);
        giocatore[3].setVisible(false);
        giocatore[4].setVisible(false);
        giocatore[5].setVisible(false);
        giocatore[0].setImage(carte[blackJack.primoG() -1 ]);
        giocatore[1].setImage(carte[blackJack.secondoG() - 1]);
        banco[1].setImage(carte[blackJack.secondoB() - 1]);
        banco[0].setVisible(false);
        banco[2].setVisible(false);
        banco[3].setVisible(false);
        banco[4].setVisible(false);
        banco[5].setVisible(false);
    }

}