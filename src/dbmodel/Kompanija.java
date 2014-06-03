package dbmodel;

import java.util.HashSet;
import java.util.Set;

public class Kompanija {

	private Integer id;
	private String naziv;
	private String godinaOsnivanja;
	private Set <Let> letovi = new HashSet<Let>(0);

	
	public Kompanija(){
		
	}

	public Kompanija(Integer id, String naziv, String godinaOsnivanja, Set<Let> letovi) {
		super();
		this.id = id;
		this.naziv = naziv;
		this.godinaOsnivanja = godinaOsnivanja;
		this.letovi = letovi;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getGodinaOsnivanja() {
		return godinaOsnivanja;
	}

	public void setGodinaOsnivanja(String godinaOsnivanja) {
		this.godinaOsnivanja = godinaOsnivanja;
	}
	
	public Set<Let> getLetovi() {
		return letovi;
	}

	public void setLetovi(Set<Let> letovi) {
		this.letovi = letovi;
	}

}
