package com.luanafn.avas.denunciabackend.adapter.ports.out.bd.denuncia.repository;

import com.luanafn.avas.denunciabackend.adapter.ports.out.bd.denuncia.dto.DenunciaDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DenunciaRepository extends JpaRepository<DenunciaDTO, Long> {
}
