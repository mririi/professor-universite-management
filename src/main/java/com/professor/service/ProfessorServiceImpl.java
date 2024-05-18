package com.professor.service;

import java.util.List;

import com.professor.repos.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.professor.entities.Professor;

@Service
public class ProfessorServiceImpl implements ProfessorService {
    @Autowired
    ProfessorRepository professorRepository;

    @Override
    public Professor saveProfessor(Professor e) {
        return professorRepository.save(e);
    }

    @Override
    public Professor updateProfessor(Professor e) {
        return professorRepository.save(e);
    }

    @Override
    public void deleteProfessorById(Long id) {
        professorRepository.deleteById(id);
    }

    @Override
    public Professor getProfessor(Long id) {
        return professorRepository.findById(id).get();
    }

    @Override
    public List<Professor> getAllProfessors() {
        return professorRepository.findAll();
    }

    @Override
    public List<Professor> findByUniversiteIdUni(Long id) {
        return professorRepository.findByUniversiteIdUni(id);
    }
}
