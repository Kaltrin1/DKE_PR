package theater.beans;

public class Sitzplatz {
	
	private int reiheNr;
	private int sitzNr;
	private int saalNr;
	private int preisklasse;
	
	public Sitzplatz(Saal s, Preisklasse p){
		this.saalNr = s.getSaalNr();
		this.preisklasse = p.getkennziffer();
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

	public int getPreisklasse() {
		return preisklasse;
	}

	public void setPreisklasse(int preisklasse) {
		this.preisklasse = preisklasse;
	}
	
	
}
