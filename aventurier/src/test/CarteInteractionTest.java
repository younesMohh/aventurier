package test;

import java.util.ResourceBundle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import main.CarteInteraction;
import main.Coordinate;

class CarteInteractionTest {
	private static String input;
	@BeforeAll
	  static void initAll() {
	    System.out.println("BeforeAll");
		ResourceBundle bundle = ResourceBundle.getBundle("properties.config");
		 input=bundle.getString("data.input");
	  }
	@Test
	void calculNewPositionFileTest() {
		Coordinate result=new CarteInteraction(input).calculNewPosition();
		Assertions.assertEquals(result.getX(), 9);
		Assertions.assertEquals(result.getY(), 2);
	}
	@Test
	void calculNewPositionFileNotExistTest() {
		 Assertions.assertThrows(NullPointerException.class, () -> {
			 new CarteInteraction("file.txt").calculNewPosition();
			  });
	}
	@Test
	void calculNewPositionGoodPsitionTest() {
		Coordinate result=new CarteInteraction(new Coordinate(3,0),"SSSSEEEEEENN").calculNewPosition();
		Assertions.assertEquals(result.getX(), 9);
		Assertions.assertEquals(result.getY(), 2);
	}
	@Test
	void calculNewPositionWrongPsitionTest() {
		Coordinate result=new CarteInteraction(new Coordinate(12,4),"SSSSEEEEEENN").calculNewPosition();
		Assertions.assertEquals(result.getX(), 12);
		Assertions.assertEquals(result.getY(), 6);
	}

}
