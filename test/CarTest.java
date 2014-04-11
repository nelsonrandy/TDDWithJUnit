import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

public class CarTest {

	@Test
	public void createsCarWithSpeedOfZero() {
		Car car1 = new Car("Red", 100);
		assertThat(car1.getSpeed(), is(0));
	}

	@Test
	public void canAccelerate() {
		Car car1 = new Car("Red", 100);
		car1.accelerate(10);
		assertThat(car1.getSpeed(), is(10));
	}

	@Test
	public void cannotAccelerateBeyondMaxSpeed() {
		Car car1 = new Car("Red", 100);
		car1.accelerate(101);
		assertThat(car1.getSpeed(), is(100));
	}

	@Test
<<<<<<< HEAD
	public void createsAString() {
=======
	public void canDoToString() {
>>>>>>> 1ac2f7d955c1b7228f5562e03bfcec295dff76e0
		Car car1 = new Car("Red", 100);
		assertThat(car1.toString(), is("Color: Red, Speed: 0"));
	}

	@Test
	public void cannotDecelerateBeyondMinimumSpeed() {

		Car car1 = new Car("Red", 100);
		car1.decelerate(-1);
		assertThat(car1.getSpeed(), is(0));
	}

}
