
public class MusicalInstrument {
	private String name;
	private String type;
	private int numberOfKeysorStrings;
	
	final String UNKNOWNNAME = "UNKNOWNNAME";
	final String UNKNOWNTYPE = "UNKNOWNTYPE";
	final int UNKNOWNKEYSORSTRINGS = -1;
	
	public String getType() {
		return type;
	}
	public String getName() {
		return name;
	}
	public int getNumberofKeysorStrings() {
		return numberOfKeysorStrings;
	}
	public void setName(String name) {
	if (name.equals(null))
		this.name = UNKNOWNNAME;
	else if (name.equals(""))
		this.name = UNKNOWNNAME;
	else {
		this.name = name;
	}}
	
	public void setType(String type) {
	if (type.equals("Bass"))
		this.type = type;
	else if (type.equals("Woodwind")) {
		this.type = type;
	}else if (type.equals("String")) {
		this.type = type;
	}else if (type.equals("Percussion")) {
		this.type = type;
	}else if (type.equals("keyboard")) {
		this.type = type;
	}else {
		this.type = "UNKNOWNTYPE";
	}}
	public void setnumberOfKeysorStrings(int number) {
		if (number > 100)
			this.numberOfKeysorStrings = UNKNOWNKEYSORSTRINGS;
		else if (number < 0)
			this.numberOfKeysorStrings = UNKNOWNKEYSORSTRINGS;
		else {
			this.numberOfKeysorStrings = number;
		}
			
	}
	//public void setType(String type) {
	//	 this.type = type;
	//}
//	public void setNumberOfKeysorStrings(int numberOfKeysorStrings) {
	//	this.numberOfKeysorStrings = numberOfKeysorStrings;
	//}
	public MusicalInstrument() {
		getName();
		getType();
		getNumberofKeysorStrings();
		setType(UNKNOWNTYPE);
		setName(UNKNOWNNAME);
		setnumberOfKeysorStrings(101);
	}
	public MusicalInstrument(String name, String type, int numberOfKeysorStrings) {
		this.type = type;
		this.name = name;
		this.numberOfKeysorStrings = numberOfKeysorStrings;
	}
	//public String getName() {
	//	return name;
	//}
	//public void setName(String name) {
	//	this.name = name;
	//}
	//public String getType() {
	//	return "nfakn";
	//}
	//public void setType(String type) {
	//	this.type = type;
	//}
	//public int getNumberOfKeysorStrings() 
	//{
	//	return numberOfKeysorStrings;
	//}
//	public void setNumberOfKeysorStrings(int numberOfKeysorStrings) {
		//this.numberOfKeysorStrings = numberOfKeysorStrings;
//		MusicalInstrument myObj = new MusicalInstrument();
	}
