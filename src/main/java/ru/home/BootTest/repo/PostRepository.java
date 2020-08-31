package ru.home.BootTest.repo;

import org.springframework.data.repository.CrudRepository;
import ru.home.BootTest.models.Post;

public interface PostRepository extends CrudRepository<Post, Long> {
}
