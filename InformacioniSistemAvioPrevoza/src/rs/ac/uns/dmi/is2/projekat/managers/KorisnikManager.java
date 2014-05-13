package rs.ac.uns.dmi.is2.projekat.managers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import rs.ac.uns.dmi.is2.projekat.managers.HibernateUtil;
import rs.ac.uns.dmi.is2.projekat.dbmodel.Korisnik;
import rs.ac.uns.dmi.is2.projekat.dbmodel.Rezervacija;

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
	/*private String ime;
	private String prezime;
	private Integer id;
	private String adresa;
	private Date datumRodjenja;
	private Date datumRegistracije;
	private Set<Rezervacija> rezervacije = new HashSet<Rezervacija>(0);*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date datumRodjenja;
		try {
			datumRodjenja = sdf.parse("1992-08-08");
			//createAndSaveKorisnik("Milan", "Jovic", "Milana Stanivukovica 47/20", datumRodjenja, new Date());
			
			updateKorisnik(6, "Milance", "Cigance", "Milana Stanivukovica 47/20", datumRodjenja, new Date());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
