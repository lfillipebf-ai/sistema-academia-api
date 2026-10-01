package br.com.luis.academia.model;
import jakarta.persistence.*; import jakarta.validation.constraints.*; import java.math.BigDecimal;
@Entity public class Plano {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @NotBlank @Column(unique=true) private String nome; @DecimalMin("0.0") private BigDecimal valor; private Integer duracaoMeses;
 public Long getId(){return id;} public String getNome(){return nome;} public void setNome(String v){nome=v;}
 public BigDecimal getValor(){return valor;} public void setValor(BigDecimal v){valor=v;} public Integer getDuracaoMeses(){return duracaoMeses;} public void setDuracaoMeses(Integer v){duracaoMeses=v;}
}
