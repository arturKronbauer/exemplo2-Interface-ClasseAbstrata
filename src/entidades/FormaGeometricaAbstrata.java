package entidades;

import entidades.enumeradas.Cor;

public abstract class FormaGeometricaAbstrata implements FormaGeometrica{

	private Cor cor;

	public FormaGeometricaAbstrata(Cor cor) {
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}	
}
