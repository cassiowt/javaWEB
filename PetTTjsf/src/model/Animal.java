package model;



public class Animal {
	private String especie;
	private String apelido;
	private float tamanho;
	
	public Animal() {
		// TODO Auto-generated constructor stub
	} 
	
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	public float getTamanho() {
		return tamanho;
	}
	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}

	@Override
	public String toString() {
		return "Animal [especie=" + especie + ", apelido=" + apelido + ", tamanho=" + tamanho + "]";
	}
	
	

}
