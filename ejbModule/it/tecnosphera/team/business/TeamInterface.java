package it.tecnosphera.team.business;

import javax.ejb.Remote;

import it.tecnosphera.team.entity.Team;

@Remote
public interface TeamInterface {
	public Team getTeam();
}
