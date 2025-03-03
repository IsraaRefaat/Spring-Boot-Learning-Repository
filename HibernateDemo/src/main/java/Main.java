import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import org.hibernate.Transaction;


public class Main {
	
	public static void main(String args[] ) throws Exception {
		
		
		Laptop l1 = new Laptop();
		l1.setId(101);
		l1.setName("Lenovo");
		l1.setModel("IdeapadGaming");
		l1.setRam(16);
		
		Alien alien = new Alien();
		alien.setId(0);
		alien.setName("Esraa");
		alien.setTech("Java");
		alien.setLaptop(l1);
		
//		Student student = new Student();
//		
//		student.setId(1);
//		student.setName("Mahmoud");
//		student.setAge(23);
		
	
		
//		Configuration cfg = new Configuration(); 
//		cfg.addAnnotatedClass(Student.class);
//		cfg.configure();
		
//		SessionFactory sf = cfg.buildSessionFactory();
		
		
		SessionFactory sf = new Configuration()
				.addAnnotatedClass(Alien.class)
				.addAnnotatedClass(Laptop.class)
				.configure().buildSessionFactory();
		
		Session session = sf.openSession();
//		
//		student = session.get(Student.class, 0);
//		
		Transaction transaction = session.beginTransaction(); //just with creating not fitching data
		
		session.persist(l1);
		session.persist(alien);
		
//		session.merge(student);
	  
		
//		session.remove(student);
		
		
//		session.merge(alien);
//		
//		
		transaction.commit();
		
	
		
		
		session.close();
		sf.close();
		
		
		
		
	}
	
	
}
