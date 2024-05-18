package com.professor.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.professor.entities.Universite;

@RepositoryRestResource(path = "rest")
public interface UniversiteRepository extends JpaRepository<Universite, Long> {
}
