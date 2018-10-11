
public class Etudiant {
	private char cne;
	private char nom;
	private char prenom;
	
	public char getCne() {
		return cne;
	}
	public void setCne(char cne) {
		this.cne = cne;
	}
	public char getNom() {
		return nom;
	}
	public void setNom(char nom) {
		this.nom = nom;
	}
	public char getPrenom() {
		return prenom;
	}
	public void setPrenom(char prenom) {
		this.prenom = prenom;
	}
	public Etudiant(char cne, char nom, char prenom) {
		super();
		this.cne = cne;
		this.nom = nom;
		this.prenom = prenom;
	}
	@Override
	public String toString() {
		return "Etudiant [cne=" + cne + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
	public static void main(){
		System.out.println("test 1");
	}
}
