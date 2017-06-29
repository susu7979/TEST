package TEST2;

import TEST1.People;

public class Main {

	public static void main(String[] args) {
		People Susu = new People(16, "Susu", true);
		System.out.println(Susu.getAge());
		Susu.sayHello();
		People Susu3 = new People(15, "Susu");
		System.out.println(Susu.getIsPretty());
		Susu.setAge(12);
		System.out.println(Susu.getAge());
		
	}

}
