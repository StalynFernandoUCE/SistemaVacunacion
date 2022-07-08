package com.vacunasjava.vacunas.dao;

import com.vacunasjava.vacunas.models.Usuario;

import java.util.List;

public interface UsuarioDao {
    List<Usuario> getUsuarios();

    void eliminar(Integer id);

    void registrar(Usuario usuario);
    Usuario obtenerUsurioPorCredenciales(Usuario usuario);
}
