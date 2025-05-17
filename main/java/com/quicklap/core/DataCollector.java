package main.java.com.quicklap.core;

import java.util.Arrays;
import java.util.List;

public class DataCollector {
    public List<Laptop> collectSampleData() {
        // Mock data - in real app, this would scrape from websites
        Laptop laptop1 = new Laptop("TIKI_ASUS_123", "Asus Zenbook", "Asus", 18990000);
        laptop1.setCpu("Intel Core i7");
        laptop1.setRam(16);
        laptop1.setDiskType("SSD");
        
        Laptop laptop2 = new Laptop("TIKI_DELL_456", "Dell XPS 15", "Dell", 24990000);
        laptop2.setCpu("Intel Core i9");
        laptop2.setRam(32);
        laptop2.setDiskType("SSD");
        
        // Add reviews
        laptop1.addReview(new Review("user1", 4.5, "Great battery life"));
        laptop2.addReview(new Review("user2", 5.0, "Perfect for programming"));
        
        return Arrays.asList(laptop1, laptop2);
    }
}