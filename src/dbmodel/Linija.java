package dbmodel;

import java.util.HashSet;
import java.util.Set;

public class Linija {

	private Integer idLinije;
	private Integer duzinaPuta;
	private Aerodrom aerodromStart;
	private Aerodrom aerodromFinish;
	private Set<Let> letovi = new HashSet<Let>(0);
	
	
	public Linija(){
		
	}


	public Integer getIdLinije() {
		return idLinije;
	}


	public void setIdLinije(Integer idLinije) {
		this.idLinije = idLinije;
	}


	public Integer getDuzinaPuta() {
		return duzinaPuta;
	}


	public void setDuzinaPuta(Integer duzinaPuta) {
		this.duzinaPuta = duzinaPuta;
	}


	public Aerodrom getAerodromStart() {
		return aerodromStart;
	}


	public void setAerodromStart(Aerodrom aerodromStart) {
		this.aerodromStart = aerodromStart;
	}


	public Aerodrom getAerodromFinish() {
		return aerodromFinish;
	}


	public void setAerodromFinish(Aerodrom aerodromFinish) {
		this.aerodromFinish = aerodromFinish;
	}


	public Set<Let> getLetovi() {
		return letovi;
	}


	public void setLetovi(Set<Let> letovi) {
		this.letovi = letovi;
	}
	
}