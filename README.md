# bootcamp-java-universidad-2023-maven
maven project

Address Book Console Application
You have an address book database in CSV format (comma separated values) named address-book.csv with the following 
columns: id, name and  email address (assume rows are not duplicated).
Write a small java console application (command line) that when run:
 
1. Loads the address-book.csv in memory into an appropriate structure suitable for later access (the original CSV file is not used after this)
 
2. Presents user with a Search option
 
(1) Search By Name
(2) Search By Email
(3) Search By ID
(4) List all
 
If (1) was selected the application will ask for First Name and Last Name
If (2) was selected the application will ask for Email address
If (3) was selected the application will ask for an ID
If (4) was selected the application will list all users.
 
For 1,2, 3  the application will look the user up the address book based on the key selected and if found displays the available user information. If not found the application will display "User not found" and asks the user "Do you want to search again? (Y/N).
 
If 4 was selected all users will be displayed preferably using a recursive method to list them one by one 
(for ex. by getting the max ID and counting down until all were displayed).
 Once listing was done "Do you want to search again? (Y/N)" is displayed.
 
If the selection is 'N' then the application simply displays "Thank you. Hope to see you again" and exists
If the selection is 'Y' then the application will start again from #2 presenting user with a Search Option
 
Hints:
1. You can use java.io.BufferedReader/FileReader for reading the CSV file
2. You can use java.util.Scanner / System.in for reading strings and numbers from console
