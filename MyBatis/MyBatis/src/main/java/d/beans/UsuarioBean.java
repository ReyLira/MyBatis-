/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d.beans;

import d.mybatis.MyBatisUtil;
import d.mybatis.pojos.Usuario;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.apache.ibatis.session.SqlSession;

/**
 *
 * @author Usuario
 */
@ManagedBean
@RequestScoped
public class UsuarioBean {

    private Usuario usuario;
    
    public UsuarioBean() {
        usuario = new Usuario();
    }
    public Usuario getUsuario(){
        return usuario;
    
    }
    public void  setUsuario(Usuario usuario){
    this.usuario = usuario;
    }
    
    public String guardar(){
        
        usuario.setId(-1);
        SqlSession session = new MyBatisUtil().getSession();
        if(session !=null){
            try{
            session.insert("Usuario.insertarUsuario",usuario);
            session.commit();
            }finally{
            session.close();
            }
        }else{
            System.out.println("Error");
        }
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Aviso","usuario creado"));
        
        return "index";
        
    
    }
    public List<Usuario> getUsuarios(){
     List<Usuario> lista = null;
     SqlSession session = new MyBatisUtil().getSession();
     if(session !=null){
         try {
             lista = session.selectList("Usuario.getUsuario");
             session.commit();
         } finally {
             session.close();
         }
     }else{
         System.out.println("Error");
     }
        return lista;
    
    }
}
