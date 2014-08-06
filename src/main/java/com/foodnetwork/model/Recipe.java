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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Recipe recipe = (Recipe) o;

        if (directions != null ? !directions.equals(recipe.directions) : recipe.directions != null) return false;
        if (ingredients != null ? !ingredients.equals(recipe.ingredients) : recipe.ingredients != null) return false;
        if (poster != null ? !poster.equals(recipe.poster) : recipe.poster != null) return false;
        if (shortDescription != null ? !shortDescription.equals(recipe.shortDescription) : recipe.shortDescription != null)
            return false;
        if (title != null ? !title.equals(recipe.title) : recipe.title != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
          result = 31 * result + (poster != null ? poster.hashCode() : 0);
          result = 31 * result + (shortDescription != null ? shortDescription.hashCode() : 0);
          result = 31 * result + (ingredients != null ? ingredients.hashCode() : 0);
          result = 31 * result + (directions != null ? directions.hashCode() : 0);
        return result;
    }
}
