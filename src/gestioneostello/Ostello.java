package gestioneostello;

import java.util.Vector;

public class Ostello {
	
	private String nome;
	private Vector<Stanza> stanze;
	private Vector<Prenotazione> prenotazioni;
	/**
	 * @param nome
	 */
	public Ostello(String nome) {
		if(nome != null){
				this.nome = nome;
		}
		else{
			throw new IllegalArgumentException("nome non può essere null");
		}
		stanze = new Vector<Stanza>();
		prenotazioni = new Vector<Prenotazione>();
		
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Ostello [nome=" + nome + ", stanze=" + stanze
				+ ", prenotazioni=" + prenotazioni + "]";
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @return the stanze
	 */
	public Vector<Stanza> getStanze() {
		return stanze;
	}
	/**
	 * @return the prenotazioni
	 */
	public Vector<Prenotazione> getPrenotazioni() {
		return prenotazioni;
	}
	
	public void addStanza(Stanza s){
		
		stanze.addElement(s);
		
		
	}
	
	
	public void addPrenotazione(Prenotazione p){
		
		prenotazioni.addElement(p);
		
		
	}
	
	

}
