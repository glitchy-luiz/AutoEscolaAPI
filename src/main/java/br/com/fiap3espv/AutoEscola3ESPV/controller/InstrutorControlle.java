package br.com.fiap3espv.AutoEscola3ESPV.controller;

import br.com.fiap3espv.AutoEscola3ESPV.instrutor.InstrutorDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/instrutor")
public class InstrutorControlle {

    @PostMapping
    public void cadastraInstrutor(@RequestBody InstrutorDTO dado){
        System.out.println(dado);
    }
}
