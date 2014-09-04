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
package com.eecs.seg2505.expertqr;

import java.util.List;

import com.eecs.seg2505.expertqr.controlleur.ExpertiseControlleur;
import com.eecs.seg2505.expertqr.controlleur.QuestionControlleur;
import com.eecs.seg2505.expertqr.controlleur.ReponseControlleur;
import com.eecs.seg2505.expertqr.controlleur.UtilisateurControlleur;
import com.eecs.seg2505.expertqr.db.DBFacade;
import com.eecs.seg2505.expertqr.db.ParseFacade;
import com.eecs.seg2505.expertqr.model.Expertise;
import com.eecs.seg2505.expertqr.model.Question;
import com.eecs.seg2505.expertqr.model.Reponse;
import com.eecs.seg2505.expertqr.model.Utilisateur;

/**
 * @author Hanna
 *
 */
public class Delegateur {
	
	public static DBFacade dbFacade = new ParseFacade();
	public static QuestionControlleur questionControlleur = new QuestionControlleur(dbFacade);
	public static ReponseControlleur reponseControlleur = new ReponseControlleur(dbFacade);
	public static UtilisateurControlleur utilisateurControlleur = new UtilisateurControlleur(dbFacade);
	public static ExpertiseControlleur expertiseControlleur = new ExpertiseControlleur(dbFacade);
	
	
	public static List<Question> getQuestionsPourExpertise(Expertise expertise) {
		return questionControlleur.getQuestionsPourExpertise(expertise);
	}
	
	public static List<Question> getQuestionsPourUtilisateur(Utilisateur utilisateur) {
		 return questionControlleur.getQuestionsPourUtilisateur(utilisateur);
	}
	
	public static Reponse getReponsePourQuestion(Question question) {
		return reponseControlleur.getReponsePourQuestion(question);
	}

}
