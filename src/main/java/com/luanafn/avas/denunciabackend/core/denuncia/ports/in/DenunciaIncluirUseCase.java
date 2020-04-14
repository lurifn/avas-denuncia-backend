package com.luanafn.avas.denunciabackend.core.denuncia.ports.in;

import com.luanafn.avas.denunciabackend.core.denuncia.entity.Denuncia;

public interface DenunciaIncluirUseCase {
    /**
     * Cadastra uma nova denúncia.
     * Nenhuma informação é obrigatória.
     *
     * @param denuncia denúncia a ser cadastrada
     * @return denúncia incluída
     */
    Denuncia incluir(Denuncia denuncia);
}
