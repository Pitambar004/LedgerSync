import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FileMatch {

	public static void main(String[] args) {
		ObjectMapper map = new ObjectMapper();
		
		Path p = Paths.get("old.json");
		Path q = Paths.get("transaction.json");
		Path newFile = Paths.get("new.json");
		
		try {
			List<Account> account = map.readValue(p.toFile(), new TypeReference<List<Account>>(){});
			List<TransactionRecord> record = map.readValue(q.toFile(), new TypeReference<List<TransactionRecord>>(){});
			
			for (int i = 0; i < account.size(); i++) {
				for (int j = 0; j <record.size(); j++) {
					account.get(i).combine(record.get(j));
					
					
					if(Files.exists(newFile)) {
						System.out.println("There is already a file!");
						map.writeValue(newFile.toFile(), account);
						
					}else {
						Files.createFile(newFile);
						map.writeValue(newFile.toFile(), account);
						System.out.printf("Your json file has been created at %s", newFile.toAbsolutePath());
					}
					
				}
			}
			
		}
		
		catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}
	

}
