package br.com.fiap3espv.AutoEscola3ESPV.instrutor;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoInstrutor(
        @NotNull
        Long id,
        String nome,
        String telefone,

        @Email
        String email,
        Especialidade especialidade,
        DadosEndereco endereco,
        boolean ativo) {
}