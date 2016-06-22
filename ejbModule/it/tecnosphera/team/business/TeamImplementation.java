package it.tecnosphera.team.business;

import it.tecnosphera.team.entity.Team;

import javax.ejb.Stateless;

@Stateless
public class TeamImplementation implements TeamInterface {

	@Override
	public Team getTeam() {
		Team t = new Team();
		t.setName("Team_a_caso");
		return t;
	}

}
