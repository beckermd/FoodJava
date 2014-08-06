package com.foodnetwork.dao;

import com.foodnetwork.model.Recipe;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: danielabecker
 * Date: 7/20/14
 * Time: 8:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class RecipeJdbcDAO implements RecipeDAO {

    Connection connection;

    @Override
    public Recipe add(Recipe inputRecipe) {
           Recipe recipe = new Recipe();
        String sql = "INSERT INTO FoodNetwork.Recipes (Title,Poster,ShortDescrip,Ingredients,Directions) VALUES (?,?,?,?,?)";

        try {
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/FoodNetwork", "root", "");
            PreparedStatement query = connection.prepareStatement(sql);
            query.setString(1, inputRecipe.getTitle());
            query.setString(2, inputRecipe.getPoster());
            query.setString(3, inputRecipe.getShortDescription());
            query.setString(4, inputRecipe.getIngredients());
            query.setString(5, inputRecipe.getDirections());
            query.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
           recipe.setTitle("false");
        }

        recipe.setTitle("true");

        return recipe;
    }

    @Override
    public List<Recipe> getAllRecipes() {
        List<Recipe> recipeList = new ArrayList<Recipe>();

        String sqlSelect = "SELECT Title,Poster,ShortDescrip,Ingredients,Directions  FROM FoodNetwork.Recipes";

        try {
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/FoodNetwork", "root", "");
            Statement query = connection.createStatement();
            ResultSet resultSet = query.executeQuery(sqlSelect);

            while (resultSet.next()) {

                Recipe recipeResult = new Recipe();
                recipeResult.setTitle(resultSet.getString("Title"));
                recipeResult.setPoster(resultSet.getString("Poster"));
                recipeResult.setShortDescription(resultSet.getString("ShortDescrip"));
                recipeResult.setIngredients(resultSet.getString("Ingredients"));
                recipeResult.setDirections(resultSet.getString("Directions"));
                recipeList.add(recipeResult);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return recipeList;  //To change body of implemented methods use File | Settings | File Templates.
    }
}


