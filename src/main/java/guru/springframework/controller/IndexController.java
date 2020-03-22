package guru.springframework.controller;

import guru.springframework.model.CategoryEntity;
import guru.springframework.model.UnitOfMeasureEntity;
import guru.springframework.repository.CategoryRepository;
import guru.springframework.repository.UnitOfMeasurementRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Locale;
import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasurementRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasurementRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage() {

        Optional<CategoryEntity> categoryOptional = categoryRepository.findByCategory("American");
        Optional<UnitOfMeasureEntity> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("Cat Id is: " + categoryOptional.get().getCategoryId());
        System.out.println("UOM ID is: " + unitOfMeasureOptional.get().getUnitId());

        return "index";
    }
}
