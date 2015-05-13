package gestioneostello;

import java.util.Vector;
import java.time.LocalDateTime;
import java.time.Period;

public class Cliente {
	
	private String nome;
	private String cognome;
	private String telefono;
	private Stanza stanza;
	private Vector<Prenotazione> prenotazioni;
	/**
	 * @param nome
	 * @param cognome
	 * @param telefono
	 */
	public Cliente(String nome, String cognome, String telefono) {
		if(nome != null){
		  this.nome = nome;
		}
		else{
			throw new IllegalArgumentException("nome non può essere null");
		}
		if(cognome != null){
		   this.cognome = cognome;
		}
		else{
			throw new IllegalArgumentException("cognome non può essere null");
		}
		if(telefono != null){
		   this.telefono = telefono;
		}
		else{
			throw new IllegalArgumentException("telefono non può essere null");
		}
		prenotazioni = new Vector<Prenotazione>();
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cognome=" + cognome + ", telefono="
				+ telefono + ", stanza=" + stanza + ", prenotazioni="
				+ prenotazioni + "]";
	}
	/**
	 * @return the stanza
	 */
	public Stanza getStanza() {
		return stanza;
	}
	/**
	 * @param stanza the stanza to set
	 */
	public void setStanza(Stanza stanza) {
		if(stanza != null){
		  this.stanza = stanza;
	}
	else{
		throw new IllegalArgumentException("numero non può esere null");
	}
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @return the cognome
	 */
	public String getCognome() {
		return cognome;
	}
	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}
	/**
	 * @return the prenotazioni
	 */
	public Vector<Prenotazione> getPrenotazioni() {
		return prenotazioni;
	}
	
	public void addPrenotazione(Prenotazione p){
		
		prenotazioni.addElement(p);
		
		
	}
	
	public Period getNumeroGiorni(){
		
        
		
		for(Prenotazione p: prenotazioni){
			Period numeroGiorni;
			
		 numeroGiorni=(Period) between(p.getArrivo(),p.getPartenza());
			
		}
		return numeroGiorni;
		
		
		
		
	}
	private Object between(LocalDateTime arrivo, LocalDateTime partenza) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
