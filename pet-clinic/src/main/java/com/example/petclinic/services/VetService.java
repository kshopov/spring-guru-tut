package com.example.petclinic.services;

import com.example.petclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetService extends CrudRepository<Vet, Long> {
}
