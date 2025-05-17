package main.java.com.quicklap.core;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SearchEngine {
    private List<Laptop> laptops;

    public SearchEngine() {
        this.laptops = new DataCollector().collectSampleData();
    }

    public List<Laptop> search(String query) {
        if (query == null || query.isEmpty()) {
            return laptops;
        }
        
        String lowerQuery = query.toLowerCase();
        return laptops.stream()
            .filter(l -> l.getName().toLowerCase().contains(lowerQuery) || 
                        l.getBrand().toLowerCase().contains(lowerQuery))
            .collect(Collectors.toList());
    }

    public List<Laptop> getAllLaptops() {
        return new ArrayList<>(laptops);
    }
}