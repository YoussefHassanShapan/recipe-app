package youssef.com.recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import youssef.com.recipeapp.domain.UnitOfMeasure;


public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

    UnitOfMeasure findByDescription(String description);
}
