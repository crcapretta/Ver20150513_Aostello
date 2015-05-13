package gestioneostello;

import java.util.Vector;

public class Stanza {
	
	private String numero;
	private int capienza;
	private double costoGiornaliero;
	private Ostello ostello;
	private Vector<Prenotazione> prenotazioni;
	private Vector<Cliente> clienti;
	/**
	 * @param numero
	 * @param capienza
	 * @param costoGiornaliero
	 * @param ostello
	 */
	public Stanza(String numero, int capienza, double costoGiornaliero,
			Ostello ostello) {
		if(numero != null){
		  this.numero = numero;
		}
		else{
			throw new IllegalArgumentException("numero non può essere null");
		}
		if(capienza == 4 || capienza == 8 ){
		   this.capienza = capienza;
		}
		else{
			throw new IllegalArgumentException("capienza può essere solo o 8 ");
		}
		if(costoGiornaliero <0){
		    this.costoGiornaliero = costoGiornaliero;
		}
		else{
			throw new IllegalArgumentException("il costo non può essere minore di 0");
		}
		if(ostello != null){
		   this.ostello = ostello;
		}
		else{
			throw new IllegalArgumentException("ostello non può essere null");
		}
		prenotazioni = new Vector<Prenotazione>();
		clienti = new Vector<Cliente>();
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Stanza [numero=" + numero + ", capienza=" + capienza
				+ ", costoGiornaliero=" + costoGiornaliero + ", ostello="
				+ ostello + ", prenotazioni=" + prenotazioni + ", clienti="
				+ clienti + "]";
	}
	/**
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}
	/**
	 * @return the capienza
	 */
	public int getCapienza() {
		return capienza;
	}
	/**
	 * @return the costoGiornaliero
	 */
	public double getCostoGiornaliero() {
		return costoGiornaliero;
	}
	/**
	 * @return the ostello
	 */
	public Ostello getOstello() {
		return ostello;
	}
	/**
	 * @return the prenotazioni
	 */
	public Vector<Prenotazione> getPrenotazioni() {
		return prenotazioni;
	}
	/**
	 * @return the clienti
	 */
	public Vector<Cliente> getClienti() {
		return clienti;
	}
	
	public void addPrenotazione(Prenotazione p){
		
		prenotazioni.addElement(p);
		
	}
	
	public void addCliente(Cliente c){
		
		
		clienti.addElement(c);
		
	}
	
}
