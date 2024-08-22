package youssef.com.recipeapp.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;
import youssef.com.recipeapp.repositories.RecipeRepository;
import youssef.com.recipeapp.services.RecipeService;
import youssef.com.recipeapp.services.RecipeServiceImpl;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

class IndexControllerTest {
    @Mock
    IndexController indexController;
@Mock
    Model model;

    RecipeService recipeService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        indexController = new IndexController(recipeService);
    }

    @Test
    void getIndexPage() {
        String viewName = indexController.getIndexPage(model);
        assertEquals("Index",viewName);
        verify(recipeService,times(1));
    }
}