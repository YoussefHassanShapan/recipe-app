package youssef.com.recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import youssef.com.recipeapp.domain.Recipe;


public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
