package br.com.luis.academia.repository;
import br.com.luis.academia.model.Aluno; import org.springframework.data.jpa.repository.JpaRepository; import java.util.List;
public interface AlunoRepository extends JpaRepository<Aluno,Long>{ List<Aluno> findByAtivoTrue(); }
