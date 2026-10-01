package br.com.luis.academia.controller;
import br.com.luis.academia.model.Plano; import br.com.luis.academia.repository.PlanoRepository; import jakarta.validation.Valid; import org.springframework.web.bind.annotation.*; import java.util.List;
@RestController @RequestMapping("/api/planos")
public class PlanoController {
 private final PlanoRepository repo; public PlanoController(PlanoRepository repo){this.repo=repo;}
 @GetMapping public List<Plano> listar(){return repo.findAll();} @PostMapping public Plano criar(@Valid @RequestBody Plano p){return repo.save(p);}
 @DeleteMapping("/{id}") public void excluir(@PathVariable Long id){repo.deleteById(id);}
}
