package com.luanafn.avas.denunciabackend.adapter.ports.in.http.pessoa.conversor;

import com.luanafn.avas.denunciabackend.adapter.ports.in.http.pessoa.entity.PessoaRequest;
import com.luanafn.avas.denunciabackend.core.pessoa.entity.Pessoa;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component
public class PessoaRequestConversor {
    public Pessoa convert(PessoaRequest request) {
        if (Objects.isNull(request)) return null;

        Pessoa entity = new Pessoa();
        entity.setCpf(request.getCpf());
        entity.setEndereco(request.getEndereco());
        entity.setId(request.getId());
        entity.setNome(request.getNome());
        entity.setOcupacao(request.getOcupacao());

        return entity;
    }

    public PessoaRequest convert(Pessoa entity) {
        if (Objects.isNull(entity)) return null;

        PessoaRequest request = new PessoaRequest();
        request.setCpf(entity.getCpf());
        request.setEndereco(entity.getEndereco());
        request.setId(entity.getId());
        request.setNome(entity.getNome());
        request.setOcupacao(entity.getOcupacao());

        return request;
    }

    private Object convert(Object obj) {
        if (Objects.isNull(obj)) return null;

        if (obj instanceof Pessoa) {
            return convert((Pessoa) obj);

        } else if (obj instanceof PessoaRequest) {
            return convert((PessoaRequest) obj);
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
