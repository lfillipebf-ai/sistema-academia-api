package br.com.luis.academia.controller;
import br.com.luis.academia.model.*; import br.com.luis.academia.repository.*; import org.springframework.web.bind.annotation.*; import java.util.List;
@RestController @RequestMapping("/api/pagamentos")
public class PagamentoController {
 private final PagamentoRepository repo; private final MatriculaRepository matriculas;
 public PagamentoController(PagamentoRepository r,MatriculaRepository m){repo=r;matriculas=m;}
 @GetMapping public List<Pagamento> listar(){return repo.findAll();}
 @PostMapping public Pagamento criar(@RequestParam Long matriculaId,@RequestParam java.math.BigDecimal valor){Pagamento p=new Pagamento();p.setMatricula(matriculas.findById(matriculaId).orElseThrow());p.setValor(valor);return repo.save(p);}
}
