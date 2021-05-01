package com.petclinicspring.com.repositories;

import com.petclinicspring.com.models.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit,Long> {
}
