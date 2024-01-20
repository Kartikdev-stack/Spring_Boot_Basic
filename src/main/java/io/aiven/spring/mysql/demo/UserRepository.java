package io.aiven.spring.mysql.demo;
import org.springframework.data.repository.CrudRepository;
import io.aiven.spring.mysql.demo.User;

//crud repository is used to perform create, read, update and delete operations
public interface UserRepository extends CrudRepository<User,Integer>{


}
