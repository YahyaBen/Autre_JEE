package scolarite;

import java.io.Serializable;

public class Etudiant implements Serializable { // Permet Stocke ou echanger les donnees
	
	/**
	 * 
	 */
 
	private int Code ;
	private  float Note;
	private String Matiere;
	
	public Etudiant(int C, float N, String M) { 
		Code = C;
		Note = N;
		Matiere = M;
	}
	public Etudiant() {

	}
	
	@Override
	public String toString() {
		return "Etudiant [Code=" + Code + ", Note=" + Note + ", Matiere=" + Matiere + "]";
	}
	public int getCode() {
		return Code;
	}
	public void setCode(int code) {
		Code = code;
	}
	public float getNote() {
		return Note;
	}
	public void setNote(float note) {
		Note = note;
	}
	public String getMatiere() {
		return Matiere;
	}
	public void setMatiere(String matiere) {
		Matiere = matiere;
	}	
}
