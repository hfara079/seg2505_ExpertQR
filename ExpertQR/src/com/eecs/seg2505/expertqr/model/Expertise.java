package com.eecs.seg2505.expertqr.model;

import java.util.UUID;

import com.eecs.seg2505.expertqr.Constantes;

public class Expertise {

	protected String ID = Constantes.STRING_VIDE;
	protected String texte = Constantes.STRING_VIDE;
	
	public Expertise() {
		this.ID = UUID.randomUUID().toString();
	}
	
	public String getID() {
		return this.ID;
	}
	
	public String getTexte() {
		return texte;
	}
	
	public void setTexte(String texte) {
		this.texte = texte;
	}
}
