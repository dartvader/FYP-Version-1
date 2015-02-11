package com.claimvantage.data;

import java.util.ArrayList;
import java.util.List;

import com.claimvantage.model.Session;

public class SessionRepository {
	
	private static SessionRepository instance = null;
	
	private List<Session> sessions;
	
	public SessionRepository() {
		sessions = new ArrayList<Session>();
	}

	public static SessionRepository instance() {
		if (instance == null) {
			instance = new SessionRepository();
		}
		return instance;
	}
	
	public void addSession(Session session) {
		sessions.add(session);
	}
	
	public List<Session> getSessions() {
		return sessions;
	}

	public void setSessions(List<Session> sessions) {
		this.sessions = sessions;
	}
}
