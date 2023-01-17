package com.riego.sistema_riego_ad.service;

import com.riego.sistema_riego_ad.model.Usuario;
import com.riego.sistema_riego_ad.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService implements IUsuarioService{
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Override
    public Usuario create(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario update(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario findById(Integer idUsuario) {
        Optional <Usuario> usuario=usuarioRepository.findById(idUsuario);
        return usuario.orElse(null);
    }

    @Override
    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    @Override
    public void delete(Integer idUsuario) {
        usuarioRepository.deleteById(idUsuario);
    }
}
