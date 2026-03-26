package br.com.fiap3espv.AutoEscola3ESPV.instrutor;

public record EnderecoDTO (
        String rua,
        String numero,
        String complemento,
        String bairro,
        String cidade,
        String uf,
        String cep
) {

}
