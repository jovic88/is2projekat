package rs.ac.uns.dmi.is2.projekat.dbmodel;

import java.util.Date;

public class Rezervacija {

	private Integer id;
	private Korisnik korsnik;
	private Let let;
	private Date datumRezervacije;
	private Integer brojKarata;
	
	public Rezervacija(){
		
	}
	
	public Rezervacija(Integer id, Korisnik korsnik, Let let,
			Date datumRezervacije, Integer brojKarata) {
		super();
		this.id = id;
		this.korsnik = korsnik;
		this.let = let;
		this.datumRezervacije = datumRezervacije;
		this.brojKarata = brojKarata;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Korisnik getKorsnik() {
		return korsnik;
	}

	public void setKorsnik(Korisnik korsnik) {
		this.korsnik = korsnik;
	}

	public Let getLet() {
		return let;
	}

	public void setLet(Let let) {
		this.let = let;
	}

	public Date getDatumRezervacije() {
		return datumRezervacije;
	}

	public void setDatumRezervacije(Date datumRezervacije) {
		this.datumRezervacije = datumRezervacije;
	}

	public Integer getBrojKarata() {
		return brojKarata;
	}

	public void setBrojKarata(Integer brojKarata) {
		this.brojKarata = brojKarata;
	}
	
	
}
