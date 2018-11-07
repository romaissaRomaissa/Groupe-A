package org.mql.platform.dao.preregistration;


import java.util.List;

import org.mql.platform.models.preregistration.Candidat;

public interface CandidatDomParser {
	public List<Candidat> loadData();
	public void addCandidat(Candidat candidat);
	public boolean updateCandidat(Candidat candidat);
}
