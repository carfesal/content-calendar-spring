package github.carfesal.contentcalendar.repositories;

import github.carfesal.contentcalendar.models.Content;
import github.carfesal.contentcalendar.models.Status;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IContentRepository extends ListCrudRepository<Content, Integer> {
    //query derivation
    List<Content> findAllByTitleContains(String keyword);
    @Query("""
            SELECT *
            FROM content
            where status = :status
            """)
    List<Content> listByStatus(@Param("status") Status status); //query annotation
}
