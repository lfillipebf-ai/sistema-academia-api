package br.com.luis.academia.model;
import jakarta.persistence.*; import java.math.BigDecimal; import java.time.LocalDate;
@Entity public class Pagamento {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @ManyToOne(optional=false) private Matricula matricula; private BigDecimal valor; private LocalDate dataPagamento=LocalDate.now(); private boolean pago=true;
 public Long getId(){return id;} public Matricula getMatricula(){return matricula;} public void setMatricula(Matricula v){matricula=v;} public BigDecimal getValor(){return valor;} public void setValor(BigDecimal v){valor=v;}
 public LocalDate getDataPagamento(){return dataPagamento;} public void setDataPagamento(LocalDate v){dataPagamento=v;} public boolean isPago(){return pago;} public void setPago(boolean v){pago=v;}
}
