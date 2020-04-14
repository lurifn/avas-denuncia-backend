package com.luanafn.avas.denunciabackend.adapter.ports.in.http.denuncia.entity;

import com.luanafn.avas.denunciabackend.adapter.ports.in.http.data.entity.Data;
import com.luanafn.avas.denunciabackend.adapter.ports.in.http.pessoa.entity.PessoaRequest;
import com.luanafn.avas.denunciabackend.core.denuncia.enums.TipoAgressao;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class DenunciaRequest {
    private Long id;
    private Date dataInclusao;
    private PessoaRequest denunciante;
    private PessoaRequest vitima;
    private List<PessoaRequest> agressores;
    private List<PessoaRequest> testemunhas;
    private Data dataOcorrencia; // o denunciante pode não saber a data exata
    private String Local;
    private String ocorrencia;
    private boolean possuiProva;
    private boolean agressorConhecido;
    private TipoAgressao tipoAgressao;
}
