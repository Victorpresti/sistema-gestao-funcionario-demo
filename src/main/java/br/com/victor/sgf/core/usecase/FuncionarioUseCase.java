package br.com.victor.sgf.core.usecase;

import br.com.victor.sgf.adapter.output.port.FuncionarioPort;
import br.com.victor.sgf.core.domain.Funcionario;
import br.com.victor.sgf.core.usecase.port.FuncionarioService;
import org.springframework.stereotype.Service;

@Service
public class FuncionarioUseCase implements FuncionarioService {

    private FuncionarioPort funcionarioPort;

    public FuncionarioUseCase(FuncionarioPort funcionarioPort) {
        this.funcionarioPort = funcionarioPort;
    }

    @Override
    public void save(Funcionario funcionario) {
        funcionarioPort.add(funcionario);
    }

    @Override
    public Funcionario get(int id) {
        return funcionarioPort.get(id);
    }

    @Override
    public void update(Funcionario funcionario) {
        funcionarioPort.update(funcionario);
    }

    @Override
    public void deleteById(int id) {
        funcionarioPort.deleteById(id);
    }
}
