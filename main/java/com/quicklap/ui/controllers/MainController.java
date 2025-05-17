package main.java.com.quicklap.ui.controllers;

import main.java.com.quicklap.core.SearchEngine;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;

public class MainController {
    @FXML private TextArea searchInput;
    @FXML private ListView<String> productList;
    
    private SearchEngine searchEngine = new SearchEngine();

    @FXML
    public void initialize() {
        // Load sample data
        refreshProductList();
    }

    @FXML
    private void handleSearch() {
        refreshProductList();
    }

    private void refreshProductList() {
        productList.getItems().clear();
        searchEngine.search(searchInput.getText())
            .forEach(laptop -> productList.getItems().add(laptop.toString()));
    }
}
