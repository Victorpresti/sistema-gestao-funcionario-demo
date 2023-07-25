package br.com.victor.sgf.adapter.input.rest;

import br.com.victor.sgf.adapter.input.rest.dto.FuncionarioDTO;
import br.com.victor.sgf.adapter.output.mapper.FuncionarioMapper;
import br.com.victor.sgf.core.domain.Funcionario;
import br.com.victor.sgf.core.usecase.port.FuncionarioService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/funcionario")
public class Controller {

    private FuncionarioService funcionarioService;

    public Controller(FuncionarioService funcionarioService) {
        this.funcionarioService = funcionarioService;
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/save")
    public void put(@RequestBody FuncionarioDTO funcionario){
        funcionarioService.save(FuncionarioMapper.mapToDomain(funcionario));
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/get/{id}")
    public Funcionario get(@PathVariable(value = "id") int id){
        return funcionarioService.get(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @PatchMapping("/update")
    public void update(@RequestBody FuncionarioDTO funcionario){
        funcionarioService.update(FuncionarioMapper.mapToDomain(funcionario));
    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable(value = "id") int id){
        funcionarioService.deleteById(id);
    }


}
