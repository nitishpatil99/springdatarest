package com.sdr.SpringDataRest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sdr.SpringDataRest.model.visit;

@RepositoryRestResource(collectionResourceRel = "visit", path = "visit")
public interface VisitRepository extends CrudRepository<visit, Long> { } 
