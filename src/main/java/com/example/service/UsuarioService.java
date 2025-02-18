package com.example.service;

import com.example.model.Usuario;
import com.example.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class UsuarioService {
  @Autowired
  private UsuarioRepository usuarioRepository;

  public List<Usuario> listarUsuarios() {
    return usuarioRepository.findAll();
  }

  public Optional<Usuario> buscarPorId(Long id) {
    return usuarioRepository.findById(id);
  }

  public Usuario salvarUsuario(Usuario usuario) {
    return usuarioRepository.save(usuario);
  }

  public void deletarUsuario(Long id) {
    usuarioRepository.deleteById(id);
  }

}
