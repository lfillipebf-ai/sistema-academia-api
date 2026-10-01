package br.com.luis.academia.repository;
import br.com.luis.academia.model.Matricula; import br.com.luis.academia.model.StatusMatricula; import org.springframework.data.jpa.repository.JpaRepository; import java.util.List;
public interface MatriculaRepository extends JpaRepository<Matricula,Long>{ List<Matricula> findByStatus(StatusMatricula status); }
