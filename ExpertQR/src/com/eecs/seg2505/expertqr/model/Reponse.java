package com.eecs.seg2505.expertqr.model;

import java.util.UUID;

import com.eecs.seg2505.expertqr.Constantes;

public class Reponse {
	
	protected String ID = Constantes.STRING_VIDE;
	protected String texte = Constantes.STRING_VIDE;
	protected String questionID = Constantes.STRING_VIDE;
	protected String expertID = Constantes.STRING_VIDE;
	protected int evaluation = -1;
	
	public Reponse() {	
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
	
	public String getQuestionID() {
		return questionID;
	}
	
	public void setQuestionID(String questionID) {
		this.questionID = questionID;
	}
	
	public String getExpertID() {
		return expertID;
	}
	
	public void setExpertID(String expertID) {
		this.expertID = expertID;
	}
	
	public int getEvaluation() {
		return evaluation;
	}
	
	public void setEvaluation(int eval) {
		this.evaluation = eval;
	}
}
