package main.java.com.quicklap.core;

import java.util.ArrayList;
import java.util.List;

public class Laptop {
    private String id;
    private String name;
    private String brand;
    private String category;
    private String os;
    private int price;
    private String description;
    private List<Review> reviews = new ArrayList<>();
    private String cpu;
    private String gpu;
    private int ram;
    private String diskType;

    // Constructor
    public Laptop(String id, String name, String brand, int price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    // Getters and Setters
    public String getId() { return id; }
    public String getName() { return name; }
    public String getBrand() { return brand; }
    public int getPrice() { return price; }
    public List<Review> getReviews() { return reviews; }
    public String getCpu() { return cpu; }
    public void setCpu(String cpu) { this.cpu = cpu; }
    public String getGpu() { return gpu; }
    public void setGpu(String gpu) { this.gpu = gpu; }
    public int getRam() { return ram; }
    public void setRam(int ram) { this.ram = ram; }
    public String getDiskType() { return diskType; }
    public void setDiskType(String diskType) { this.diskType = diskType; }

    public void addReview(Review review) {
        reviews.add(review);
    }

    @Override
    public String toString() {
        return name + " (" + brand + ") - " + price + "VND";
    }
}
