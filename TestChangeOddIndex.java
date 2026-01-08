package testCode;

public class TestChangeOddIndex {
	
	public static void testChangeOddIndex(String name) {
		
				String name1 = name.toLowerCase();

				if (name1 == null ||name1==" ") {
					System.out.println("Enter the data");
				}

				char[] charArray = name1.toCharArray();

				for (int i = 0; i < charArray.length; i++) {
					char c = charArray[i];
					
					if (i%2!=0) {
						char upperCase = Character.toUpperCase(c);
						System.out.print(upperCase);

					} else {
						System.out.print(charArray[i]);

					}

				}
				System.out.println("\n");
				
			}
	

			public static void main(String[] args) {
				TestChangeOddIndex.testChangeOddIndex("Changeme");
				TestChangeOddIndex.testChangeOddIndex("ChangeMe");
				TestChangeOddIndex.testChangeOddIndex(" ");
				TestChangeOddIndex.testChangeOddIndex("CHANGEME");
			}




}
