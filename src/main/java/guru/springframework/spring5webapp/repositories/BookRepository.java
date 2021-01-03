package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Project: spring5webapp
 * <p>
 * Created on: 03.01.2021
 * <p>
 * Author    : Mateusz Paprocki
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
