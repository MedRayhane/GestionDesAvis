package org.sid.service;

import java.util.List;

import org.sid.dao.IAvisDAO;
import org.sid.entities.Avis;

public class AvisServiceImpl implements IAvisService {
IAvisDAO dao;


	public void setDao(IAvisDAO dao) {
	this.dao = dao;
}

	public void AjouterAvis(Avis avis) {
	dao.AjouterAvis(avis);
		
	}

	public List<Avis> ListAvis() {
		// TODO Auto-generated method stub
		return dao.ListAvis();
	}

	public Avis getAvis(String ref) {
		// TODO Auto-generated method stub
		return dao.getAvis(ref);
	}

	public void supprimerAvis(String ref) {
dao.supprimerAvis(ref);
		
	}

	public void updateAvis(Avis avis) {
	dao.updateAvis(avis);
		
	}

}
