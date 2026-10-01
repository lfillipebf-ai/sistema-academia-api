package br.com.luis.academia.controller;
import br.com.luis.academia.model.Aluno; import br.com.luis.academia.repository.AlunoRepository; import jakarta.validation.Valid; import org.springframework.web.bind.annotation.*; import java.util.List;
@RestController @RequestMapping("/api/alunos")
public class AlunoController {
 private final AlunoRepository repo; public AlunoController(AlunoRepository repo){this.repo=repo;}
 @GetMapping public List<Aluno> listar(){return repo.findAll();}
 @GetMapping("/ativos") public List<Aluno> ativos(){return repo.findByAtivoTrue();}
 @PostMapping public Aluno criar(@Valid @RequestBody Aluno a){return repo.save(a);}
 @PutMapping("/{id}") public Aluno atualizar(@PathVariable Long id,@Valid @RequestBody Aluno a){a.setAtivo(a.isAtivo()); a.setEmail(a.getEmail()); return repo.findById(id).map(x->{x.setNome(a.getNome());x.setEmail(a.getEmail());x.setTelefone(a.getTelefone());x.setAtivo(a.isAtivo());return repo.save(x);}).orElseThrow();}
 @DeleteMapping("/{id}") public void excluir(@PathVariable Long id){repo.deleteById(id);}
}
