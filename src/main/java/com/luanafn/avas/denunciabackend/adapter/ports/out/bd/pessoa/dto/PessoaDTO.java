package com.luanafn.avas.denunciabackend.adapter.ports.out.bd.pessoa.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class PessoaDTO {
    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String cpf;
    private String ocupacao;
    private String endereco;
}
