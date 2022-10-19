package gol;

public class Goleiro {
	
	private int velocidade;
	private int flexibilidade;
	private int agilidade;
	private int coordenação;
	private int força;
	private int equilibrio;
	
	
	
	public Goleiro(int velocidade, int flexibilidade, int agilidade, int coordenação, int força, int equilibrio) {
		super();
		this.velocidade = velocidade;
		this.flexibilidade = flexibilidade;
		this.agilidade = agilidade;
		this.coordenação = coordenação;
		this.força = força;
		this.equilibrio = equilibrio;
	}
	
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		if (velocidade != 0)
		this.velocidade = velocidade;
	}
	public int getFlexibilidade() {
		return flexibilidade;
	}
	public void setFlexibilidade(int flexibilidade) {
		if (flexibilidade != 0)
		this.flexibilidade = flexibilidade;
	}
	public int getAgilidade() {
		return agilidade;
	}
	public void setAgilidade(int agilidade) {
		if (agilidade != 0)
		this.agilidade = agilidade;
	}
	public int getCoordenação() {
		return coordenação;
	}
	public void setCoordenação(int coordenação) {
		if (coordenação != 0)
		this.coordenação = coordenação;
	}
	public int getForça() {
		return força;
	}
	public void setForça(int força) {
		if (força != 0)
		this.força = força;
	}
	public int getEquilibrio() {
		return equilibrio;
	}
	public void setEquilibrio(int equilibrio) {
		if (equilibrio != 0)
		this.equilibrio = equilibrio;
	}

}
