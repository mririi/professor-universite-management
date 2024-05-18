package com.professor.repos;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.professor.entities.Professor;
import com.professor.entities.Universite;
@RepositoryRestResource(path = "rest")
public interface ProfessorRepository extends JpaRepository<Professor, Long> {

	List<Professor> findByNom(String nom);
	List<Professor> findByNomContains(String nom);
	@Query("select p from Professor p where p.nom ='Riahi' and p.prenom = 'Hadil'")
	List<Professor> findByNomPrenom (String nom, String prenom);
	List<Professor> findByUniversite (Universite univeriste);
	List<Professor> findByUniversiteIdUni(Long id);

}