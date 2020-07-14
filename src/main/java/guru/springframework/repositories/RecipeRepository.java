package guru.springframework.repositories;

import guru.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * @author lehel
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
