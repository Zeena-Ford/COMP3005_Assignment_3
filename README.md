# COMP 3005 Assignment 3 Question 1 - Implementation of a PostgreSQL database that interacts with a Java application to perform CRUD.



## Author: Zeena Ford, 101229954
Contact: zeenaford@cmail.carleton.ca



## Application description:

The application consists of specific CRUD operations (Create, Read, Update, Delete) that connects with the 'students' PostgreSQL database. The first function 'getAllStudents()' is responsible for displaying and retrieving the students record from the table within the database. The 'addStudent(first_name, last_name, email, enrollment_date)' function is reponsible for inserting a student into the records of the students table. The 'updateStudentEmail(student_id, new_email)' is responsible for updating the email address for a student, given their student id. Finally, the 'deleteStudent(student_id)' is responsible for deleting the record of the student associated with the student id.



## Installation

You **must** be using the IntelliJ IDEA to run the application. You must also ensure that you have downloaded the proper driver (psqlJDBC) to allow the interface between the JAVA application and the PostgreSQL database. Ensure that you are compiling with 'Maven'; this includes either downloading the latest version of the 'psqlJDBC' driver, or copying the code with the 'dependencies xml notation' into the proper libary. Ensure that all java files are running within the same directory (a single project folder.) 



## To run and compile the application

To run this application, ensure that all installation requirements are met, to avoid any errors during compilation. Each of the four operation functions are already included in the main signature within the 'a3.java' class. A provided video from the following URL demonstrates the results from the application: https://www.youtube.com/channel/UC2cf0eqjOqizRZVe1OZRNfA. To compile successfully and verify each function, ensure that the is presented as the initial data (consisting of John, Jane and Jim), and simply remove the '//' notation before the function. For each function, add the given arguments (eg. if a first_name argument is required, input an example of a first name) and click the run icon. The outputted results should be displayed.

