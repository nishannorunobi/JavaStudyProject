package overloading.overridding;

public class Earth extends Planet {
	
	
	public Earth() {
		setName("Earth");
		setRadious("6371 km");
		setVolume("5.6E24 kg");
	}

	@Override
	String getName() {
		// example of method override
		return "Planet"+": "+name;
	}

	/*protected String getName(){
	 //compile error, duplicate method getName
		return name;
	}*/

	protected String getRadious(){
		// example of method override
		return "The earth's Radious"+": "+radious;
	}

	/*protected String getVolume(){
		//Cannot reduce the visibility of the override method
		return "Planet Volume"+": "+volume;
	}*/
	
	
}
