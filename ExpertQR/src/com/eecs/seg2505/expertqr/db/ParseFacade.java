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

public class ParseFacade extends DBFacade {

	@Override
	public List<Question> getQuestionsPourExpertise(String expertise) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Question> getQuestionsPourUtilisateur(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reponse getReponsePourQuestion(Question question) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void sauvegardeQuestion(Question question) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sauvegardeReponse(Reponse reponse) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sauvegardeUtilisateur(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sauvegardeExpertise(Expertise expertise) {
		// TODO Auto-generated method stub
		
	}

}
