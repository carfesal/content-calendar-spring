package github.carfesal.contentcalendar.controllers;

import github.carfesal.contentcalendar.models.Content;
import github.carfesal.contentcalendar.repositories.ContentCollectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/content")
public class ContentController {

    private final ContentCollectionRepository repository;

    public ContentController(ContentCollectionRepository repository){
        this.repository = repository;
    }

    @GetMapping("")
    public List<Content> getAll(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Content getById(@PathVariable Integer id){
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Content Not Found"));
    }
}
