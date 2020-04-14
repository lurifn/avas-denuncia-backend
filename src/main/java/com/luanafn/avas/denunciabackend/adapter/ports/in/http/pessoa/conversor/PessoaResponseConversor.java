package com.luanafn.avas.denunciabackend.adapter.ports.in.http.pessoa.conversor;

import com.luanafn.avas.denunciabackend.adapter.ports.in.http.pessoa.entity.PessoaResponse;
import com.luanafn.avas.denunciabackend.core.pessoa.entity.Pessoa;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component
public class PessoaResponseConversor {
    public Pessoa convert(PessoaResponse response) {
        if (Objects.isNull(response)) return null;

        Pessoa entity = new Pessoa();
        entity.setCpf(response.getCpf());
        entity.setEndereco(response.getEndereco());
        entity.setId(response.getId());
        entity.setNome(response.getNome());
        entity.setOcupacao(response.getOcupacao());

        return entity;
    }

    public PessoaResponse convert(Pessoa entity) {
        if (Objects.isNull(entity)) return null;

        PessoaResponse response = new PessoaResponse();
        response.setCpf(entity.getCpf());
        response.setEndereco(entity.getEndereco());
        response.setId(entity.getId());
        response.setNome(entity.getNome());
        response.setOcupacao(entity.getOcupacao());

        return response;
    }

    private Object convert(Object obj) {
        if (Objects.isNull(obj)) return null;

        if (obj instanceof Pessoa) {
            return convert((Pessoa) obj);

        } else if (obj instanceof PessoaResponse) {
            return convert((PessoaResponse) obj);
        }

        throw new IllegalArgumentException("Conversão de objeto do tipo errado");
    }

    public List convert(List list) {
        if (Objects.isNull(list)) return null;

        if (list.isEmpty()) return new ArrayList();

        List retorno = new ArrayList();

        for (Object entity : list) {
            list.add(convert(entity));
        }

        return retorno;
    }
}
