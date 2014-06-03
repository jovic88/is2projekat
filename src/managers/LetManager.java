package managers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import servlets.ServletUtils;

import dbmodel.Let;

public class LetManager {
	
	static long MILLIS_IN_DAY = 86400000;

	public static List<Let> letovi(String idAerodroma1, String idAerodroma2, String datum) throws ParseException {
		
		Session s = HibernateUtil.getSessionFactory().getCurrentSession();
		List<Let> l;
		Date date = new SimpleDateFormat(ServletUtils.DATEFORMAT).parse(datum);
		s.beginTransaction();
		try {
			Query q = s.createQuery("from Let l join fetch l.linija lin join fetch l.kompanija k " +
					"where lin.aerodromStart.idAerodroma = :a1 " +
					"and lin.aerodromFinish.idAerodroma = :a2");
			q.setString("a1",idAerodroma1);
			q.setString("a2",idAerodroma2);
			l = q.list();
			
			System.out.println(idAerodroma1);
			System.out.println(idAerodroma2);
			System.out.println(l);
			
			Iterator<Let> i = l.iterator();
			while (i.hasNext()) {
				Let let = i.next();
				
				Calendar c1 = Calendar.getInstance();
				c1.setTime(date);
				
				System.out.println(c1.getTime());
				
				Calendar c2 = Calendar.getInstance();
				c2.setTime(let.getVremePoletanja());
				
				System.out.println(c2.getTime());
				
				Calendar c3 = Calendar.getInstance();
				c3.setTime(let.getVremePoletanja());
				c3.roll(Calendar.DATE, true);
				
				System.out.println(c3.getTime());
				
				
				
				if(! (c1.before(c2) && (c2.before(c3)))) {
					i.remove();
				}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			l = null;
		}
		
		s.getTransaction().commit();
		return l;
		
	}
	
}
