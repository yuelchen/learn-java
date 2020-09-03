package com.yuelchen.main;

public class NamingConvention {
	
	public static void main(String[] args) {
		
		/* Symbol Expression
		 * ! 		- 	First character
		 * . 		- 	Matches any character
		 * $ 		-	Matches line end
		 * | 		- 	Or operator; 'a|b' matches a or b
		 * ^		- 	Not operator
		 * *		-	Occurs zero or more times; {0,}
		 * + 		- 	Occurs one or more times; {1,}
		 * ?		- 	Occurs zero to one times; {0,1}
		 * {x}		-	Occurs x number of times
		 * {X,Y}	-	Occurs minimum of x times, maximum of y times
		 */
		
		/* Characters Expression:
		 * \d	-	Any digit; [0-9]
		 * \D	-	A non-digit; [^0-9] 
		 * \s	-	A whitespace character; [\n\t\x0b\r\f]
		 * \S	-	A non-whitespace character; [^\n\t\x0b\r\f]
		 * \S+	-	Several non-whitespace characters
		 * \w	-	A word character; [a-zA-Z0-9_]
		 * \W	-	A non-word character; [^\w]
		 * \b	-	Matches boundary word where word is \w
		 */
		
		//regex for social numbers
		String[] randomNumbers = {
					"000-15-0050", "666-15-0001", "900-54-2153",
					"333-00-3333", "001-05-2001", "646-05-2001",
					"546-42-0000", "151-60-8443", "765-07-0001"
				};		

		System.out.println("\n==================================================\n");
		for(String randomNumber : randomNumbers) {
			System.out.println(String.format("isSocialSecurityNumber(%s): %b", 
					randomNumber, isSocialSecurityNumber(randomNumber)));
		}
		
		//regex for patterns
		String[] randomEmails = {
					"john_smith@gmail.com", "john_doe@yahoo.com",
					"jane_doe@gmail.com", "wonder1@gmail.com"
				};

		System.out.println("\n==================================================\n");
		for(String randomEmail : randomEmails) {
			System.out.println(String.format("isEmailSenderOrganization(%s): %b", 
					randomEmail, isEmailSenderOrganization(randomEmail)));
		}
		
		//regex for S3 object prefix
		String[] prefixes = {
					"land/default/DSET00000000/raw/",
					"land/default/DSET00000000/raw",
					"land//default/DSET00000000/raw",
					"/land/default/DSET00000000/temp.txt",
					"prepare/default/DSET00000001/ingest",
					"prepare/default/DSET00000001/ingest",
					"/prepare/default/DSET00000001/ingest"
				};
		
		System.out.println("\n==================================================\n");
		for(String prefix : prefixes) {
			System.out.println(String.format("isValidPrefix(%s): %b", 
					prefix, isValidPrefix(prefix)));
		}
		
	}
	
	//====================================================================================================
	
	private static boolean isSocialSecurityNumber(String number) {
		String pattern = "(?!666|000|9\\d{2})\\d{3}-"
				+ "(?!00)\\d{2}-"
				+ "(?!0000)\\d{4}";
		return number.matches(pattern);
	}
	
	//====================================================================================================
	
	private static boolean isEmailSenderOrganization(String eMail) {
		String pattern = "[a-zA-Z]{1}[\\.a-zA-Z0-9_-]+[a-zA-Z0-9]{1}@gmail.com";
		return eMail.matches(pattern);
	}
	
	//====================================================================================================
	private static boolean isValidPrefix(String prefix) {
		String pattern = "(land|prepare)/.+/DSET\\d{8}/.+";
		return prefix.matches(pattern);
	}
}