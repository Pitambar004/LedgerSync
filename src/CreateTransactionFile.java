
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;


public class CreateTransactionFile {

	public static void main(String[] args) {
		List<TransactionRecord> transaction= List.of(
				new TransactionRecord(100, 34.64),
				new TransactionRecord(200, 20.23),
				new TransactionRecord(300, -20.42),
				new TransactionRecord(400, -50.42),
				new TransactionRecord(500, 4.53));

		try {
			ObjectMapper map = new ObjectMapper();

			Path p = Paths.get("transaction.json");

			if(Files.exists(p)) {
				System.out.println("There is already a file!");
				map.writeValue(p.toFile(), transaction);

			}else {
				Files.createFile(p);
				map.writeValue(p.toFile(), transaction);
				System.out.printf("Your json file has been created at %s", p.toAbsolutePath());
			}

		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
