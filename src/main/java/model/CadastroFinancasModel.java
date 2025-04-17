package model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CadastroFinancasModel {
    private String nome;
    private double valor;
    private Date dataQueOcorreu;
    private Date dataCadastro;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
