package guru.springframework.repository;

import guru.springframework.model.CategoryEntity;
import guru.springframework.model.UnitOfMeasureEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitOfMeasurementRepository extends CrudRepository<UnitOfMeasureEntity,Long> {

    Optional<UnitOfMeasureEntity> findByDescription(String describtion);

}
