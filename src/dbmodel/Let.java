package dbmodel;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Let {

	private String brojLeta;
	
	private Date vremePoletanja;
	private Date vremeSletanja;
	private String terminal;
	private Integer cenaLeta;
	private Integer brojMesta;
	private String tipAviona;
	private Integer brojProdatihKarata;
	private Set <Rezervacija> rezervacije = new HashSet<Rezervacija>(0);
	private Kompanija kompanija;
	private Linija linija;
	
	public Let(){
		
	}

	public Let(String brojLeta, Date vremePoletanja, Date vremeSletanja,
			String terminal, Integer cenaLeta, Integer brojMesta,
			String tipAviona, Integer brojProdatihKarata,
			Set<Rezervacija> rezervacije, Kompanija kompanija, Linija linija) {
		super();
		this.brojLeta = brojLeta;
		this.vremePoletanja = vremePoletanja;
		this.vremeSletanja = vremeSletanja;
		this.terminal = terminal;
		this.cenaLeta = cenaLeta;
		this.brojMesta = brojMesta;
		this.tipAviona = tipAviona;
		this.brojProdatihKarata = brojProdatihKarata;
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

	public Date getVremePoletanja() {
		return vremePoletanja;
	}

	public void setVremePoletanja(Date vremePoletanja) {
		this.vremePoletanja = vremePoletanja;
	}

	public Date getVremeSletanja() {
		return vremeSletanja;
	}

	public void setVremeSletanja(Date vremeSletanja) {
		this.vremeSletanja = vremeSletanja;
	}

	public String getTerminal() {
		return terminal;
	}

	public void setTerminal(String terminal) {
		this.terminal = terminal;
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

	public Integer getBrojProdatihKarata() {
		return brojProdatihKarata;
	}

	public void setBrojProdatihKarata(Integer brojProdatihKarata) {
		this.brojProdatihKarata = brojProdatihKarata;
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
