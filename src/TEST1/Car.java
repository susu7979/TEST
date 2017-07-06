package TEST1;

public class Car extends Transportation {
	private String brand;
	private int speed;

	public Car(boolean hasWheel, String color, int age, String brand, int speed) {
		super(hasWheel, color, age);
		this.setBrand(brand);
		this.setSpeed(speed);
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public boolean isHasWheel(){
		return true;
	}
}
