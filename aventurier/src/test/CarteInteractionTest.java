package test;

import java.nio.file.NoSuchFileException;
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
		ResourceBundle bundle = ResourceBundle.getBundle("properties.config");
		 input=bundle.getString("data.input");
	  }
	@Test
	void calculNewPositionFileTest() throws Exception {
		Coordinate result=new CarteInteraction(input).calculNewPosition();
		Assertions.assertEquals(result.getX(), 9);
		Assertions.assertEquals(result.getY(), 2);
	}
	@Test
	void calculNewPositionFileNotExistTest() {
		 Assertions.assertThrows(NoSuchFileException.class, () -> {
			 new CarteInteraction("file.txt").calculNewPosition();
			  });
	}
	@Test
	void calculNewPositionGoodPsitionTest() throws Exception {
		Coordinate result=new CarteInteraction(new Coordinate(3,0),"SSSSEEEEEENN").calculNewPosition();
		Assertions.assertEquals(result.getX(), 9);
		Assertions.assertEquals(result.getY(), 2);
	}
	@Test
	void calculNewPositionWrongPsitionTest() throws Exception {
		 Assertions.assertThrows(Exception.class, () -> {
			 new CarteInteraction(new Coordinate(12,4),"OONOOSSOO").calculNewPosition();
			  });
	}
	@Test
	void calculNewPositionNullPsitionTest() throws Exception {
		 Assertions.assertThrows(Exception.class, () -> {
			 new CarteInteraction(null,"OONOOSSOO").calculNewPosition();
			  });
	}
	@Test
	void calculNewPositionEmptyDisplacementTest() throws Exception {
		Coordinate result=new CarteInteraction(new Coordinate(3,0),"").calculNewPosition();
		Assertions.assertEquals(result.getX(), 3);
		Assertions.assertEquals(result.getY(), 0);
	}
}
