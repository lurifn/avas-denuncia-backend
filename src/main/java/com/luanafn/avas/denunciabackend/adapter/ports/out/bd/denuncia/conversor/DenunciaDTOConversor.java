package com.luanafn.avas.denunciabackend.adapter.ports.out.bd.denuncia.conversor;

import com.luanafn.avas.denunciabackend.adapter.ports.out.bd.denuncia.dto.DenunciaDTO;
import com.luanafn.avas.denunciabackend.adapter.ports.out.bd.pessoa.conversor.PessoaDTOConversor;
import com.luanafn.avas.denunciabackend.core.denuncia.entity.Denuncia;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RequiredArgsConstructor
@Component
public class DenunciaDTOConversor {
    private final PessoaDTOConversor pessoaDTOConversor;

    public Denuncia convert(DenunciaDTO dto) {
        if (Objects.isNull(dto)) return null;

        Denuncia entity = new Denuncia();
        entity.setAgressorConhecido(dto.isAgressorConhecido());
        entity.setAgressores(pessoaDTOConversor.convert(dto.getAgressores()));
        entity.setDataInclusao(dto.getDataInclusao());
        entity.setDataOcorrencia(dto.getDataOcorrencia());
        entity.setDenunciante(pessoaDTOConversor.convert(dto.getDenunciante()));
        entity.setId(dto.getId());
        entity.setLocal(dto.getLocal());
        entity.setOcorrencia(dto.getOcorrencia());
        entity.setPossuiProva(dto.isPossuiProva());
        entity.setTestemunhas(pessoaDTOConversor.convert(dto.getTestemunhas()));
        entity.setTipoAgressao(dto.getTipoAgressao());
        entity.setVitima(pessoaDTOConversor.convert(dto.getVitima()));

        return entity;
    }

    public DenunciaDTO convert(Denuncia entity) {
        if (Objects.isNull(entity)) return null;

        DenunciaDTO dto = new DenunciaDTO();
        dto.setAgressorConhecido(entity.isAgressorConhecido());
        dto.setAgressores(pessoaDTOConversor.convert(entity.getAgressores()));
        dto.setDataInclusao(entity.getDataInclusao());
        dto.setDataOcorrencia(entity.getDataOcorrencia());
        dto.setDenunciante(pessoaDTOConversor.convert(entity.getDenunciante()));
        dto.setId(entity.getId());
        dto.setLocal(entity.getLocal());
        dto.setOcorrencia(entity.getOcorrencia());
        dto.setPossuiProva(entity.isPossuiProva());
        dto.setTestemunhas(pessoaDTOConversor.convert(entity.getTestemunhas()));
        dto.setTipoAgressao(entity.getTipoAgressao());
        dto.setVitima(pessoaDTOConversor.convert(entity.getVitima()));

        return dto;
    }

    private Object convert(Object obj) {
        if (Objects.isNull(obj)) return null;

        if (obj instanceof Denuncia) {
            return convert((Denuncia) obj);

        } else if (obj instanceof DenunciaDTO) {
            return convert((DenunciaDTO) obj);
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
