package br.com.victor.sgf.adapter.output.database.maps.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FuncionarioEntity {
    private int idFuncionario;
    private String nomeFuncionario;
    private String cargoFuncionario;
    private double salarioFuncionario;
    private String telefoneFuncionario;
    private String enderecoFuncionario;
}
