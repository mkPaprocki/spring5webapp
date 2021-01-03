package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Project: spring5webapp
 * <p>
 * Created on: 03.01.2021
 * <p>
 * Author    : Mateusz Paprocki
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
