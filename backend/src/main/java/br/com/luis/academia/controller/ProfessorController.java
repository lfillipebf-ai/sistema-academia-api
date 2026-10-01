package br.com.luis.academia.controller;
import br.com.luis.academia.model.Professor; import br.com.luis.academia.repository.ProfessorRepository; import jakarta.validation.Valid; import org.springframework.web.bind.annotation.*; import java.util.List;
@RestController @RequestMapping("/api/professores")
public class ProfessorController {
 private final ProfessorRepository repo; public ProfessorController(ProfessorRepository repo){this.repo=repo;}
 @GetMapping public List<Professor> listar(){return repo.findAll();} @PostMapping public Professor criar(@Valid @RequestBody Professor p){return repo.save(p);}
 @DeleteMapping("/{id}") public void excluir(@PathVariable Long id){repo.deleteById(id);}
}
