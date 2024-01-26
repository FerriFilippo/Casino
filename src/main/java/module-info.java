module com.example.casino3 {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.casino3 to javafx.fxml;
    exports com.example.casino3;
    opens Slot to javafx.fxml;
    exports Slot;
}