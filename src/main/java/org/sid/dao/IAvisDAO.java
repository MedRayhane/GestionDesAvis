package org.sid.dao;

import java.util.List;

import org.sid.entities.Avis;

public interface IAvisDAO {
public void AjouterAvis(Avis avis);
public List<Avis> ListAvis();
public Avis getAvis(String ref);
public void supprimerAvis(String ref);
public void updateAvis(Avis avis);
}
