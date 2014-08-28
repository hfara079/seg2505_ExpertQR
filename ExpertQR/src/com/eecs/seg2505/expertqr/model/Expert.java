package com.eecs.seg2505.expertqr.model;

import com.eecs.seg2505.expertqr.Constantes;

public class Expert extends Utilisateur {
	protected String expertiseID = Constantes.STRING_VIDE;

	public Expert() {
		super();
	}

	public String getExpertiseID() {
		return expertiseID;
	}

	public void setExpertiseID(String expertiseID) {
		this.expertiseID = expertiseID;
	}
	
	
}
