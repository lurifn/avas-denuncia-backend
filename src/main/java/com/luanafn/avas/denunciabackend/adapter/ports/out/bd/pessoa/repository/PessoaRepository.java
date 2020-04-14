package com.luanafn.avas.denunciabackend.adapter.ports.out.bd.pessoa.repository;

import com.luanafn.avas.denunciabackend.adapter.ports.out.bd.pessoa.dto.PessoaDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<PessoaDTO, Long> {
}
