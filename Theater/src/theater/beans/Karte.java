package theater.beans;

import java.sql.Date;
import java.sql.Time;

public class Karte {
	
	private int kNr;
	private Date ausstdatum;
	private int reiheNr;
	private int sitzNr;
	private int saalNr;
	private Date datum;
	private String name;
	
	
	public Karte(Vorstellung v, Sitzplatz s) {
		this.reiheNr = s.getReiheNr();
		this.sitzNr = s.getSitzNr();
		this.saalNr = s.getSaalNr();
		this.datum = v.getDatum();
		this.name = v.getName();
	}
	
	

	public int getkNr() {
		return kNr;
	}

	public void setkNr(int kNr) {
		this.kNr = kNr;
	}

	public Date getAusstdatum() {
		return ausstdatum;
	}

	public void setAusstdatum(Date ausstdatum) {
		this.ausstdatum = ausstdatum;
	}

	public int getReiheNr() {
		return reiheNr;
	}

	public void setReiheNr(int reiheNr) {
		this.reiheNr = reiheNr;
	}

	public int getSitzNr() {
		return sitzNr;
	}

	public void setSitzNr(int sitzNr) {
		this.sitzNr = sitzNr;
	}

	public int getSaalNr() {
		return saalNr;
	}

	public void setSaalNr(int saalNr) {
		this.saalNr = saalNr;
	}

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
