package main.java.com.quicklap.ui.controls;

import main.java.com.quicklap.core.Laptop;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class LaptopListItem extends HBox {
    public LaptopListItem(Laptop laptop) {
        // Setup item layout
  //      ImageView imageView = new ImageView(new Image(laptop.getImageUrl()));
 //       imageView.setFitWidth(120);
  //      imageView.setFitHeight(90);
      //  imageView.setPreserveRatio(true);
        
        VBox infoBox = new VBox(5);
        Label nameLabel = new Label(laptop.getName());
        nameLabel.setStyle("-fx-font-weight: bold; -fx-font-size: 14px;");
        
        Label specsLabel = new Label(String.format("%s | %s | %sGB RAM | %s", 
            laptop.getCpu(), laptop.getGpu(), laptop.getRam(), laptop.getDiskType()));
        
        Label priceLabel = new Label(String.format("%,d VND", laptop.getPrice()));
        priceLabel.setStyle("-fx-font-weight: bold; -fx-text-fill: #2a52be;");
        
        infoBox.getChildren().addAll(nameLabel, specsLabel, priceLabel);
        
        this.setSpacing(10);
    //    this.getChildren().addAll(imageView, infoBox);
    }
}
