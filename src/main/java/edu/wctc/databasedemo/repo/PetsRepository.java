package edu.wctc.databasedemo.repo;

import edu.wctc.databasedemo.entity.Pets;
import org.springframework.data.repository.CrudRepository;

public interface PetsRepository extends CrudRepository<Pets, Integer> {
}
