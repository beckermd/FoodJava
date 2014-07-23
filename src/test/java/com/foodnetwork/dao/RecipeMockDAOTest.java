package com.foodnetwork.dao;

import com.foodnetwork.model.Recipe;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RecipeMockDAOTest {
    private RecipeMockDAO recipeMockDAO = new RecipeMockDAO();

    @Test
    public void testAdd() throws Exception {
        //Setup

        Recipe inputRecipe = new Recipe();
        inputRecipe.setTitle("Lemon Pie");
        inputRecipe.setPoster("Carlos");
        inputRecipe.setShortDescription("Rico y Saludable");
        inputRecipe.setIngredients("Harina 130 gr");
        inputRecipe.setDirections("mezclar todo");
        inputRecipe.setImageLocation("/img");


        //Exec
        Recipe recipe = recipeMockDAO.add(inputRecipe);

        //Assert
        assertThat(recipe.getTitle(), is(inputRecipe.getTitle()));
        assertThat(recipe.getPoster(), is(inputRecipe.getPoster()));
        assertThat(recipe.getShortDescription(),is(inputRecipe.getShortDescription()));
        assertThat(recipe.getIngredients(),is(inputRecipe.getIngredients()));
        assertThat(recipe.getDirections(), is(inputRecipe.getDirections()));
        assertThat(recipe.getImageLocation(), is(inputRecipe.getImageLocation()));
    }

    //Generar un test por cada escenario posible del RecipeMockDAO (Errores, etc)

    public void testQuery() {

    }
}
