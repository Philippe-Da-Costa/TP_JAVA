package fClassesEtObjets;

public class Planete {
	
	//proprietes,attributs ou varibles d'instance...
	//objet est un exemplaire ,instance de la classe
	
	String nom;
	String matiere;
	long diametre;
	
    public  void revolution(){
   	 
   	 System.out.println("Je suis la planète "+ nom +"  et je tourne autour de mon étoile.");
      
  }
	
	   public  void rotation(){
           System.out.println("Je suis la planète "+nom+" et je tourne sur moi-même. ");
       }
       
    

}
