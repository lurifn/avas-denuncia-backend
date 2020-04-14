package com.luanafn.avas.denunciabackend.core.denuncia.ports;

import com.luanafn.avas.denunciabackend.core.denuncia.entity.Denuncia;
import com.luanafn.avas.denunciabackend.core.denuncia.ports.in.DenunciaIncluirUseCase;
import com.luanafn.avas.denunciabackend.core.denuncia.ports.out.DenunciaIncluirGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DenunciaUseCaseImpl implements DenunciaIncluirUseCase {
    private final DenunciaIncluirGateway denunciaIncluirGateway;

    /**
     * Cadastra uma nova denúncia.
     * Nenhuma informação é obrigatória.
     *
     * @param denuncia a ser cadastrada
     * @return denúncia incluída
     */
    @Override
    public Denuncia incluir(Denuncia denuncia) {
        return denunciaIncluirGateway.incluir(denuncia);
    }
}
