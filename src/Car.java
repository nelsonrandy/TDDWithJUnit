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
<<<<<<< HEAD
	 * Accelerates the car up to the maximum amount set in the object
	 * constructor.
	 * 
=======
>>>>>>> 1ac2f7d955c1b7228f5562e03bfcec295dff76e0
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
<<<<<<< HEAD
	 * Displays  the object as a string in the format "Color: red, Speed: 100"
=======
	 * Displays the object as a string in the format "Color: red, Speed: 100"
>>>>>>> 1ac2f7d955c1b7228f5562e03bfcec295dff76e0
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