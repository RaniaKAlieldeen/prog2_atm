package atm;

import static atm.AtmInterface.n;
import static atm.AtmInterface.accountInfo;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Data {
	
	@SuppressWarnings("unused")
	public /*Account*/ void readFile() throws FileNotFoundException {
		
		String file = "src/atm/customers.txt";
		Scanner scanner = new Scanner(new File(file));
		scanner.useDelimiter("\n");
		
		String[] info = new String[accountInfo];
		for(int i =0;i<accountInfo;i++) {
			info[i] = scanner.nextLine();	
		}
		
		long cardNumber = Long.parseLong(info[0]);
		double balance = Double.parseDouble(info[1]);
		
		String[] history = new String[n];
		for(int i =2;i<accountInfo;i++) {
			history[i-2] = info[i];
		}
		
		//Account account = new Account(cardNumber,balance,history);

		scanner.close();
		//return account;
		}
}
