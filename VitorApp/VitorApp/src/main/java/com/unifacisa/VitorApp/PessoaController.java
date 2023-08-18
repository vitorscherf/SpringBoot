package com.unifacisa.VitorApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    @GetMapping
    public Pessoa obterPessoa() {
        Pessoa pessoa = new Pessoa();
        pessoa.setId(1L);
        pessoa.setNome("João");
        pessoa.setIdade(30);
        return pessoa;
    }
}