package br.com.victor.sgf.core.usecase.port;

import br.com.victor.sgf.core.domain.Funcionario;

public interface FuncionarioService {

    void save(Funcionario funcionario);

    Funcionario get(int id);

    void update(Funcionario funcionario);

    void deleteById(int id);
}
