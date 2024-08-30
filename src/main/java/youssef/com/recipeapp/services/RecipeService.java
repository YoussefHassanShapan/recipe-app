package youssef.com.recipeapp.services;


import youssef.com.recipeapp.commands.RecipeCommand;
import youssef.com.recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand findCommandById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    void deleteById(Long idToDelete);

}
