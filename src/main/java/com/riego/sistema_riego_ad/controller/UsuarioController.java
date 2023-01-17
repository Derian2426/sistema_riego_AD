package com.riego.sistema_riego_ad.controller;

import com.riego.sistema_riego_ad.exeptions.ModelNotFoundException;
import com.riego.sistema_riego_ad.model.Usuario;
import com.riego.sistema_riego_ad.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;
    @GetMapping
    public ResponseEntity<List<Usuario>> listaUsuario(){
        return new ResponseEntity<>(usuarioService.findAll(), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Usuario> createUser(@RequestBody Usuario usuario){
        return new ResponseEntity<>(usuarioService.create(usuario), HttpStatus.CREATED);
    }
    @PutMapping
    public  ResponseEntity<Usuario> updateUser(@RequestBody Usuario usuario){
        return new ResponseEntity<>(usuarioService.update(usuario), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Usuario> finById(@PathVariable("id") Integer idUsuario){
        Usuario usuario= usuarioService.findById(idUsuario);
        if (usuario==null)
            throw new ModelNotFoundException("El usuario no fue encontrado!!!");
        return new ResponseEntity<>(usuario,HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id") Integer idUsuario) throws Exception {
        Usuario usuario= usuarioService.findById(idUsuario);
        if (usuario==null)
            throw new ModelNotFoundException("El usuario que pretende eliminar no existe!!!");
        usuarioService.delete(idUsuario);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
