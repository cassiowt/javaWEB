package managedbean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import dao.AnimalDAO;
import model.Animal;

@ManagedBean
@SessionScoped
public class AnimalMB {
	private Animal animal;
	private String msg;
	private AnimalDAO dao;

	public AnimalMB() {
		animal = new Animal();
		dao = new AnimalDAO();
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void save() {
		dao.save(animal);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info",
				"Animal " + animal.getApelido() + " salvo com sucesso "));
		animal = new Animal();
	}
}
