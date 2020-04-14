package com.luanafn.avas.denunciabackend.core.pessoa.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pessoa {
    private Long id;
    private String nome;
    private String cpf;
    private String ocupacao;
    private String endereco;
}
