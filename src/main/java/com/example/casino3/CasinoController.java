package com.example.casino3;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CasinoController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("qualcosaltro");
    }
}