package youssef.com.recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import youssef.com.recipeapp.domain.Category;


public interface CategoryRepository extends CrudRepository<Category, Long> {

    Category findByDescription(String description);
}
