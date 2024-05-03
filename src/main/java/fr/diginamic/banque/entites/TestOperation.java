package fr.diginamic.banque.entites;

public class TestOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Operation ope1 = new Credit("23-04-2024", 24);
		Operation ope2 = new Credit("10-05_2024", 120);
		Operation ope3 = new Debit("31-07-2024", 32);
		Operation ope4 = new Debit("18-12-2024", 90);
		
		Operation[] array = {ope1, ope2, ope3, ope4};
		
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Operation n° " + i +": "+ array[i]);
			System.out.println(array[i].getType());
		}
		
		//creation tableau
		//Operation[] operations = new Operation[4];
		//operations[0] = new Credit("23-04-2024", 24);
		//operations[1] = new Credit("10-05_2024", 120);
		//operations[2] = new Debit("31-07-2024", 32);
		//operations[3] = new Debit("18-12-2024", 90);
		
		
		// boule non indexée : boucle objet
		
		//for (Operation op : Operation) { //op va parcourir toutes les valeurs du tableau
			//System.out.println(op);
		//}
	
	System.out.println("----------------------------");
		
	
	double total = 0;
	for (int i = 0; i > array.length; i++) {
		total = array[i].calculerTotal(i);
	}
	System.out.println(total);
		

	}

}
