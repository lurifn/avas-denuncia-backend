package com.luanafn.avas.denunciabackend.adapter.ports.in.http.denuncia;

import com.luanafn.avas.denunciabackend.adapter.ports.in.http.denuncia.conversor.DenunciaRequestConversor;
import com.luanafn.avas.denunciabackend.adapter.ports.in.http.denuncia.conversor.DenunciaResponseConversor;
import com.luanafn.avas.denunciabackend.adapter.ports.in.http.denuncia.entity.DenunciaRequest;
import com.luanafn.avas.denunciabackend.adapter.ports.in.http.denuncia.entity.DenunciaResponse;
import com.luanafn.avas.denunciabackend.core.denuncia.ports.in.DenunciaIncluirUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DenunciaController {
    private final DenunciaIncluirUseCase denunciaIncluirUseCase;
    private final DenunciaRequestConversor denunciaRequestConversor;
    private final DenunciaResponseConversor denunciaResponseConversor;

    /**
     * Cadastra uma nova denúncia.
     * Nenhum campo é obrigatório.
     *
     * @param denunciaRequest denúncia a ser cadastrada
     * @return denúncia cadastrada
     */
    @PostMapping
    public DenunciaResponse incluirDenuncia(@RequestBody DenunciaRequest denunciaRequest) {
        return denunciaResponseConversor.convert(
                denunciaIncluirUseCase.incluir(denunciaRequestConversor.convert(denunciaRequest))
        );
    }
}
