package com.foodnetwork.dao;

import com.foodnetwork.model.Recipe;

import java.sql.*;

/**
 * Created with IntelliJ IDEA.
 * User: danielabecker
 * Date: 7/20/14
 * Time: 8:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class RecipeJdbcDAO implements RecipeDAO{

    Connection connection;

    @Override
    public Recipe add(Recipe inputRecipe) {
        String sql = "";
        try {
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/Recipe","root","");
            PreparedStatement query = connection.prepareStatement(sql);
            ResultSet resultSet = query.executeQuery();
            //query.execute() <-- Ejecuta
            while(resultSet.next()){
               int valor = resultSet .getInt("columnName");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
