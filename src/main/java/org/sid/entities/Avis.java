package org.sid.entities;

import java.io.Serializable;

public class Avis implements Serializable {
	private String nom;
	private String prenom;
	private String Note;
	private String Statut;



	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNote() {
		return Note;
	}

	public void setNote(String note) {
		Note = note;
	}

	public String getStatut() {
		return Statut;
	}

	public void setStatut(String statut) {
		Statut = statut;
	}



	public Avis(String nom, String prenom, String note, String statut) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		Note = note;
		Statut = statut;
	}

	public Avis() {
		super();
		// TODO Auto-generated constructor stub
	}

}
