package com.professor.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.professor.entities.Professor;

@Service
public interface ProfessorService {

    Professor saveProfessor(Professor e);

    Professor updateProfessor(Professor e);

    void deleteProfessorById(Long id);

    Professor getProfessor(Long id);

    List<Professor> getAllProfessors();

    List<Professor> findByUniversiteIdUni(Long id);
}

