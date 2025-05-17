package main.java.com.quicklap.ui.dialogs;

import main.java.com.quicklap.core.Laptop;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.*;

public class ProductDetailDialog extends Dialog<Void> {
    public ProductDetailDialog(Laptop laptop) {
        setTitle(laptop.getName());
        setHeaderText("Product Details");
        
        // Create layout
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(20));
        
        // Add product details
        grid.add(new Label("Brand:"), 0, 0);
        grid.add(new Label(laptop.getBrand()), 1, 0);
        
        grid.add(new Label("Price:"), 0, 1);
        grid.add(new Label(String.format("%,d VND", laptop.getPrice())), 1, 1);
        
        // Add more details as needed...
        
        getDialogPane().setContent(grid);
        getDialogPane().getButtonTypes().add(ButtonType.CLOSE);
    }
}
