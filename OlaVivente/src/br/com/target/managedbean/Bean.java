package br.com.target.managedbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Bean {

	
	
	public int registrosExcluidos() {
		return 10;
	}
	
	
}
