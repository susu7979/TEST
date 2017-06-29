package TEST1;

public class People {
	private int age;
	private String name;
	private boolean isPretty;

	public People(int test, String name, boolean isPretty) {
		this.age = test;
		this.name = name;
		this.isPretty = isPretty;
	}

	public People(int test, String name) {
		this.age = test;
		this.name = name;
		this.isPretty = true;
	}

	public void sayHello() {
		System.out.println("Hi!");
	}

	int getAge() {
		return this.age;
	}

	public void setAge(int newAge) {
		this.age = newAge;
	}
	
	public boolean getIsPretty(){
		return this.isPretty;
	}
}
