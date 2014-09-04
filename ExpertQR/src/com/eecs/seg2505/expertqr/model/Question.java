/**
 * This file contains material supporting the course SEG2505: Introduction to Software 
 * Engineering at the University of Ottawa.
 *
 * This program is free software; permission is hereby granted to use, copy, modify,
 * and distribute this source code, or portions thereof, for any purpose, without fee,
 * subject to the restriction that the copyright notice may not be removed
 * or altered from any source or altered source distribution.
 * The software is released on an as-is basis and without any warranties of any kind.
 * In particular, the software is not guaranteed to be fault-tolerant or free from failure.
 * The author disclaims all warranties with regard to this software, any use,
 * and any consequent failure, is purely the responsibility of the user.
 */
package com.eecs.seg2505.expertqr.model;

import java.io.Serializable;

import com.eecs.seg2505.expertqr.Constantes;

/**
 * @author Hanna
 *
 */
public class Question implements Serializable {
	
	private static final long serialVersionUID = 3934812072582712484L;
	/**
	 */
	protected String texte = Constantes.STRING_VIDE;
	/**
	 */
	protected String expertiseRequise = Constantes.STRING_VIDE;
	/**
	 */
	protected String utilisateurID = Constantes.STRING_VIDE;
	/**
	 */
	protected Reponse reponse = null;
	
	public Question() {	
	}
	
	/**
	 * @return
	 */
	public String getTexte() {
		return texte;
	}
	
	/**
	 * @param texte
	 */
	public void setTexte(String texte) {
		this.texte = texte;
	}
	
	/**
	 * @return
	 */
	public String getExpertiseRequise() {
		return expertiseRequise;
	}
	
	/**
	 * @param expertise
	 */
	public void setExpertiseRequise(String expertise) {
		this.expertiseRequise = expertise;
	}
	
	/**
	 * @return
	 */
	public String getUtilisateurID() {
		return utilisateurID;
	}
	
	/**
	 * @param utilisateurID
	 */
	public void setUtilisateurID(String utilisateurID) {
		this.utilisateurID = utilisateurID;
	}

	/**
	 * @return
	 */
	public Reponse getReponse() {
		return reponse;
	}

	/**
	 * @param reponse
	 */
	public void setReponse(Reponse reponse) {
		this.reponse = reponse;
	}
}
