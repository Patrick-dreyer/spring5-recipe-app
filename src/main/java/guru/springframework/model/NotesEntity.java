package guru.springframework.model;

import javax.persistence.*;

@Entity
public class NotesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long noteId;

    @Lob
    private String notes;

    @OneToOne
    private RecipeEntitiy recipeEntitiy;

    public Long getNoteId() {
        return noteId;
    }

    public void setNoteId(Long noteId) {
        this.noteId = noteId;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public RecipeEntitiy getRecipeEntitiy() {
        return recipeEntitiy;
    }

    public void setRecipeEntitiy(RecipeEntitiy recipeEntitiy) {
        this.recipeEntitiy = recipeEntitiy;
    }
}
