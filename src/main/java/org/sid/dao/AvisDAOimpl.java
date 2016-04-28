package org.sid.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.Logger;
import org.sid.entities.Avis;

public class AvisDAOimpl implements IAvisDAO {
	private Map<String, Avis> produits = new HashMap<String, Avis>();

	// Logger loge=Logger.getLogger(this.getClass());
	public void AjouterAvis(Avis avis) {
		produits.put(avis.getNom(), avis);

	}

	public List<Avis> ListAvis() {
		// TODO Auto-generated method stub
		return new ArrayList<Avis>(produits.values());
	}

	public Avis getAvis(String ref) {
		// TODO Auto-generated method stub
		return produits.get(ref);
	}

	public void supprimerAvis(String ref) {
		produits.remove(ref);

	}

	public void updateAvis(Avis avis) {
		produits.put(avis.getNom(), avis);

	}

	public void init() {

		System.out.println("initialisation des AVIS");
	

	}

}
