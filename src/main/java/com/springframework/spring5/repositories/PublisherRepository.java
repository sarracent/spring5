package com.springframework.spring5.repositories;

import com.springframework.spring5.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
