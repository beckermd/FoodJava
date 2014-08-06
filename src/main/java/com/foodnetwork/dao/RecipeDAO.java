package com.foodnetwork.dao;

import com.foodnetwork.model.Recipe;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: danielabecker
 * Date: 7/20/14
 * Time: 8:46 PM
 * To change this template use File | Settings | File Templates.
 */
public interface RecipeDAO {

    Recipe add(Recipe inputRecipe);

    /**
     * Return all recipes
      * @return List<Recipe> with all the recipes
     */
    List<Recipe> getAllRecipes();

}
