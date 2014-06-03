package dbmodel;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Korisnik implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String ime;
	private String prezime;
	private Integer id;
	private String email;
	private String password;
	private String adresa;
	private Date datumRodjenja;
	private Date datumRegistracije;
	private Set<Rezervacija> rezervacije = new HashSet<Rezervacija>(0);

	public Korisnik(){
		
	}
	
	
	
	public Korisnik(String ime, String prezime, Integer id, String adresa,
			Date datumRodjenja, Date datumRegistracije,
			Set<Rezervacija> rezervacije) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.id = id;
		this.adresa = adresa;
		this.datumRodjenja = datumRodjenja;
		this.datumRegistracije = datumRegistracije;
		this.rezervacije = rezervacije;
	}



	public Korisnik(String ime, String prezime, Integer id, String email,
			String password, String adresa, Date datumRodjenja,
			Date datumRegistracije, Set<Rezervacija> rezervacije) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.id = id;
		this.email = email;
		this.password = password;
		this.adresa = adresa;
		this.datumRodjenja = datumRodjenja;
		this.datumRegistracije = datumRegistracije;
		this.rezervacije = rezervacije;
	}



	public String getIme() {
		return ime;
	}
	
	public void setIme(String ime) {
		this.ime = ime;
	}
	
	public String getPrezime() {
		return prezime;
	}
	
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	
	public Integer getID() {
		return id;
	}
	
	public void setID(Integer id) {
		this.id = id;
	}
	
	public String getAdresa() {
		return adresa;
	}
	
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	
	public Date getDatumRodjenja() {
		return datumRodjenja;
	}
	
	public void setDatumRodjenja(Date datumRodjenja) {
		this.datumRodjenja = datumRodjenja;
	}
	
	public Date getDatumRegistracije() {
		return datumRegistracije;
	}
	
	public void setDatumRegistracije(Date datumRegistracije) {
		this.datumRegistracije = datumRegistracije;
	}
	
	public Set<Rezervacija> getRezervacije() {
		return rezervacije;
	}
	
	public void setRezervacije(Set<Rezervacija> rezervacije) {
		this.rezervacije = rezervacije;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	public Integer getId() {
		return id;
	}
	
}
