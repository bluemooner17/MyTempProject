package main.java.com.quicklap.core;

import java.util.List;

public class RAGIntegration {
    public String retrieveAndGenerate(String query, List<Laptop> context) {
        // Mock implementation - real app would call LLM API
        if (query.toLowerCase().contains("cheap")) {
            return "For budget options, consider: " + 
                   context.stream()
                          .filter(l -> l.getPrice() < 15000000)
                          .findFirst()
                          .orElse(null);
        }
        return "Here are some laptops matching your query: " + context;
    }
}