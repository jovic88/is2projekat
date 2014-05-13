package rs.ac.uns.dmi.is2.projekat.dbmodel;

import java.sql.Time;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Linija {

	private Integer idLinije;
	private Date vremePoletanja;
	private String terminal;
	private Integer duzinaPuta;
	private Time vremePutovanja;
	private Aerodrom aerodrom;
	private Set<VremeSletanja> vremenaSletanja = new HashSet<VremeSletanja>(0);
	private Set<Let> letovi = new HashSet<Let>(0);
	
	public Linija(){
		
	}

	public Linija(Date vremePoletanja, Date vremeSletanja, String terminal,
			Integer duzinaPuta, Time vremePutovanja, Aerodrom aerodrom,
			Set<VremeSletanja> vremenaSletanja, Set<Let> letovi) {
		super();
		this.vremePoletanja = vremePoletanja;
		this.terminal = terminal;
		this.duzinaPuta = duzinaPuta;
		this.vremePutovanja = vremePutovanja;
		this.aerodrom = aerodrom;
		this.vremenaSletanja = vremenaSletanja;
		this.letovi = letovi;
	}

	public Date getVremePoletanja() {
		return vremePoletanja;
	}

	public void setVremePoletanja(Date vremePoletanja) {
		this.vremePoletanja = vremePoletanja;
	}

	public String getTerminal() {
		return terminal;
	}

	public void setTerminal(String terminal) {
		this.terminal = terminal;
	}

	public Integer getDuzinaPuta() {
		return duzinaPuta;
	}

	public void setDuzinaPuta(Integer duzinaPuta) {
		this.duzinaPuta = duzinaPuta;
	}

	public Time getVremePutovanja() {
		return vremePutovanja;
	}

	public void setVremePutovanja(Time vremePutovanja) {
		this.vremePutovanja = vremePutovanja;
	}

	public Aerodrom getAerodrom() {
		return aerodrom;
	}

	public void setAerodrom(Aerodrom aerodrom) {
		this.aerodrom = aerodrom;
	}

	public Set<VremeSletanja> getVremenaSletanja() {
		return vremenaSletanja;
	}

	public void setVremenaSletanja(Set<VremeSletanja> vremenaSletanja) {
		this.vremenaSletanja = vremenaSletanja;
	}
	
	public Set<Let> getLetovi(){
		return letovi;
	}
	
	public void setLetovi(Set<Let> letovi){
		this.letovi = letovi;
	}
}
