package com.tiodev.vegtummy.Model;

import android.net.Uri;

import androidx.annotation.NonNull;

public class Recipe {
    // Assuming these are the fields you have in your Recipe class
    private String imagePath;
    private String title;
    private String description;
    private String ingredients;
    private String category;
    private Long cookingTime;

    // No-argument constructor for Firebase - must
    public Recipe() {
    }

    // Constructor with arguments
    public Recipe(String imagePath, String title, String description, String ingredients, String category, Long cookingTime) {
        this.imagePath = imagePath;
        this.title = title;
        this.description = description;
        this.ingredients = ingredients;
        this.category = category;
        this.cookingTime = cookingTime;
    }

    // Getters and setters for all fields
    public Uri getImagePath() {
        return Uri.parse(this.imagePath);
    }

    public Long getCookingTime() { return this.cookingTime; }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getIngredients() {
        return ingredients;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setTitle(String title) { this.title = title; }

    public void setImagePath(String path) {this.imagePath = path;}

    public void setCookingTime(Long time) {this.cookingTime = time;}

    public void setDescription(String description) {this.description = description;}

    public  void setIngredients(String ingredients) {this.ingredients = ingredients;}

    @NonNull
    @Override
    public String toString() {
        return "Recipe{" +
                // Other fields...
                "cookingTime=" + cookingTime +
                '}';
    }


}
