package com.example.casino3;

import BlackJack.BlackJack;
import Slot.Conto;
import Slot.Slot;
import javafx.event.ActionEvent;
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
    public ImageView slot1;
    public ImageView slot2;
    public ImageView slot3;
    public Label lblImportoVintoBlack;
    public Label lblimportoGiocato1;
    public Label lblRisultatoBlack;

    Image[] carte = new Image[13];

    Slot slot = new Slot();

    Conto conto= new Conto();
    BlackJack blackJack = new BlackJack();

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
        FileInputStream file = new FileInputStream(f);
        Image img = new Image(file);
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
        blackJack.pescaG();
    }

    public void onStopButtonClick(ActionEvent actionEvent) {
        blackJack.giocaB();
        conto.ritira((int)(conto.getGiocata() * blackJack.vittoria()));
    }

    public void onGiocaBlackjackButtonClick(ActionEvent actionEvent) {

    }

}