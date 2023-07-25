package br.com.victor.sgf.core.domain;

import lombok.*;

@Data
@Generated
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Funcionario {

    private int idFuncionario;
    private String nomeFuncionario;
    private String cargoFuncionario;
    private double salarioFuncionario;
    private String telefoneFuncionario;
    private String enderecoFuncionario;
}