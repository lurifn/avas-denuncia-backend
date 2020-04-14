package com.luanafn.avas.denunciabackend.adapter.ports.in.http.denuncia.conversor;

import com.luanafn.avas.denunciabackend.adapter.ports.in.http.denuncia.entity.DenunciaResponse;
import com.luanafn.avas.denunciabackend.adapter.ports.in.http.pessoa.conversor.PessoaResponseConversor;
import com.luanafn.avas.denunciabackend.core.denuncia.entity.Denuncia;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component
@RequiredArgsConstructor
public class DenunciaResponseConversor {
    private final PessoaResponseConversor pessoaResponseConversor;

    public Denuncia convert(DenunciaResponse response) {
        if (Objects.isNull(response)) return null;

        Denuncia entity = new Denuncia();
        entity.setAgressorConhecido(response.isAgressorConhecido());
        entity.setAgressores(pessoaResponseConversor.convert(response.getAgressores()));
        entity.setDataInclusao(response.getDataInclusao());
        entity.setDataOcorrencia(response.getDataOcorrencia());
        entity.setDenunciante(pessoaResponseConversor.convert(response.getDenunciante()));
        entity.setId(response.getId());
        entity.setLocal(response.getLocal());
        entity.setOcorrencia(response.getOcorrencia());
        entity.setPossuiProva(response.isPossuiProva());
        entity.setTestemunhas(pessoaResponseConversor.convert(response.getTestemunhas()));
        entity.setTipoAgressao(response.getTipoAgressao());
        entity.setVitima(pessoaResponseConversor.convert(response.getVitima()));

        return entity;
    }

    public DenunciaResponse convert(Denuncia entity) {
        if (Objects.isNull(entity)) return null;

        DenunciaResponse response = new DenunciaResponse();
        response.setAgressorConhecido(entity.isAgressorConhecido());
        response.setAgressores(pessoaResponseConversor.convert(entity.getAgressores()));
        response.setDataInclusao(entity.getDataInclusao());
        response.setDataOcorrencia(entity.getDataOcorrencia());
        response.setDenunciante(pessoaResponseConversor.convert(entity.getDenunciante()));
        response.setId(entity.getId());
        response.setLocal(entity.getLocal());
        response.setOcorrencia(entity.getOcorrencia());
        response.setPossuiProva(entity.isPossuiProva());
        response.setTestemunhas(pessoaResponseConversor.convert(entity.getTestemunhas()));
        response.setTipoAgressao(entity.getTipoAgressao());
        response.setVitima(pessoaResponseConversor.convert(entity.getVitima()));

        return response;
    }

    private Object convert(Object obj) {
        if (Objects.isNull(obj)) return null;

        if (obj instanceof Denuncia) {
            return convert((Denuncia) obj);

        } else if (obj instanceof DenunciaResponse) {
            return convert((DenunciaResponse) obj);
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
