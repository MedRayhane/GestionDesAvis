package org.sid.service;

import java.util.List;

import org.sid.entities.Avis;

public interface IAvisService {
	public void AjouterAvis(Avis avis);
	public List<Avis> ListAvis();
	public Avis getAvis(String ref);
	public void supprimerAvis(String ref);
	public void updateAvis(Avis avis);

}
