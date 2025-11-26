import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;


public class CreateJSONFile {

	public static void main(String[] args) {
		List<Account> accounts= List.of(
				new Account(100, "Pitambar", 234.64),
				new Account(200, "Prince", 2343.23),
				new Account(300, "Lamo", 8374.42),
				new Account(400, "Choto", 2397.42),
				new Account(500, "Dada", 23324.53));
	
	try {
		ObjectMapper map = new ObjectMapper();
		
		Path p = Paths.get("old.json");
		
		if(Files.exists(p)) {
			System.out.println("There is already a file!");
			map.writeValue(p.toFile(), accounts);
			
		}else {
			Files.createFile(p);
			map.writeValue(p.toFile(), accounts);
			System.out.printf("Your json file has been created at %s", p.toAbsolutePath());
		}
		
	}
	catch(IOException e) {
		e.printStackTrace();
	}
	}
}
