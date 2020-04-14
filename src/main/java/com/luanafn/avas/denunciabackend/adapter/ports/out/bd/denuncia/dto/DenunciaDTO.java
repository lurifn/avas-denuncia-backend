package com.luanafn.avas.denunciabackend.adapter.ports.out.bd.denuncia.dto;

import com.luanafn.avas.denunciabackend.adapter.ports.out.bd.pessoa.dto.PessoaDTO;
import com.luanafn.avas.denunciabackend.core.denuncia.enums.TipoAgressao;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class DenunciaDTO {
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false, updatable = false)
    @CreatedDate
    private Date dataInclusao;
    @ManyToOne
    @Cascade({CascadeType.PERSIST})
    private PessoaDTO denunciante;
    @ManyToOne
    @Cascade({CascadeType.PERSIST})
    private PessoaDTO vitima;
    @ManyToMany
    @Cascade({CascadeType.PERSIST})
    private List<PessoaDTO> agressores;
    @ManyToMany
    @Cascade({CascadeType.PERSIST})
    private List<PessoaDTO> testemunhas;
    private Calendar dataOcorrencia; // é um calendar pois o denunciante pode não saber a data exata
    private String Local;
    @Lob
    private String ocorrencia;
    private boolean possuiProva;
    private boolean agressorConhecido;
    private TipoAgressao tipoAgressao;
}
