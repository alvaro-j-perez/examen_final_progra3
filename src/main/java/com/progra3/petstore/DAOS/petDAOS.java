package com.progra3.petstore.DAOS;

import com.progra3.petstore.entities.Pet;
import org.springframework.data.repository.CrudRepository;

public interface petDAOS extends CrudRepository<Pet, Long>{

}