package com.foodnetwork.dao;

import com.foodnetwork.model.Recipe;

import java.util.List;

public class RecipeMockDAO implements RecipeDAO {

    @Override
    public Recipe add(Recipe inputRecipe){
        Recipe recipe = new Recipe();
        recipe.setTitle(inputRecipe.getTitle());
        recipe.setPoster(inputRecipe.getPoster());
        recipe.setShortDescription(inputRecipe.getShortDescription());
        recipe.setIngredients(inputRecipe.getIngredients());
        recipe.setDirections(inputRecipe.getDirections());
        recipe.setImageLocation(inputRecipe.getImageLocation());
        return recipe;

    }

    @Override
    public List<Recipe> getAllRecipes() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
