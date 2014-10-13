package overloading.overridding;

public class Planet {
	String name;
	String radious;
	protected String volume;
	public Planet() {
		
	}
	
	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}
	
	String getRadious() {
		return radious;
	}
	
	void setRadious(String radious) {
		this.radious = radious;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}
}
