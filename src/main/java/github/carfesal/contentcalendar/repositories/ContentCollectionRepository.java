package github.carfesal.contentcalendar.repositories;

import github.carfesal.contentcalendar.models.Content;
import github.carfesal.contentcalendar.models.Status;
import github.carfesal.contentcalendar.models.Type;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ContentCollectionRepository {

    private final List<Content> contentList = new ArrayList<>();

    public ContentCollectionRepository(){

    }

    public List<Content> findAll(){
        return contentList;
    }

    public Optional<Content> findById(Integer id){
        return contentList.stream().filter(c -> c.id().equals(id)).findFirst();
    }

    public void save(Content content){
        contentList.removeIf(c -> c.id().equals(content.id()));
        contentList.add(content);;
    }

    public void delete(Integer id){
        contentList.removeIf(c -> c.id().equals(id));
    }

    @PostConstruct //to make some setup to the class after the dependency injection
    private void init(){
        Content c = new Content(1,
                "My first Spring content",
                "My first description",
                Status.COMPLETED,
                Type.ARTICLE,
                LocalDateTime.now(),
                null, "");

        contentList.add(c);
    }

    public boolean existsById(Integer id){
        return contentList.stream().filter(content -> content.id().equals(id)).count() == 1;
    }
}
