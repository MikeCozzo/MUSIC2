
public class ProblemSet1 {
	
	public static void main(String[] args) {
		MusicalInstrument Value = new MusicalInstrument();
		String firstname = Value.getName();
		String firsttype = Value.getType();
		System.out.println(firsttype);
		System.out.println(firstname);
		int firstkeyorstring = Value.getNumberofKeysorStrings();
		System.out.println(firstkeyorstring);
		Value.setName("Guitar");
		String name = Value.getName();
		System.out.println(name);
		Value.setType("String");
		String type = Value.getType();
		System.out.println(type);
		Value.setnumberOfKeysorStrings(6);
		int NumberOfKeysorStrings = Value.getNumberofKeysorStrings();
		System.out.println(NumberOfKeysorStrings);
		
		MusicalInstrument Next = new MusicalInstrument();
		Next.setType("WoodWind, String, Bass, Keyboard, Percussion");
		String nameN = Next.getType();
		System.out.println(nameN);


	}

}
