package TEST1;

public class Dog {
	private String name;
	private String host;
	private String species;

	public Dog(String species) {
		this.name = "no";
		this.host = "no";
		this.species = species;
	}

	public Dog(String name, String host, String species) {
		this.name = name;
		this.host = host;
		this.species = species;
	}

	public void bark() {
		if (this.host == "no") {
			System.out.println("Hello!");
		} else {
			System.out.println("Hi " + this.host);
		}
	}
	
	public String getHost(){
		return this.host;
	}

	public void newHost(String newHost) {
		this.host = newHost;
	}
}
