package guru.springframework.model;

import javax.persistence.*;
import java.util.List;

@Entity(name = "category")
public class CategoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryId;

    private String category;

    @ManyToMany(mappedBy = "categories")
    private List<RecipeEntitiy> recipes;

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<RecipeEntitiy> getRecipes() {
        return recipes;
    }

    public void setRecipes(List<RecipeEntitiy> recipes) {
        this.recipes = recipes;
    }
}
