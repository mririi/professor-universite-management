package com.professor.restcontrollers;

import java.util.List;

import com.professor.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.professor.entities.Professor;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProfessorRESTController {
    @Autowired
    ProfessorService professorService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Professor> getAllProfessors() {
        return professorService.getAllProfessors();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Professor getProfessorById(@PathVariable("id") Long id) {
        return professorService.getProfessor(id);

    }

    @RequestMapping(path = "all", method = RequestMethod.GET)
    public List<Professor> getAllProfessor() {
        return professorService.getAllProfessors();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Professor createProfessor(@RequestBody Professor professor) {
        return professorService.saveProfessor(professor);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Professor updateProfessor(@RequestBody Professor professor) {
        return professorService.updateProfessor(professor);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteProfessor(@PathVariable("id") Long id) {
        professorService.deleteProfessorById(id);
    }

    @RequestMapping(value = "/{idUni}", method = RequestMethod.GET)
    public List<Professor> getProfessorsByUniversiteId(@PathVariable("idUni") Long idUni) {
        return professorService.findByUniversiteIdUni(idUni);
    }
}
