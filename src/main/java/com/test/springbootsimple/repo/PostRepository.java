package com.test.springbootsimple.repo;

import com.test.springbootsimple.models.Post;
import org.springframework.data.repository.CrudRepository;

public  interface PostRepository extends CrudRepository<Post,Long> {

}
