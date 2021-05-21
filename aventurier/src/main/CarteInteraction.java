package main;

import java.io.IOException;
import java.util.List;
import java.util.ResourceBundle;

public class CarteInteraction {

	private Coordinate initial;

	private String movement;


	public CarteInteraction(Coordinate initial,String movement) {
		super();
		this.initial=initial;
		this.movement=movement;
	}
	public CarteInteraction(String fileName) {
		try {
			List<String> list=	Carte.readFile(fileName);
			this.initial=	new Coordinate( Integer.parseInt(list.get(0).split(",")[0]), 
					Integer.parseInt(list.get(0).split(",")[1]));
			this.movement = list.get(1);
		} catch (IOException e) {
			System.err.println(e);
		}
		catch (NumberFormatException e) {
			System.err.println(e);
		}

	}
	public Coordinate calculNewPosition() {
		ResourceBundle bundle = ResourceBundle.getBundle("properties.config");
		String fileName=bundle.getString("carte.path");
		try {
			List<String> list=	Carte.readFile(fileName);
			for(char c: movement.toCharArray()) {
				if(list.get(initial.getY()).charAt(initial.getX())==' ')	translateDirection(c);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return initial;

	}
	private Coordinate translateDirection(char direction) {
		switch(direction) {
		case('O'):{initial.setX(initial.getX() - 1); return initial;}
		case('N'):{initial.setY(initial.getY() - 1); return initial;}
		case('S'):{initial.setY(initial.getY() + 1); return initial;}
		case('E'):{initial.setX(initial.getX() + 1); return initial;}
		default: return initial;
		}
	}

}
