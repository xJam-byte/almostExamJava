package com.example.almostexam.services;

import com.example.almostexam.dto.RecipeDto;
import com.example.almostexam.entity.Recipe;
import com.example.almostexam.repositories.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class RecipeService {
    private RecipeRepository recipeRepository;

    @Autowired
    public RecipeService(RecipeRepository rR){
        this.recipeRepository = rR;
    }

    public void create(RecipeDto recipeDto){
        Recipe recipe = new Recipe();
        recipe.setDescription(recipeDto.getDescription());
        recipe.setRating(recipeDto.getRating());
        recipe.setTitle(recipeDto.getTitle());
        recipeRepository.save(recipe);
    }
}
