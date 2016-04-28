package org.sid.web;

import java.util.List;

import org.sid.entities.Avis;
import org.sid.service.IAvisService;
import org.sid.service.Singletonservice;

import com.opensymphony.xwork2.ActionSupport;

public class AvisAction extends ActionSupport {
	public Avis avis = new Avis();
	public List<Avis> aviss;
	public String nom;
	public boolean editmode = false;
	private IAvisService service = Singletonservice.getservice();

	public String index() {
		aviss = service.ListAvis();
		return "succee";
	}

	public String save() {
		
			service.AjouterAvis(avis);
		
			//service.updateAvis(avis);
			//editmode=false;
			//avis=new Avis();
		
		aviss = service.ListAvis();
		return "succee";

	}

	public String delete() {
		service.supprimerAvis(nom);
		aviss = service.ListAvis();
		return "succee";
	}

	public String edit() {
		editmode = true;
		avis = service.getAvis(nom);
		service.updateAvis(avis);
		aviss = service.ListAvis();
		return "succee";
	}

}
