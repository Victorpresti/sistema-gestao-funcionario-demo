package br.com.victor.sgf.adapter.output.mapper;


import br.com.victor.sgf.adapter.input.rest.dto.FuncionarioDTO;
import br.com.victor.sgf.adapter.output.database.maps.entity.FuncionarioEntity;
import br.com.victor.sgf.core.domain.Funcionario;

import java.util.Optional;

public class FuncionarioMapper {

    private FuncionarioMapper(){
        throw new IllegalStateException("Mapper class");
    }

    public static Funcionario mapOptionalToDomain(Optional<FuncionarioEntity> entity) {
        if(entity.isPresent()) {
            return Funcionario.builder()
                    .idFuncionario(entity.get().getIdFuncionario())
                    .nomeFuncionario(entity.get().getNomeFuncionario())
                    .cargoFuncionario(entity.get().getCargoFuncionario())
                    .salarioFuncionario(entity.get().getSalarioFuncionario())
                    .telefoneFuncionario(entity.get().getTelefoneFuncionario())
                    .enderecoFuncionario(entity.get().getEnderecoFuncionario())
                    .build();
        }
        throw new IllegalArgumentException("Funcionário não existe");
    }

    public static FuncionarioDTO mapToWeb(Funcionario entity) {
        return Optional.ofNullable(entity).map(
                x -> FuncionarioDTO.builder()
                        .idFuncionario(entity.getIdFuncionario())
                        .nomeFuncionario(entity.getNomeFuncionario())
                        .cargoFuncionario(entity.getCargoFuncionario())
                        .salarioFuncionario(entity.getSalarioFuncionario())
                        .telefoneFuncionario(entity.getTelefoneFuncionario())
                        .enderecoFuncionario(entity.getEnderecoFuncionario())
                        .build())
                .orElse(null);
    }

    public static FuncionarioEntity mapToEntity(Funcionario entity) {
        return FuncionarioEntity.builder()
                .idFuncionario(entity.getIdFuncionario())
                .nomeFuncionario(entity.getNomeFuncionario())
                .cargoFuncionario(entity.getCargoFuncionario())
                .salarioFuncionario(entity.getSalarioFuncionario())
                .telefoneFuncionario(entity.getTelefoneFuncionario())
                .enderecoFuncionario(entity.getEnderecoFuncionario())
                .build();
    }

    public static Funcionario mapToDomain(FuncionarioDTO entity) {
        return Funcionario.builder()
                .idFuncionario(entity.getIdFuncionario())
                .nomeFuncionario(entity.getNomeFuncionario())
                .cargoFuncionario(entity.getCargoFuncionario())
                .salarioFuncionario(entity.getSalarioFuncionario())
                .telefoneFuncionario(entity.getTelefoneFuncionario())
                .enderecoFuncionario(entity.getEnderecoFuncionario())
                .build();
    }
}
