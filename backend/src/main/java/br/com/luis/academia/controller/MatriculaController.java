package br.com.luis.academia.controller;
import br.com.luis.academia.model.*; import br.com.luis.academia.repository.*; import org.springframework.web.bind.annotation.*; import java.util.List;
@RestController @RequestMapping("/api/matriculas")
public class MatriculaController {
 private final MatriculaRepository repo; private final AlunoRepository alunos; private final PlanoRepository planos; private final ProfessorRepository professores;
 public MatriculaController(MatriculaRepository r,AlunoRepository a,PlanoRepository p,ProfessorRepository pr){repo=r;alunos=a;planos=p;professores=pr;}
 @GetMapping public List<Matricula> listar(){return repo.findAll();}
 @GetMapping("/ativas") public List<Matricula> ativas(){return repo.findByStatus(StatusMatricula.ATIVA);}
 @PostMapping public Matricula criar(@RequestParam Long alunoId,@RequestParam Long planoId,@RequestParam(required=false) Long professorId){
  Matricula m=new Matricula();m.setAluno(alunos.findById(alunoId).orElseThrow());m.setPlano(planos.findById(planoId).orElseThrow());if(professorId!=null)m.setProfessor(professores.findById(professorId).orElseThrow());return repo.save(m);
 }
 @PatchMapping("/{id}/status") public Matricula status(@PathVariable Long id,@RequestParam StatusMatricula valor){Matricula m=repo.findById(id).orElseThrow();m.setStatus(valor);return repo.save(m);}
}
