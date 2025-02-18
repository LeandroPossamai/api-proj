package com.example.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "usuarios")
public class Usuario {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  private String nome;

  @Column(nullable = false, unique = true)
  private String email;

  @Column(nullable = false)
  private String senha;

  @Column(nullable = false)
  private String perfil;

  @Column(name = "data_criacao", nullable = false)
  private LocalDateTime dataCriacao = LocalDateTime.now();

  @Column(name = "ultimo_login")
  private LocalDateTime ultimoLogin;

  // Getters e Setters
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }

  public String getPerfil() {
    return perfil;
  }

  public void setPerfil(String perfil) {
    this.perfil = perfil;
  }

  public LocalDateTime getDataCriacao() {
    return dataCriacao;
  }

  public LocalDateTime getUltimoLogin() {
    return ultimoLogin;
  }

  public void setUltimoLogin(LocalDateTime ultimoLogin) {
    this.ultimoLogin = ultimoLogin;
  }
}
