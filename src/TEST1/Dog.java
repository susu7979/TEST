package TEST1;

public class Dog {
	private String name;
	private String host;
	private String species;

	public Dog(String name, String host, String species) {
		this.name = name;
		this.host = host;
		this.species = species;
	}

	public class host {
		private String hostName;
		private int age;
		private boolean isFemale;

		public host(String hostName, int age, boolean isFemale) {
			this.hostName = hostName;
			this.age = age;
			this.isFemale = isFemale;
		}
	}

	public void lick() {
		System.out.println(this.host + "is be licked to dead.");
	}

	public String getHost() {
		return this.host;
	}

	public void newHost(String newHost) {
		this.host = newHost;
	}
}
