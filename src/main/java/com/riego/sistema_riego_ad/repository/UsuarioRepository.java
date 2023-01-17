package com.riego.sistema_riego_ad.repository;

import com.riego.sistema_riego_ad.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {
}
