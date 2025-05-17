package main.java.com.quicklap.core;

import java.time.LocalDate;

public class Review {
    private String userId;
    private double rating;
    private String comment;
    private LocalDate date;

    public Review(String userId, double rating, String comment) {
        this.userId = userId;
        this.rating = rating;
        this.comment = comment;
        this.date = LocalDate.now();
    }

    // Getters
    public double getRating() { return rating; }
    public String getComment() { return comment; }
    public LocalDate getDate() { return date; }

    public String getSentiment() {
        return rating >= 4 ? "Positive" : rating >= 2 ? "Neutral" : "Negative";
    }

    @Override
    public String toString() {
        return rating + " stars - " + comment;
    }
}