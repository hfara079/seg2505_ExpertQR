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
package com.eecs.seg2505.expertqr.db;

import java.util.List;

import com.eecs.seg2505.expertqr.model.Expertise;
import com.eecs.seg2505.expertqr.model.Question;
import com.eecs.seg2505.expertqr.model.Reponse;
import com.eecs.seg2505.expertqr.model.Utilisateur;

public abstract class DBFacade {

	/**
	 * @param expertise L'expertise associ�e � une question
	 * @return Une liste de questions qui n�cessitent l'expertise dans le param�tre
	 */
	public abstract List<Question> getQuestionsPourExpertise(String expertise);
	
	/**
	 * @param userName
	 * @return
	 */
	public abstract List<Question> getQuestionsPourUtilisateur(String userName);
	
	/**
	 * @param question
	 * @return
	 */
	public abstract Reponse getReponsePourQuestion(Question question);
	
	/**
	 * M�thode pour sauvegarder une Question
	 * @param question
	 */
	public abstract void sauvegardeQuestion(Question question);
	
	/**
	 * M�thode pour sauvegarder une Reponse
	 * @param reponse
	 */
	public abstract void sauvegardeReponse(Reponse reponse);
	
	/**
	 * M�thode pour sauvegarder un Utilisateur
	 * @param utilisateur
	 */
	public abstract void sauvegardeUtilisateur(Utilisateur utilisateur);
	
	/**
	 * M�thode pour sauvegarder une Expertise
	 * @param expertise
	 */
	public abstract void sauvegardeExpertise(Expertise expertise);
}
