package com.luanafn.avas.denunciabackend.adapter.ports.in.http.denuncia.conversor;

import com.luanafn.avas.denunciabackend.adapter.ports.in.http.data.conversor.DataCalendarConversor;
import com.luanafn.avas.denunciabackend.adapter.ports.in.http.denuncia.entity.DenunciaRequest;
import com.luanafn.avas.denunciabackend.adapter.ports.in.http.pessoa.conversor.PessoaRequestConversor;
import com.luanafn.avas.denunciabackend.core.denuncia.entity.Denuncia;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component
@RequiredArgsConstructor
public class DenunciaRequestConversor {
    private final PessoaRequestConversor pessoaRequestConversor;
    private final DataCalendarConversor dataCalendarConversor;

    public Denuncia convert(DenunciaRequest request) {
        if (Objects.isNull(request)) return null;

        Denuncia entity = new Denuncia();
        entity.setAgressorConhecido(request.isAgressorConhecido());
        entity.setAgressores(pessoaRequestConversor.convert(request.getAgressores()));
        entity.setDataInclusao(request.getDataInclusao());
        entity.setDataOcorrencia(dataCalendarConversor.convert(request.getDataOcorrencia()));
        entity.setDenunciante(pessoaRequestConversor.convert(request.getDenunciante()));
        entity.setId(request.getId());
        entity.setLocal(request.getLocal());
        entity.setOcorrencia(request.getOcorrencia());
        entity.setPossuiProva(request.isPossuiProva());
        entity.setTestemunhas(pessoaRequestConversor.convert(request.getTestemunhas()));
        entity.setTipoAgressao(request.getTipoAgressao());
        entity.setVitima(pessoaRequestConversor.convert(request.getVitima()));

        return entity;
    }

    public DenunciaRequest convert(Denuncia entity) {
        if (Objects.isNull(entity)) return null;

        DenunciaRequest request = new DenunciaRequest();
        request.setAgressorConhecido(entity.isAgressorConhecido());
        request.setAgressores(pessoaRequestConversor.convert(entity.getAgressores()));
        request.setDataInclusao(entity.getDataInclusao());
        request.setDataOcorrencia(dataCalendarConversor.convert(entity.getDataOcorrencia()));
        request.setDenunciante(pessoaRequestConversor.convert(entity.getDenunciante()));
        request.setId(entity.getId());
        request.setLocal(entity.getLocal());
        request.setOcorrencia(entity.getOcorrencia());
        request.setPossuiProva(entity.isPossuiProva());
        request.setTestemunhas(pessoaRequestConversor.convert(entity.getTestemunhas()));
        request.setTipoAgressao(entity.getTipoAgressao());
        request.setVitima(pessoaRequestConversor.convert(entity.getVitima()));

        return request;
    }

    private Object convert(Object obj) {
        if (Objects.isNull(obj)) return null;

        if (obj instanceof Denuncia) {
            return convert((Denuncia) obj);

        } else if (obj instanceof DenunciaRequest) {
            return convert((DenunciaRequest) obj);
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
