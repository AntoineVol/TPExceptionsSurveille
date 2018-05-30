package presentation;

import java.util.InputMismatchException;
import java.util.Scanner;

import domaine.Compte;
import domaine.MontantNegatifException;
import domaine.SoldeInsuffisantException;
/**
 * Classe principale
 * @author Adminl
 * @version 1.0
 */
public class Lanceur {

	/**
	 * Methode main
	 * @param Paramètre principale
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double mt=0;
		Compte c = new Compte(1,500);
		try {
			System.out.println("Nouveau solde : " + c.getSolde());
			
			System.out.println("Somme à verser :");
			mt = sc.nextDouble();
			c.verser(mt);;
			System.out.println("Nouveau solde : " + c.getSolde());
			
			System.out.println("Somme à retirer :");
			mt = sc.nextDouble();
			c.retirer(mt);;
			System.out.println("Nouveau solde : " + c.getSolde());
		} catch (InputMismatchException e) {
			System.out.println("Montant incorrect, veuiller renseigner un entier positif");
		} catch(MontantNegatifException e) {
			System.out.println(e.getMessage()); 
		}catch(SoldeInsuffisantException e) {
			System.out.println(e.getMessage()); 
		}finally {
		System.out.println("Nouveau solde : " + c.getSolde());
		sc.close();
		}
	}
}
  