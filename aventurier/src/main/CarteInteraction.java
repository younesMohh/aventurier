package main;

import java.io.IOException;
import java.util.List;
import java.util.ResourceBundle;

public class CarteInteraction {

	private Coordinate initial;

	private String movement;

	private List<String> carts;


	public CarteInteraction(Coordinate initial,String movement) {
		super();
		this.initial=initial;
		this.movement=movement;
	}
	public CarteInteraction(String fileName) throws IOException{
		try {
			List<String> list=	FilesUtil.readTextFileByLines(fileName);
			this.initial=	new Coordinate( Integer.parseInt(list.get(0).split(",")[0]), 
					Integer.parseInt(list.get(0).split(",")[1]));
			this.movement = list.get(1);
		}
		catch (NumberFormatException e) {
			throw new NumberFormatException("(x,y) isn't valid!");
		}

	}
	public Coordinate calculNewPosition()throws Exception {
		ResourceBundle bundle = ResourceBundle.getBundle("properties.config");
		String fileName=bundle.getString("carte.path");
		carts=	FilesUtil.readTextFileByLines(fileName);

		if(carts.get(initial.getY()).charAt(initial.getX())=='#')
		{throw new Exception("(x,y) busy box");
		}

		for(char c: movement.toCharArray()) {
			translateDirection(c);
		}
		return initial;

	}
	private Coordinate translateDirection(char direction) throws Exception {
		switch(direction) {
		case('O'):{
			if(initial.getX()>0&&carts.get(initial.getY()).charAt(initial.getX()-1)==' ')initial.setX(initial.getX() - 1);
			else throw new Exception("(x,y) busy box"); break;
		}
		case('N'):{if(initial.getY()>0&&carts.get(initial.getY()-1).charAt(initial.getX())==' ')initial.setY(initial.getY() - 1);
		else throw new Exception("(x,y) busy box"); break;
		}
		case('S'):{if(initial.getY()<carts.size()&&carts.get(initial.getY()+1).charAt(initial.getX())==' ')initial.setY(initial.getY() + 1);
		else throw new Exception("(x,y) busy box"); break;
		}
		case('E'):{if(initial.getX()<carts.get(initial.getY()).length()&&carts.get(initial.getY()).charAt(initial.getX()+1)==' ')initial.setX(initial.getX() + 1);
		else throw new Exception("(x,y) busy box"); break;
		}
		}return initial;
	}
	
}
