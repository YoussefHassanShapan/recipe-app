package youssef.com.recipeapp.domain;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {

    public static   Category category;
    
    @BeforeAll
    public static void setUp(){
        category = new Category();
    }
    
    @Test
    void getId() {
        Long id = 4L;
        category.setId(id);
        assertEquals(id,category.getId());
    }

    @Test
    void getDescription() {
    }

    @Test
    void getRecipes() {
    }
}