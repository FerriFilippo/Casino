package com.example.casino3;

import Slot.Conto;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class CasinoController {
    public Label lblFiches;
    public Label lblimportoGiocato;
    public Label lblRisultato;
    public Label lblImportoVinto;
    public Label lblConto;
    public Label lblRitiraSoldi;
    public Label lblRitiraFiches;
    public Label lblDepositaConto;
    public Label Risultato;
    public Label importoGiocato;

    Conto conto= new Conto();


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
    }
    public void DiminuisciGiocata(ActionEvent actionEvent) {
        conto.Diminuisci(4);
        lblimportoGiocato.setText(""+ conto.getGiocata());
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

    public void GiocaSlot(ActionEvent actionEvent) {

    }
}