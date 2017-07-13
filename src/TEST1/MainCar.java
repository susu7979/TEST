package TEST1;

public class MainCar {

	public static void main(String[] args) {
		Car car = new Car (false, "white", 1995, "BMW", 150);
		System.out.println(car);
		System.out.println(car.isHasWheel());
	
		int[] test2 = {1, 2, 3};
		System.out.println(test2);
	}

}
