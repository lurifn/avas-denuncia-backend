package com.luanafn.avas.denunciabackend.adapter.ports.in.http.denuncia.entity;

import com.luanafn.avas.denunciabackend.adapter.ports.in.http.pessoa.entity.PessoaResponse;
import com.luanafn.avas.denunciabackend.core.denuncia.enums.TipoAgressao;
import lombok.Getter;
import lombok.Setter;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Getter
@Setter
public class DenunciaResponse {
    private Long id;
    private Date dataInclusao;
    private PessoaResponse denunciante;
    private PessoaResponse vitima;
    private List<PessoaResponse> agressores;
    private List<PessoaResponse> testemunhas;
    private Calendar dataOcorrencia; // é um calendar pois o denunciante pode não saber a data exata
    private String Local;
    private String ocorrencia;
    private boolean possuiProva;
    private boolean agressorConhecido;
    private TipoAgressao tipoAgressao;
}
