package br.com.victor.sgf.adapter.output.port;

import br.com.victor.sgf.core.domain.Funcionario;

public interface FuncionarioPort {

    void add(Funcionario funcionario);

    Funcionario get(int id);

    void update(Funcionario funcionario);

    void deleteById(int id);
}
