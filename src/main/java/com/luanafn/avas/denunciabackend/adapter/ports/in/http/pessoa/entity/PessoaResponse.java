package com.luanafn.avas.denunciabackend.adapter.ports.in.http.pessoa.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PessoaResponse {
    private Long id;
    private String nome;
    private String cpf;
    private String ocupacao;
    private String endereco;
}
