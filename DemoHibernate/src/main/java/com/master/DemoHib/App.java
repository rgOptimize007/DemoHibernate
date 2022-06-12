package com.master.DemoHib;

import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
        
//    	Alien alien = new Alien();
//    	
//    	alien.setId(102);
//    	
//    	alien.setColor("Green");
//    	
//    	AlienName aname = new AlienName();
//    	
//    	aname.setFname("Sumit");
//    	aname.setLname("Gharge");
//    	aname.setMname("Sudam");	
//    	alien.setAname(aname);
    
//    	Laptop laptop2 = new Laptop();
//    	
//    	laptop2.setLid(102);
//    	laptop2.setLname("HP");
//    		
//       Laptop laptop3 = new Laptop();
//    	
//    	laptop3.setLid(103);
//    	laptop3.setLname("Lenovo");
    	
  //  	Student st;
    	
//    	st.setSid(3);
//    	st.setSname("Mahesh");
//    	st.setSphone("9769452149");
//    	st.setAddress("Thane");
//    	st.getLaptops().add(laptop2);
//    	
//    	laptop2.setStudent(st);
//    	laptop3.setStudent(st);
    	
    	Alien alien;
    	
    	TempSession tempSession = new TempSession();
    	
    	Session session1 = tempSession.getSession();
    	
    	Transaction tx = session1.beginTransaction();
    	
    	 alien = (Alien)session1.get(Alien.class,102);
    	 
    	 System.out.println(alien);
    	 
    	 tx.commit();
    	 session1.close();
    	 
    	Session session2 = tempSession.getSession();
     	
     	Transaction tx1 = session2.beginTransaction();
     	
     	 alien = (Alien)session2.get(Alien.class,102);
     	 
     	System.out.println(alien);
    	
     	 tx1.commit();
     	session2.close();
// 	 Collection<Laptop> laptops = st.getLaptops();
//  	 
//  	 for(Laptop l : laptops){
//  		 System.out.println(l);
//  	 } 
//    	 
        // type casting is suggested as it returns object of type Object and not of Alien
     //   session.save(laptop2);
     //   session.save(laptop3);
    	
    	
   
    //    System.out.println(st);
    //    System.out.println(laptop);
    	
    }
}
