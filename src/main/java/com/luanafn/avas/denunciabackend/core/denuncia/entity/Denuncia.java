package com.luanafn.avas.denunciabackend.core.denuncia.entity;

import com.luanafn.avas.denunciabackend.core.denuncia.enums.TipoAgressao;
import com.luanafn.avas.denunciabackend.core.pessoa.entity.Pessoa;
import lombok.Getter;
import lombok.Setter;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Getter
@Setter
public class Denuncia {
    private Long id;
    private Date dataInclusao;
    private Pessoa denunciante;
    private Pessoa vitima;
    private List<Pessoa> agressores;
    private List<Pessoa> testemunhas;
    private Calendar dataOcorrencia; // é um calendar pois o denunciante pode não saber a data exata
    private String Local;
    private String ocorrencia;
    private boolean possuiProva;
    private boolean agressorConhecido;
    private TipoAgressao tipoAgressao;
}
