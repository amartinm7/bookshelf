package amm.poc.bookshelf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("amm.poc.bookshelf.persistence")
@EntityScan("amm.poc.bookshelf.model")
@SpringBootApplication
public class BookshelfApplication {
	public static void main(String[] args) {
		SpringApplication.run(BookshelfApplication.class, args);
	}
}
