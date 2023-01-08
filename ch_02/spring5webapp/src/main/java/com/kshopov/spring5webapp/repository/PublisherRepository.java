package com.kshopov.spring5webapp.repository;

import com.kshopov.spring5webapp.model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
