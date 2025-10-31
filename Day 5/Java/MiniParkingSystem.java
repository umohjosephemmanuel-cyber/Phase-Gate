import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class MiniParkingSystemTest{

	@Test
	public void testThatEachLotIsEmpty(){


	// Arrange
	Parkinglot = new Parkinglot();

	

	// Act
	int result = parkinglot.totalNumberOfEmptyLot();


	// Assert 
	assertEquals(result, 0);
	}


	@Test
	public void testThatOneCarIsAddedToTheParkinglot(){

	//Arrange
	Parkinglot = new Parkinglot();


	// Act
	String response = parkinglot.addcar("First car");

	// Assert
	assertEquals(response, "Car added successfully");

}

	@Test
	public void testThatTotalNumberOfCarsAddedIsOne(){

	//Arrange
	Parkinglot = new Parkinglot();


	//Act
	Parkinglot.addcar("1");
	int result = parkinglot.totalNumberOfCars();


	//Assert 
	assertEquals(result, 1);
}

	@Test
	public void testThatCarCanExitLotIndicatingNumberOfSpaceParked(){

	//Arrange
	Parkinglot = new Parkinglot();

	//Act
	Parkinglot.removecar("0");
	int result = parkinglot.totalNumberOfCars();

	//Assert 
	assertEquals(result, 0);
}
	
}