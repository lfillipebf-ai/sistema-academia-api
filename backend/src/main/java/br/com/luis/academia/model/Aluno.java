package br.com.luis.academia.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
@Entity
public class Aluno {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @NotBlank private String nome;
 @Email @NotBlank @Column(unique=true) private String email;
 private String telefone; private boolean ativo=true;
 public Long getId(){return id;} public String getNome(){return nome;} public void setNome(String v){nome=v;}
 public String getEmail(){return email;} public void setEmail(String v){email=v;} public String getTelefone(){return telefone;} public void setTelefone(String v){telefone=v;}
 public boolean isAtivo(){return ativo;} public void setAtivo(boolean v){ativo=v;}
}
