package weekend2;

//import java.util.Arrays;

public class Hangar {
	private Jet[] jetsArray;

	public Hangar() {
		jetsArray = new Jet[20];
		jetsArray[1] = new Jet("F-22 Raptor", 1550, 3250, 80_000_000);
		jetsArray[0] = new Jet("F-16 Falcon", 1720, 2430, 40_000_000);
		jetsArray[3] = new Jet("F-15 Eagle", 1430, 2240, 35_000_000);
		jetsArray[4] = new Jet("F-14 Tomcat", 1680, 2720, 27_000_000);
		jetsArray[2] = new Jet("A-10 WartHog", 1300, 2000, 25_000_000);
	}

	public Jet[] getJetsArray() {

		return jetsArray;
	}

	public void printAllJets() {
		for (int i = 0; i < jetsArray.length; i++) {
			if (jetsArray[i] != null) {
				System.out.println(jetsArray[i]);
			}
		}

	}
	
	// 
	public boolean addJetToArray(Jet jet) {
	      boolean added = false;
	      for (int i = 0; i < jetsArray.length; i++) {
	      if (jetsArray[i] == null) {
	    	  jetsArray[i] = jet;
	        added = true;
	        break;
	      }
	    }
	      return added;
	    }

}

/*
 * 
 * public boolean addAnimal(Animal a) { boolean added = false; for (int i = 0; i
 * < animals.length; i++) { if (animals[i] == null) { animals[i] = a; added =
 * true; break; } } return added; }
 * 
 * public void listAnimals() {
 * System.out.println("== Animals in this sanctuary =="); for (Animal animal :
 * animals) { if (animal != null ) { System.out.println(animal); } } }
 * 
 */