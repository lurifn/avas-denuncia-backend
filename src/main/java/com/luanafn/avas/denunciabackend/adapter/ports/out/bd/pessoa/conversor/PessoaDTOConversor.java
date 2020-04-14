package com.luanafn.avas.denunciabackend.adapter.ports.out.bd.pessoa.conversor;

import com.luanafn.avas.denunciabackend.adapter.ports.out.bd.pessoa.dto.PessoaDTO;
import com.luanafn.avas.denunciabackend.core.pessoa.entity.Pessoa;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component
public class PessoaDTOConversor {
    public Pessoa convert(PessoaDTO dto) {
        if (Objects.isNull(dto)) return null;

        Pessoa entity = new Pessoa();
        entity.setCpf(dto.getCpf());
        entity.setEndereco(dto.getEndereco());
        entity.setId(dto.getId());
        entity.setNome(dto.getNome());
        entity.setOcupacao(dto.getOcupacao());

        return entity;
    }

    public PessoaDTO convert(Pessoa entity) {
        if (Objects.isNull(entity)) return null;

        PessoaDTO dto = new PessoaDTO();
        dto.setCpf(entity.getCpf());
        dto.setEndereco(entity.getEndereco());
        dto.setId(entity.getId());
        dto.setNome(entity.getNome());
        dto.setOcupacao(entity.getOcupacao());

        return dto;
    }

    private Object convert(Object obj) {
        if (Objects.isNull(obj)) return null;

        if (obj instanceof Pessoa) {
            return convert((Pessoa) obj);

        } else if (obj instanceof PessoaDTO) {
            return convert((PessoaDTO) obj);
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
