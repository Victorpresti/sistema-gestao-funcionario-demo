package br.com.victor.sgf.adapter.input.rest.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.Data;
import lombok.Generated;

@Data
@Builder
@Generated
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class FuncionarioDTO {
    private int idFuncionario;
    private String nomeFuncionario;
    private String cargoFuncionario;
    private double salarioFuncionario;
    private String telefoneFuncionario;
    private String enderecoFuncionario;
}
