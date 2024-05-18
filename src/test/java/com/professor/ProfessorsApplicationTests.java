package com.professor;

import java.util.Date;
import java.util.List;

import com.professor.repos.ProfessorRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.professor.entities.Professor;
import com.professor.entities.Universite;

@SpringBootTest
class ProfessorsApplicationTests {
	@Autowired
	private ProfessorRepository professorRepository;
}
