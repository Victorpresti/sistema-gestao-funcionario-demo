package br.com.victor.sgf.adapter.output;

import br.com.victor.sgf.adapter.output.database.maps.repository.FuncionarioRepository;
import br.com.victor.sgf.adapter.output.mapper.FuncionarioMapper;
import br.com.victor.sgf.adapter.output.port.FuncionarioPort;
import br.com.victor.sgf.core.domain.Funcionario;
import org.springframework.stereotype.Service;

@Service
public class FuncionarioAdapter implements FuncionarioPort {

    private final FuncionarioRepository funcionarioRepository;

    public FuncionarioAdapter(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    @Override
    public void add(Funcionario funcionario) {
        funcionarioRepository.save(FuncionarioMapper.mapToEntity(funcionario));
    }

    @Override
    public Funcionario get(int id) {
        return FuncionarioMapper.mapOptionalToDomain(funcionarioRepository.findById(id));
    }

    @Override
    public void update(Funcionario funcionario) {

        if(get(funcionario.getIdFuncionario()) == null){
            funcionarioRepository.save(FuncionarioMapper.mapToEntity(funcionario));
        } else {
            funcionarioRepository.update(FuncionarioMapper.mapToEntity(funcionario));
        }
    }

    @Override
    public void deleteById(int id) {
        funcionarioRepository.deleteById(id);
    }
}
