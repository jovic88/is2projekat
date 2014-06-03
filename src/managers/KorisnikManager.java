package managers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;

import dbmodel.Korisnik;
import dbmodel.Let;



public class KorisnikManager {

	public static Integer createAndSaveKorisnik(String ime, String prezime, String adresa, Date datumRodjenja, Date datumRegistracije){
		try{
			Session s = HibernateUtil.getSessionFactory().getCurrentSession();
			s.beginTransaction();
			Korisnik k = new Korisnik();
			k.setIme(ime);
			k.setPrezime(prezime);
			k.setAdresa(adresa);
			k.setDatumRodjenja(datumRodjenja);
			k.setDatumRegistracije(datumRegistracije);
			//k.setID(6);
			Integer id = (Integer) s.save(k);
			s.getTransaction().commit();
			return id;
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	public static Integer updateKorisnik(Integer id, String ime, String prezime, String adresa, Date datumRodjenja, Date datumRegistracije){
		try{
			Session s = HibernateUtil.getSessionFactory().getCurrentSession();
			s.beginTransaction();
			Korisnik k = new Korisnik();
			k.setAdresa(adresa);
			k.setDatumRegistracije(datumRegistracije);
			k.setDatumRodjenja(datumRodjenja);
			k.setID(id);
			k.setIme(ime);
			k.setPrezime(prezime);
			s.update(k);
			s.getTransaction().commit();
			return id;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	public static void setDates(){
		try{
			Session s = HibernateUtil.getSessionFactory().getCurrentSession();
			s.beginTransaction();
			for (int i = 1; i <= 3; i++) {
				Let l = (Let) s.load(Let.class, ""+i);
				l.setVremePoletanja(new Date());
				l.setVremeSletanja(new Date());
				s.update(l);
			}
			s.getTransaction().commit();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	/*private String ime;
	private String prezime;
	private Integer id;
	private String adresa;
	private Date datumRodjenja;
	private Date datumRegistracije;
	private Set<Rezervacija> rezervacije = new HashSet<Rezervacija>(0);*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date datumRodjenja;
		try {
			datumRodjenja = sdf.parse("1992-01-01");
			createAndSaveKorisnik("Asd", "Asd", "Asd", datumRodjenja, new Date());
			
			//updateKorisnik(6, "Asd", "Asd", "", datumRodjenja, new Date());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		setDates();
		
		
	}
	
	

}
