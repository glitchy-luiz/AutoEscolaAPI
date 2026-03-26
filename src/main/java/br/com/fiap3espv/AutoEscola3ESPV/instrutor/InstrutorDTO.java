package br.com.fiap3espv.AutoEscola3ESPV.instrutor;

public record InstrutorDTO (
        String nome,
        String email,
        String cnh,
        EnderecoDTO endereco
){

}
