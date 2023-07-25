package br.com.victor.sgf.adapter.output.database.maps.repository;

import br.com.victor.sgf.adapter.output.database.maps.entity.FuncionarioEntity;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class FuncionarioRepository {

    private Map<Integer, FuncionarioEntity> funcionarioMap = new HashMap<>();

    public void save(FuncionarioEntity funcionario) {
        if (funcionario.getIdFuncionario() == 0) {
            funcionario.setIdFuncionario(generateNewId());
        }
        funcionarioMap.put(funcionario.getIdFuncionario(), funcionario);
    }

    public Optional<FuncionarioEntity> findById(int id) {
        return Optional.ofNullable(funcionarioMap.get(id));
    }

    public void update(FuncionarioEntity funcionario) {
        if (funcionario.getIdFuncionario() > 0 && funcionarioMap.containsKey(funcionario.getIdFuncionario())) {
            funcionarioMap.put(funcionario.getIdFuncionario(), funcionario);
        } else {
            throw new IllegalArgumentException("Funcionario com a ID " + funcionario.getIdFuncionario() + " Não existe.");
            //Poderia aqui também criar um novo se não existisse, o que é o comportamento padrão do save.
        }
    }

    public void deleteById(int id) {
        funcionarioMap.remove(id);
    }

    private int generateNewId() {
        return funcionarioMap.keySet().stream().mapToInt(i -> i).max().orElse(0) + 1;
    }
}
