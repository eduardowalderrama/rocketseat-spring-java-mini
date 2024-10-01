package br.com.lion.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraRota")
//http://127.0.0.1:8080/primeiraRota -----
public class MinhaPrimeiraController {

    /**
     * Metodos de acesso do HTTP
     * GET - Buscar uma informacao
     * POST - Adicionar um dado/informacao
     * PUT - Alterar um dado/info
     * DELETE - Remover um dado
     * PATCH - Alterar somente uma parte da info/dado
     *
     * @return
     */

    // Metodo (Funcionalidade) de uma classe
    @GetMapping("/primeiroMetodo")
    public String primeiraMensagem() {
        return "Funcionou";
    }
}
