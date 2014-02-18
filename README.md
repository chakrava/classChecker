classChecker
============

Checks if campus classrooms are in use (SPSU, unoffical)

I do tech-support for in-classroom computers and technology on my college campus, most of the work is done when classes aren't occupied.  Originally, I had to either pull up a large, unsorted HTML table of every class taught and look for the classroom I needed to visit, and see if any of the classes were in the room.  The alternative (and sometimes easier) method was to actually walk to a classroom and hope it was empty.

I wrote this Java program to check what class rooms were in session, and when.  It scrapes its data from the unsorted HTML table and stores it temporarily.  A user can search any classroom "A101", or an entire building "A" and get back a list of all the classes.  By default, the program color-codes classes that are in-session in red text, and soon-to-be-meeting (within 15 minutes) in orange (looks yellow).
