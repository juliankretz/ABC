import java.util.Scanner;

public class Moyenne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// traduction du pseudo code en code Java
		
		//declaration des variables
		
		//Réel nombre1
		float nombre1;
		//Réel nombre2
		float nombre2;
		//Réel moyenne
		float moyenne;
		
		//saisies
		
		//ecrire "Donner moi svp le premier nombre:"
		System.out.println("Donner moi svp le premier nombre:");
		//lire 
		Scanner sc = new Scanner(System.in);
		nombre1 = sc.nextFloat();
		System.out.println("Vous avez saisie nombre 1 = "+nombre1);
	
		//ecrire "Donner moi svp le deuxième nombre:"
		System.out.println("Donner moi svp le deuxième nombre:");
		//lire 
		nombre2 = sc.nextFloat();
		System.out.println("Vous avez saisie nombre 2 = "+nombre2);
		
		//traitement
		
		moyenne =(nombre1+nombre2)/2;
		
		//affichage
		
		//ecrire "La valeur de la moyenne est : ",moyenne
		System.out.println("La valeur de la moyenne est : "+moyenne);
		
	}

}
