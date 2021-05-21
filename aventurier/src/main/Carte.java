package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Carte {
	
	
//	private static List<String> readMaps() throws IOException
//	{
//
//	    return readFile("resources/carte.txt");
//
//	    
//	}
//	 static List<String> readMovement() throws IOException
//	{
//		
//	    return readFile("resources/deplacement.txt");
//
//	    
//	}
	
	static  List<String> readFile(String fileName) throws IOException
	{
		 Stream<String> lines =	Files.lines(Paths.get(fileName));
		 List<String> list=   lines.collect(Collectors.toList());
	     lines.close();
	     return list;
	}
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		try {
//			readMaps();
//			 System.out.println("jjjjj");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

}
