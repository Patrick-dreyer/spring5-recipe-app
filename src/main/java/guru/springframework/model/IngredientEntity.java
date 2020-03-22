package guru.springframework.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity(name = "ingredient")
public class IngredientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ingredientId;
    @Lob
    private String descreption;
    private BigDecimal amount;

    @ManyToOne
    private RecipeEntitiy receipes;

    @OneToOne(fetch = FetchType.EAGER)
    private UnitOfMeasureEntity unitOfMeasure;


    public Long getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(Long ingredientId) {
        this.ingredientId = ingredientId;
    }

    public String getDescreption() {
        return descreption;
    }

    public void setDescreption(String descreption) {
        this.descreption = descreption;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public RecipeEntitiy getReceipes() {
        return receipes;
    }

    public void setReceipes(RecipeEntitiy receipes) {
        this.receipes = receipes;
    }
}
