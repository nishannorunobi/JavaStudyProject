package overloading.overridding;

public class Mars extends Planet{
	// example of method overload
	// method overloading is called static polymorphism
	public Mars() {
		// example of method overload
		setName("Mars");
		setRadious("3390 km");
		setVolume("6.3E24 kg");
	}
	public Mars(String name) {
		// example of method overload
		setName(name);
		setRadious("3390 km");
		setVolume("6.3E24 kg");
	}
	String getFeature(int key){
		// example of method overload
		String feature = null;
		switch (key) {
		case 1:
			feature = name;
			break;
		case 2:
			feature = radious;
			break;
		case 3:
			feature = volume;
			break;
		default:
			break;
		}
		return feature;
	}

	String getFeature(String key){
		// example of method overload
		String feature = null;
		switch (key) {
		case "name":
			feature = name;
			break;
		case "radious":
			feature = radious;
			break;
		case "volume":
			feature = volume;
			break;
		default:
			break;
		}
		return feature;
	}

	/*void getFeature(String key){

		// overloading can not be taken place with the different return type of a method

	}*/

}
