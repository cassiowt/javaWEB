package managedbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import dao.UsuarioDAO;
import model.Usuario;

@ManagedBean
@SessionScoped
public class UsuarioMB {
	private Usuario usuario;
	private String msg;
	private UsuarioDAO dao;
	
	public UsuarioMB() {
	 usuario = new Usuario();
	 dao = new UsuarioDAO();
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
		dao.save(usuario);
		
		
	}
}
