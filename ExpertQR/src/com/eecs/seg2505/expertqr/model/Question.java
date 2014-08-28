package com.eecs.seg2505.expertqr.model;

import java.util.UUID;

import com.eecs.seg2505.expertqr.Constantes;

public class Question {
	
	protected String ID = Constantes.STRING_VIDE;
	protected String texte = Constantes.STRING_VIDE;
	protected String expertiseRequise = Constantes.STRING_VIDE;
	protected String utilisateurID = Constantes.STRING_VIDE;
	
	public Question() {	
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
	
	public String getExpertiseRequise() {
		return expertiseRequise;
	}
	
	public void setExpertiseRequise(String expertise) {
		this.expertiseRequise = expertise;
	}
	
	public String getUtilisateurID() {
		return utilisateurID;
	}
	
	public void setUtilisateurID(String utilisateurID) {
		this.utilisateurID = utilisateurID;
	}
}
