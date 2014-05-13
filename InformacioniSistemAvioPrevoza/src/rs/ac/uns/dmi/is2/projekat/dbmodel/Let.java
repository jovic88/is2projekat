package rs.ac.uns.dmi.is2.projekat.dbmodel;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Let {

	private String brojLeta;
	private Date datumLeta;
	private Integer cenaLeta;
	private Integer brojMesta;
	private String tipAviona;
	private Integer brojPrdatihKarata;
	private Set <Rezervacija> rezervacije = new HashSet<Rezervacija>(0);
	private Kompanija kompanija;
	private Linija linija;
	
	public Let(){
		
	}

	public Let(String brojLeta, Date datumLeta, Integer cenaLeta,
			Integer brojMesta, String tipAviona, Integer brojPrdatihKarata,
			Set<Rezervacija> rezervacije, Kompanija kompanija, Linija linija) {
		super();
		this.brojLeta = brojLeta;
		this.datumLeta = datumLeta;
		this.cenaLeta = cenaLeta;
		this.brojMesta = brojMesta;
		this.tipAviona = tipAviona;
		this.brojPrdatihKarata = brojPrdatihKarata;
		this.rezervacije = rezervacije;
		this.kompanija = kompanija;
		this.linija = linija;
	}

	public String getBrojLeta() {
		return brojLeta;
	}

	public void setBrojLeta(String brojLeta) {
		this.brojLeta = brojLeta;
	}

	public Date getDatumLeta() {
		return datumLeta;
	}

	public void setDatumLeta(Date datumLeta) {
		this.datumLeta = datumLeta;
	}

	public Integer getCenaLeta() {
		return cenaLeta;
	}

	public void setCenaLeta(Integer cenaLeta) {
		this.cenaLeta = cenaLeta;
	}

	public Integer getBrojMesta() {
		return brojMesta;
	}

	public void setBrojMesta(Integer brojMesta) {
		this.brojMesta = brojMesta;
	}

	public String getTipAviona() {
		return tipAviona;
	}

	public void setTipAviona(String tipAviona) {
		this.tipAviona = tipAviona;
	}

	public Integer getBrojPrdatihKarata() {
		return brojPrdatihKarata;
	}

	public void setBrojPrdatihKarata(Integer brojPrdatihKarata) {
		this.brojPrdatihKarata = brojPrdatihKarata;
	}

	public Set<Rezervacija> getRezervacije() {
		return rezervacije;
	}

	public void setRezervacije(Set<Rezervacija> rezervacije) {
		this.rezervacije = rezervacije;
	}

	public Kompanija getKompanija() {
		return kompanija;
	}

	public void setKompanija(Kompanija kompanija) {
		this.kompanija = kompanija;
	}

	public Linija getLinija() {
		return linija;
	}

	public void setLinija(Linija linija) {
		this.linija = linija;
	}
	
}
