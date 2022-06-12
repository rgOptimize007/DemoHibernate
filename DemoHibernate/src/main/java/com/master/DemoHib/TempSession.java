package com.master.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class TempSession {
	
	Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
	
	ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
	
	SessionFactory sf = con.buildSessionFactory(sr);

	public Session getSession() {
		
		Session session = sf.openSession();
		
		return session;
	}
	
}
