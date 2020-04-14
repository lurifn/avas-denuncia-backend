package com.luanafn.avas.denunciabackend.core.denuncia.ports.out;

import com.luanafn.avas.denunciabackend.core.denuncia.entity.Denuncia;

public interface DenunciaIncluirGateway {
    /**
     * Inclui uma denúncia no sistema.
     * Nenhuma informação deve ser obrigatória.
     *
     * @param denuncia a ser incluída
     * @return denúncia incluída
     */
    Denuncia incluir(Denuncia denuncia);
}
