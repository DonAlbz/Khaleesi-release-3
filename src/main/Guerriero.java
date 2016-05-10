package main;

import java.awt.Point;

import inputDati.InputDati;

public class Guerriero {
	private String nome;
	private Point posizione;
	private int puntiVita;
	private int puntiEsperienza;
	private int monete;
	private Arma arma;
	
	public Guerriero(){
		this.nome=richiestaNome();
		puntiVita=Parametri.PUNTI_VITA_INIZIALI;
		puntiEsperienza=Parametri.PUNTI_ESPERIENZA_INIZIALI;
		posizione=new Point(0,0);
	}
	
	/**
	 * @return
	 */
	public Point getPosizione(){
		return posizione;
	}
	
	private String richiestaNome() {
		return Visualizzatore.richiestaNomeGuerriero();
	}
	
	public void impugna(Arma arma){
		assert this.arma == null;
		this.arma=arma;
	}

	/**
	 * @return the arma
	 */
	public Arma getArma() {
		return arma;
	}
	
	/**
	 * @param monete the monete to set
	 */
	public void setMonete(int monete) {
		this.monete = monete;
	}

	/**
	 * @return the puntiVita
	 */
	public int getPuntiVita() {
		return puntiVita;
	}
	
	public void setPuntiVita(int nuoviPuntiVita) {
		puntiVita=nuoviPuntiVita;
	}
	
	public void subisciDanni(int danni){
		puntiVita-=danni;
	}
	
	/**Applica i danni subiti in combattimento alla vita del guerriero
	 * 
	 */
	public void combatti(){
		subisciDanni(danniSubiti());
	}
	
	/**
	 * @return i danni che subirebbe in combattimento
	 */
	public int danniSubiti(){
		if (arma!=null){
			return arma.getDanno();
		}
		else
			return Parametri.DANNO_MANI_NUDE;
	}
	
	/**Cura il guerriero
	 * @param cura
	 */
	public void riceviCura(int cura){
		puntiVita+=cura;
	}
	
	/**
	 * @return the puntiEsperienza
	 */
	public int getPuntiEsperienza() {
		return puntiEsperienza;
	}

	public void dropArma() {
		this.arma=null;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	
	public Boolean isVivo(){
		return puntiVita>0;
	}
	
	public void aumentaExp(int exp){
		puntiEsperienza+=exp;
	}
}
