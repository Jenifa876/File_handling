# File handling
This Java program demonstrates basic file handling operations, including creating a new file, writing to the file, and reading from the file.

# Program Explanation
The File_ex class performs the following tasks:

# File Creation:

Creates a new file named jeni.txt in the current directory.
If the file already exists, a message is printed indicating that the file already exists.
Writing to the File:

Writes the text "Hello" to jeni.txt.
After writing, the FileWriter is closed to ensure the data is saved.
Reading from the File:

Reads the content of jeni.txt using a BufferedReader.
Prints each line of the file's content to the console.

# Expected Output
When the program runs, the following messages are expected (depending on whether the file jeni.txt already exists):

If the file does not exist, you should see:

File created: jeni.txt
File is written successfully
Hello
If the file already exists:

File already exists
File is written successfully
Hello
