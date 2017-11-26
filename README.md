# feedback-form
A mini-project of java and compatible with Sqlite,which takes feedback from users and administrator can access through Database.


A slight change in project then you can also use this project to your use.

Go through the folder src/feedback_form/ 

Then open the sqlite_connection.java file.

Go through Line number23. written as....

Connection conn=DriverManager.getConnection("jdbc:sqlite:/home/lucifuturecoder/NetBeansProjects/ff/feedback");

replace it by 

Connection conn=DriverManager.getConnection("jdbc:sqlite:#your sqlite file");

thats it.
