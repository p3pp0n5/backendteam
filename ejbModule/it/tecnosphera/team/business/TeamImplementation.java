package it.tecnosphera.team.business;

import it.tecnosphera.team.entity.Team;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class TeamImplementation implements TeamInterface {

	@PersistenceContext
	EntityManager em;
	
	@Override
	public Team getTeam() {
		Team u = em.find(Team.class, 1);
		Team t = new Team();
		t.setName("Team_a_caso");
		return t;
	}

}
