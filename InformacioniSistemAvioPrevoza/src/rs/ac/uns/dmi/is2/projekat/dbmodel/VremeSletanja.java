package rs.ac.uns.dmi.is2.projekat.dbmodel;

import java.util.Date;

public class VremeSletanja {

	private Date vreme;
	private Aerodrom aerodrom;
	private Linija linija;
	
	public VremeSletanja(){
		
	}
	
	public VremeSletanja(Date vreme, Aerodrom aerodrom, Linija linija) {
		super();
		this.vreme = vreme;
		this.aerodrom = aerodrom;
		this.linija = linija;
	}

	public Date getVreme() {
		return vreme;
	}

	public void setVreme(Date vreme) {
		this.vreme = vreme;
	}

	public Aerodrom getAerodrom() {
		return aerodrom;
	}

	public void setAerodrom(Aerodrom aerodrom) {
		this.aerodrom = aerodrom;
	}

	public Linija getLinija() {
		return linija;
	}

	public void setLinija(Linija linija) {
		this.linija = linija;
	}
	
	
}
