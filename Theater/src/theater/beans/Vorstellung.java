package theater.beans;

import java.sql.Time;
import java.sql.Date;

public class Vorstellung {

	public static final String ausverkauft_ja = "Ja";
	public static final String ausverkauft_nein = "Nein";
	
	private Date datum;
	private Time beginn;
	private String ausverkauft;
	private String name;
	private int saal;
	
	
	public Vorstellung(Theaterstueck t, Saal s) {
		name = t.getName();
		saal = s.getSaalNr();
	}
	
	
	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

	public Time getBeginn() {
		return beginn;
	}

	public void setBeginn(Time beginn) {
		this.beginn = beginn;
	}

	public String getAusverkauft() {
		return ausverkauft;
	}

	public void setAusverkauft(String ausverkauft) {
		this.ausverkauft = ausverkauft;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSaal() {
		return saal;
	}

	public void setSaal(int saal) {
		this.saal = saal;
	}
	
	
	
}
