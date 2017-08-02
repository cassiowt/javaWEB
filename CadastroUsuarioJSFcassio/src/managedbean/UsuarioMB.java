package managedbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import model.Usuario;

@ManagedBean
@SessionScoped
public class UsuarioMB {
	private Usuario usuario;
	private String msg;
	
	public UsuarioMB() {
	 usuario = new Usuario();
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public void save() {
	
		this.setMsg("Usuario " +  usuario.getNome() + " salvo com sucesso " );
		
	}
}
