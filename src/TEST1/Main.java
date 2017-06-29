package TEST1;

public class Main {

	public static void main(String[] args) {
//		People Susu = new People(16, "Susu", true);
//		System.out.println(Susu.getAge());
//		Susu.sayHello();
//		People Susu3 = new People(15, "Susu");
//		System.out.println(Susu.getIsPretty());
//		Susu.setAge(12);
//		System.out.println(Susu.getAge());
		
		Dog doggy = new Dog("®ã®ã");
		doggy.bark();
		Dog catty = new Dog("catty","Max","®ã®ã");
		catty.bark();
		System.out.println(doggy.getHost());
		doggy.newHost("Susu");
		System.out.println(doggy.getHost());
	}

}
