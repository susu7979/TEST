package TEST1;

public class Transportation {
	private boolean hasWheel;
	private String color;
	private int age;
	
	public Transportation(boolean hasWheel,String color,int age){
		this.setAge(age);
		this.setColor(color);
		this.setHasWheel(hasWheel);		
	}

	public boolean isHasWheel() {
		return hasWheel;
	}

	public void setHasWheel(boolean hasWheel) {
		this.hasWheel = hasWheel;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
