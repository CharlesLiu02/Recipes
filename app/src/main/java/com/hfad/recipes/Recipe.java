package com.hfad.recipes;

public class Recipe {
    private String title;
    private String href;
    private String ingredients;
    private String thumbnail;

    //need a default constructor because backendless needs to create an instance of the object
    //but it doesn't know the order of values in the constructor
    //so it creates an object using the default constructor and then sets the properties using the setters
    public Recipe() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "title='" + title + '\'' +
                ", href='" + href + '\'' +
                ", ingredients='" + ingredients + '\'' +
                ", thumbnail='" + thumbnail + '\'' +
                '}';
    }
}
