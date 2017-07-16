package recipe.domain;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "recipes", path = "recipes")
public interface RecipeRepository extends MongoRepository<Recipe, String> {

    List<Recipe> findAllByTagsContaining(@Param("tag") String tag);

}
