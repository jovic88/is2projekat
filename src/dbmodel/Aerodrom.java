package dbmodel;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Aerodrom {

	private Integer idAerodroma;
	private String naziv;
	private String grad;
	private String drzava;
	private Integer brojPista;
	private Integer brojTerminala;
	private Set<Linija> linije = new HashSet<Linija>(0);
	
	public Aerodrom(){
		
	}

	public Aerodrom(Integer idAerodroma, String naziv, String grad,
			String drzava, Integer brojPista, Integer brojTerminala,
			 Set<Linija> linije) {
		super();
		this.idAerodroma = idAerodroma;
		this.naziv = naziv;
		this.grad = grad;
		this.drzava = drzava;
		this.brojPista = brojPista;
		this.brojTerminala = brojTerminala;
		this.linije = linije;
	}

	public Integer getIdAerodroma() {
		return idAerodroma;
	}

	public void setIdAerodroma(Integer idAerodroma) {
		this.idAerodroma = idAerodroma;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getGrad() {
		return grad;
	}

	public void setGrad(String grad) {
		this.grad = grad;
	}

	public String getDrzava() {
		return drzava;
	}

	public void setDrzava(String drzava) {
		this.drzava = drzava;
	}

	public Integer getBrojPista() {
		return brojPista;
	}

	public void setBrojPista(Integer brojPista) {
		this.brojPista = brojPista;
	}

	public Integer getBrojTerminala() {
		return brojTerminala;
	}

	public void setBrojTerminala(Integer brojTerminala) {
		this.brojTerminala = brojTerminala;
	}

	public Set<Linija> getLinije() {
		return linije;
	}

	public void setLinije(Set<Linija> linije) {
		this.linije = linije;
	}
	
	
}
