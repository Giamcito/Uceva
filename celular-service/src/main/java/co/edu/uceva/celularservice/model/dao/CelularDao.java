package co.edu.uceva.celularservice.model.dao;

import co.edu.uceva.celularservice.model.entities.Celular;
import org.springframework.data.repository.CrudRepository;

public interface CelularDao extends CrudRepository<Celular, Long> {
}
