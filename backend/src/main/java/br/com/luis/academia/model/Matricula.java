package br.com.luis.academia.model;
import jakarta.persistence.*; import java.time.LocalDate;
@Entity public class Matricula {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @ManyToOne(optional=false) private Aluno aluno; @ManyToOne(optional=false) private Plano plano; @ManyToOne private Professor professor;
 private LocalDate dataInicio=LocalDate.now(); @Enumerated(EnumType.STRING) private StatusMatricula status=StatusMatricula.ATIVA;
 public Long getId(){return id;} public Aluno getAluno(){return aluno;} public void setAluno(Aluno v){aluno=v;} public Plano getPlano(){return plano;} public void setPlano(Plano v){plano=v;}
 public Professor getProfessor(){return professor;} public void setProfessor(Professor v){professor=v;} public LocalDate getDataInicio(){return dataInicio;} public void setDataInicio(LocalDate v){dataInicio=v;}
 public StatusMatricula getStatus(){return status;} public void setStatus(StatusMatricula v){status=v;}
}
