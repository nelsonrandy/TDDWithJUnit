public class Car {

	public String color;
	private int speed;
	private int maxSpeed;
	private int minimumSpeed;

	/**
	 * Creates a new car instance
	 * 
	 * @param color
	 * @param maxSpeed
	 */
	public Car(String color, int maxSpeed) {
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.speed = 0;
	}

	/**
	 * Return the current speed of the car.
	 */
	public int getSpeed() {
		return (this.speed);
	};

	/**
	 * @param amount
	 * 
	 */
	public void accelerate(int amount) {
		int limit = this.maxSpeed - this.speed;
		if (amount >= limit) {
			this.speed = limit;
		} else {
			this.speed += amount;
		}
	}

	/**
	 * Displays the object as a string in the format "Color: red, Speed: 100"
	 */
	public String toString() {

		return ("Color: Red, Speed: 0");
	}

	public void decelerate(int amount) {
		int limit = this.minimumSpeed - this.speed;
		if (amount <= limit) {
			this.speed = limit;
		} else {
			this.speed += amount;
		}
	}

}