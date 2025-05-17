module com.quicklap {
    requires javafx.controls;
    requires javafx.fxml;
    
    opens main.java.com.quicklap.ui to javafx.fxml;
    exports main.java.com.quicklap.ui;
}