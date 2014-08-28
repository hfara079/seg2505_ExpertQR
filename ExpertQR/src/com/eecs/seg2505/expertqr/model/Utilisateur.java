package com.eecs.seg2505.expertqr.model;

import java.util.UUID;

import com.eecs.seg2505.expertqr.Constantes;

public class Utilisateur {
	protected String ID = Constantes.STRING_VIDE;
	
	public Utilisateur() {
		this.ID = UUID.randomUUID().toString();
	}
	
	public String getID() {
		return this.ID;
	}
}
