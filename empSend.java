
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//import sql libraries

public class empSend{
	public static void main(String [] args){
		//exception to see if any errors when opening the CSV file 
		throws FileNotFoundException {
		//scanner object holds the file 
        Scanner scanner = new Scanner(new File(args));

        final int empfield =5;
        String empArray =[][empfield];

        //while checks if there is a next line
        while (scanner.hasNextLine())
		{
			//extract line
		    String line = scanner.nextLine();
		    
		    //funtions to store into array 

		}
        scanner.close();
   		
        //fucntion send data to Sql
   		}


	}


}
/*
store array function strToArray(string line, String [][] empArray)
	//separate string into chuncks
	String[] fields = line.split(",");
	for int i : fields.length{
		empArray[][i]= field[i]
	}
	}
	 
*/

/*
function empToSQL(string [][] empArray)
	get socket connection to remote sql server 
	verify connection 
	create table with specifics date and type payroll
	create colums fro fields 

	send empArray[][i]  to each column for a row
	print out table for verification 

*/
