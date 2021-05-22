package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilesUtil {
	

	static  List<String> readTextFileByLines(String fileName) throws IOException
	{
		 Stream<String> lines =	Files.lines(Paths.get(fileName));
		 List<String> list=   lines.collect(Collectors.toList());
	     lines.close();
	     return list;
	}
	

}
