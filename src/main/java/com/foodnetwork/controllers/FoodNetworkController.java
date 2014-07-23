package com.foodnetwork.controllers;

import com.foodnetwork.dao.RecipeDAO;
import com.foodnetwork.dao.RecipeMockDAO;
import com.foodnetwork.model.Recipe;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: danielabecker
 * Date: 7/19/14
 * Time: 6:43 PM
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class FoodNetworkController {

    private RecipeDAO dao = new RecipeMockDAO();

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/newrecipe")
    public String newRecipe() {
        return "newrecipe";
    }

    @RequestMapping(value = "/addRecipe", method = RequestMethod.POST)
    public String addRecipe() {
        dao.add(new Recipe());
        return "showrecipe";
    }

    @RequestMapping("/*")
    public void notSupported(HttpServletResponse response) throws IOException {
        response.sendError(HttpServletResponse.SC_UNSUPPORTED_MEDIA_TYPE);
    }

}
