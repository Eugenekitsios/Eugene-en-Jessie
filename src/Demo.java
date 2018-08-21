
public class Demo {

	public static void main(String[] args) {
		
		Leraar Felix = new Leraar(); 
		Felix.leefijd = 37; 
		Felix.vakgebied = "Java"; 
		Felix.naam = "Felix"; 
		
		
		School ITPH = new School(); 
		ITPH.leraar = Felix; 
		ITPH.leerlingen = 16;
		ITPH.Lesgeven(Felix); 
		 
		
		
		
	}
}


class School{
	Leraar leraar;
	int leerlingen; 
	
	void Lesgeven(Leraar leraar) {
		System.out.println(leraar.naam + " geeft nu les in " + leraar.vakgebied + " aan " + leerlingen + " leerlingen.");
	}
	
}

class Leraar{
	int leefijd; 
	String vakgebied; 
	String naam; 
	
}

