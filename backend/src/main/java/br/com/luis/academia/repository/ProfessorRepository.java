package br.com.luis.academia.repository;
import br.com.luis.academia.model.Professor; import org.springframework.data.jpa.repository.JpaRepository;
public interface ProfessorRepository extends JpaRepository<Professor,Long>{}
