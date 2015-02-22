package com.claimvantage.data;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;

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
		UUID randomId = UUID.randomUUID();
		session.setId(randomId);
		sessions.add(session);
	}
	
	public List<Session> getSessions() {
		return sessions;
	}

	public void setSessions(List<Session> sessions) {
		// TODO add unique id to the session
		this.sessions = sessions;
	}
	
	public void getSession(List<Session> sessions) {
		this.sessions = sessions;
	}

	public Session getSessionsById(String sessionId) {
		for (Session s : sessions) {
			System.out.println("sessionId " + sessionId + "s.getId" + s.getId());
			System.out.println(sessionId == s.getId().toString());
			System.out.println(s.getId().toString().contains(sessionId));
			
			if (s.getId().toString().contains(sessionId)) {
				System.out.println("Printing the session " + s.toString());
				return s;
			}
		}
		return null;
	}
}
