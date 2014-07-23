package com.foodnetwork.model;

/**
 * Created with IntelliJ IDEA.
 * User: danielabecker
 * Date: 7/20/14
 * Time: 8:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class Recipe {

    private String title;
    private String poster;
    private String shortDescription;
    private String ingredients;
    private String directions;
    private String imageLocation;

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getDirections() {
        return directions;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }

    public String getImageLocation() {
        return imageLocation;
    }

    public void setImageLocation(String imageLocation) {
        this.imageLocation = imageLocation;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
