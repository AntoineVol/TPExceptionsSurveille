package domaine;

/**
 * Classe des comptes
 * @author Adminl
 */
public class Compte {
	/**
	 * idCompte : Num�ro unique d'un compte
	 * solde : solde disponible du compte
	 */
	private int idCompte;
	private double solde;

	//BUIDLER
	public Compte(int idCompte, double solde) {
		super();
		this.idCompte = idCompte;
		this.solde = solde;
	}
	//G&S

	public int getIdCompte() {
		return idCompte;
	}

	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}
	/**
	 * Methode qui recup�re le solde du compte
	 * @return retourne le solde du compte
	 */
	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}
	
	//METHODE
	/**
	 * Methode de versement dans un compte
	 * @param Montant du versement
	 * @throws Erreur si le montant est n�gatif 
	 */
	public void verser (double mt) throws MontantNegatifException {
		if(mt<0) {throw new MontantNegatifException("Le montant vers� doit �tre positif");}
		
		this.solde =+ mt;
	}
	/**
	 * Methode pour retirer une somme d'un compte
	 * @param mt Montant du retrait
	 * @throws MontantNegatifException Erreur si le montant est n�gatif ou si il est superieur au solde
	 * @throws SoldeInsuffisantException Erreur
	 */
	public void retirer (double mt) throws MontantNegatifException, SoldeInsuffisantException {
		if(mt<0) {throw new MontantNegatifException("Le montant retir� doit �tre positif");}
		if (this.solde-mt<0) {throw new SoldeInsuffisantException("Le solde du compte est insuffisant pour retirer ce montant");}
		
		this.solde =- mt;
	}
}
