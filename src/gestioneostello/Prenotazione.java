package gestioneostello;

import java.time.*;

public class Prenotazione {
	
	private LocalDateTime arrivo;
	private LocalDateTime partenza;
	private Ostello ostello;
	private Stanza stanza;
	private Cliente cliente;
	/**
	 * @param arrivo
	 * @param partenza
	 * @param ostello
	 * @param stanza
	 * @param cliente
	 */
	public Prenotazione(LocalDateTime arrivo, LocalDateTime partenza,
			Ostello ostello, Stanza stanza, Cliente cliente) {
		if(arrivo != null){
		   this.arrivo = arrivo;
		}
		else{
			throw new IllegalArgumentException("arrivo non può essere null");
		}
		if(partenza != null){
		   this.partenza = partenza;
		}
		else{
			throw new IllegalArgumentException("partenza non può essere null");
		}
		if(ostello != null){
		   this.ostello = ostello;
		}
		else{
			throw new IllegalArgumentException("ostello non può essere null");
		}
		if(stanza != null){
		   this.stanza = stanza;
		}
		else{
			throw new IllegalArgumentException("stanza non può essere null");
		}
		if(cliente != null){
		   this.cliente = cliente;
		}
		else{
			throw new IllegalArgumentException("cliente non può essere null");
		}
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Prenotazione [arrivo=" + arrivo + ", partenza=" + partenza
				+ ", ostello=" + ostello + ", stanza=" + stanza + ", cliente="
				+ cliente + "]";
	}
	/**
	 * @return the arrivo
	 */
	public LocalDateTime getArrivo() {
		return arrivo;
	}
	/**
	 * @return the partenza
	 */
	public LocalDateTime getPartenza() {
		return partenza;
	}
	/**
	 * @return the ostello
	 */
	public Ostello getOstello() {
		return ostello;
	}
	/**
	 * @return the stanza
	 */
	public Stanza getStanza() {
		return stanza;
	}
	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}
	
	public Period getNumeroGiorni(){ 
		Period numeroGiorni;
		return numeroGiorni=(Period) between(getArrivo(),getPartenza());
		
	
	}
	
	
	private Period between(LocalDateTime arrivo2, LocalDateTime partenza2) {
		// TODO Auto-generated method stub
		return null;
	}
}
		
		
	
	
	