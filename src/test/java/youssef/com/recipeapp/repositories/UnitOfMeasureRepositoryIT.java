package youssef.com.recipeapp.repositories;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import youssef.com.recipeapp.domain.UnitOfMeasure;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
public class UnitOfMeasureRepositoryIT {

//    @Autowired
//    UnitOfMeasureRepository unitOfMeasureRepository;
//
//    @BeforeEach
//    public void setUp() throws Exception {
//    }
//
//    @Test
//    public void findByDescription() throws Exception {
//
//        Optional<UnitOfMeasure> uomOptional = Optional.ofNullable(unitOfMeasureRepository.findByDescription("Teaspoon"));
//
//        assertEquals("Teaspoon", uomOptional.get().getDescription());
//    }
//
//    @Test
//    public void findByDescriptionCup() throws Exception {
//
//        Optional<UnitOfMeasure> uomOptional = Optional.ofNullable(unitOfMeasureRepository.findByDescription("Cup"));
//
//        assertEquals("Cup", uomOptional.get().getDescription());
//    }

}