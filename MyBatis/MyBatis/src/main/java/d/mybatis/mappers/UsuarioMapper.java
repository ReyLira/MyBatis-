/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d.mybatis.mappers;

import d.mybatis.pojos.Usuario;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface UsuarioMapper {
    void insertUsuario(Usuario usuario);
    List<Usuario>getUsuarios();
    
}
