package com.riego.sistema_riego_ad.service;

import com.riego.sistema_riego_ad.model.Usuario;

import java.util.List;

public interface IUsuarioService {
    Usuario create(Usuario usuario);
    Usuario update(Usuario usuario);
    Usuario findById(Integer idUsuario);
    List<Usuario> findAll();
    void delete(Integer idUsuario);
}
