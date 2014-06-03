package managers;

import java.util.List;

import org.hibernate.Session;

import dbmodel.Aerodrom;

public class AerodromManager {

	@SuppressWarnings("unchecked")
	public static List<Aerodrom> sviAerodromi() {
		
		Session s = HibernateUtil.getSessionFactory().getCurrentSession();
		List<Aerodrom> l;
		s.beginTransaction();
		try {
			l = s.createQuery("from Aerodrom a").list();
		}
		catch (Exception e) {
			l = null;
		}
		
		s.getTransaction().commit();
		return l;
		
	}
	
}
