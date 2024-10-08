package youssef.com.recipeapp.controllers;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import youssef.com.recipeapp.commands.RecipeCommand;
import youssef.com.recipeapp.services.RecipeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;



@Slf4j
@Controller
public class RecipeController {

    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping("/recipe/{id}/show")
    public String showById(@PathVariable String id, Model model) {

        model.addAttribute("recipe", recipeService.findById(Long.valueOf(id)));
        return "recipe/show";
    }

    @GetMapping("recipe/new")
    public String newRecipe(Model model) {
        model.addAttribute("recipe", new RecipeCommand());

        return "recipe/recipeform";
    }

    @GetMapping("recipe/{id}/update")
    public String updateRecipe(@PathVariable String id, Model model) {
        model.addAttribute("recipe",
                recipeService.findCommandById(Long.valueOf(id)));
        return "recipe/recipeform";
    }

    @PostMapping("recipe")
    public String saveOrUpdate(@ModelAttribute RecipeCommand command) {
        RecipeCommand savedCommand = recipeService.saveRecipeCommand(command);
        if (savedCommand != null) {
            return "redirect:/recipe/" + savedCommand.getId() + "/show";
        } else {
            return "redirect:/recipe/show";
        }
    }

    @GetMapping("/recipe/{id}/delete")
    public String deleteById(@PathVariable String id) {
     recipeService.deleteById(Long.valueOf(id));
     return "redirect:/";
    }
}