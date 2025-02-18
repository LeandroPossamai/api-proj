package com.example.controller;

import com.example.model.Usuario;
import com.example.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

  @Autowired
  private UsuarioService usuarioService;

  @GetMapping
  public List<Usuario> listarUsuarios() {
    return usuarioService.listarUsuarios();
  }

  @GetMapping("/{id}")
  public Optional<Usuario> buscarPorId(@PathVariable Long id) {
    return usuarioService.buscarPorId(id);
  }

  @PostMapping
  public Usuario salvarUsuario(@RequestBody Usuario usuario) {
    return usuarioService.salvarUsuario(usuario);
  }

  @DeleteMapping("/{id}")
  public void deletarUsuario(@PathVariable Long id) {
    usuarioService.deletarUsuario(id);
  }
}
