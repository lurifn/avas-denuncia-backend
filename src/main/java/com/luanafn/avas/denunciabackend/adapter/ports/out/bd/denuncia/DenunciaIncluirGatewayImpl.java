package com.luanafn.avas.denunciabackend.adapter.ports.out.bd.denuncia;

import com.luanafn.avas.denunciabackend.adapter.ports.out.bd.denuncia.conversor.DenunciaDTOConversor;
import com.luanafn.avas.denunciabackend.adapter.ports.out.bd.denuncia.repository.DenunciaRepository;
import com.luanafn.avas.denunciabackend.core.denuncia.entity.Denuncia;
import com.luanafn.avas.denunciabackend.core.denuncia.ports.out.DenunciaIncluirGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DenunciaIncluirGatewayImpl implements DenunciaIncluirGateway {
    private final DenunciaRepository denunciaRepository;
    private final DenunciaDTOConversor denunciaDTOConversor;

    /**
     * Inclui uma denúncia no sistema.
     * Nenhuma informação deve ser obrigatória.
     *
     * @param denuncia a ser incluída
     * @return denúncia incluída
     */
    @Override
    public Denuncia incluir(Denuncia denuncia) {
        return denunciaDTOConversor.convert(denunciaRepository.save(denunciaDTOConversor.convert(denuncia)));
    }
}
