package br.com.luis.academia.model;
import jakarta.persistence.*; import jakarta.validation.constraints.NotBlank;
@Entity public class Professor {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @NotBlank private String nome; private String especialidade;
 public Long getId(){return id;} public String getNome(){return nome;} public void setNome(String v){nome=v;}
 public String getEspecialidade(){return especialidade;} public void setEspecialidade(String v){especialidade=v;}
}
