package com.foodnetwork.dao;

import com.foodnetwork.model.Recipe;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: danielabecker
 * Date: 7/22/14
 * Time: 8:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class RecipeJdbcDAOTest {
    private RecipeJdbcDAO recipeJdbcDAO = new RecipeJdbcDAO();

    @Test
    public void testAdd() {

        Recipe inputRecipe = new Recipe();
        inputRecipe.setTitle("Lemon Pie");
        inputRecipe.setPoster("Carlos");
        inputRecipe.setShortDescription("Rico y Saludable");
        inputRecipe.setIngredients("Harina 130 gr");
        inputRecipe.setDirections("mezclar todo");
        inputRecipe.setImageLocation("/img");


        //Exec
        Recipe recipe = recipeJdbcDAO.add(inputRecipe);

        //Assert
        assertThat(recipe.getTitle(), is("true"));



    }

    @Test
    public void testShow() {
        Recipe recipe = new Recipe();
        recipe.setTitle("Lemon Pie");
        recipe.setPoster("Carlos");
        recipe.setShortDescription("");
        recipe.setIngredients("Harina 130 gr");
        recipe.setDirections("mezclar todo");
        List<Recipe> recipes = recipeJdbcDAO.getAllRecipes();


        assertThat(recipes, hasItem(recipe));
    }


}

