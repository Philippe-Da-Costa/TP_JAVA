package StructuresConditionnelles;

public class StructureConditionelleIf {

	public static void main(String[] args) {
	int age = 51;
	int ageDuCapitaine=30;
	
	System.out.printf("Mon age est : %d",age);
	
	if(age>30) {
		System.out.println();
	System.out.println(" Je fais plus jeune");
	}
	if (ageDuCapitaine<age)
	{
		System.out.printf("le capitaine a %d ans , il est plus jeune que moi .",ageDuCapitaine);
	}

	}

}
