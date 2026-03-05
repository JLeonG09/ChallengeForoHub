package com.alurachallenges.forohub.repository;

import com.alurachallenges.forohub.domain.usuario.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}