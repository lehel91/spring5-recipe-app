package guru.springframework.services;

import guru.springframework.domain.Recipe;

import java.util.Set;

/**
 * @author lehel
 */

public interface RecipeService {

    Set<Recipe> getRecipes();
}
