package github.carfesal.contentcalendar;

import github.carfesal.contentcalendar.models.Content;
import github.carfesal.contentcalendar.models.Status;
import github.carfesal.contentcalendar.models.Type;
import github.carfesal.contentcalendar.repositories.IContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(IContentRepository repository){
		return args -> {
			Content c = new Content(null,
					"Hello this is being inserted while booting the app",
					"My first description",
					Status.COMPLETED,
					Type.ARTICLE,
					LocalDateTime.now(),
					null, ""
			);

			repository.save(c);

		};
	}
}
