package guru.springframework.repository;

import guru.springframework.model.CategoryEntity;
import guru.springframework.model.RecipeEntitiy;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RecipeRepository extends CrudRepository<RecipeEntitiy, Long> {

    Optional<RecipeEntitiy> findByDescription(String describtion);

}
