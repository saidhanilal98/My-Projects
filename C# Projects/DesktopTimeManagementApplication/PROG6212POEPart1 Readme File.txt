Instructions on how to compile and run the software/program:

1. Code a full operational Windows Presentation Foundation(WPF) application. 
2. Click on the top that says 'Build'.
3. Finally, click on the green play button to run the program or click on the top that says 'Debug' and scroll down to where it says 'Start Without Debugging'.


Brief explaination of how I coded my program with the assignment requirements:

MainWindow.xaml.cs
Inputs the user to enter their username and password and once that is done, they can click the "LOGIN" button which takes the user to the next page (Page 1) to access
the rest of the applications resources. If the user does not want to use the application anymore, the user is able to click on the top right hand corner marked "x" to 
exit the whole application.
 
	
Page1.xaml.cs
On this page the user needs to enter all their different module codes, module names, the number of credits that each module has and the class hours.
I made use of a list class in page 1 for each textbox as the list of objects which can be accessed by the index and showing the list class in each position,for example:
 Code = moduleCode_Textbox1.Text, 
            Name = moduleName_Textbox1.Text, 
            Credits  = NumberofCredits_Textbox1.Text, 
            Hours = Classhours_Textbox1.Text,

            studyHours = selfstudycal.selfstudyCalculations(Int32.Parse(NumberofCredits_Textbox1.Text), Int32.Parse(Page1.Hours), Int32.Parse(Classhours_Textbox1.Text))});
			
selfstudyCalculations.cs 
Showing the self study formula calculation as follows for a user that shows how the number of hours for each module per week is calculated below.
       public static int selfstudyCalculations(int numberofCredits, int  numberofWeeks, int numberofHours)

        {
            // Self study formula
            int selfstudyHours = (((numberofCredits * 10) / numberofWeeks) - numberofHours);
            return selfstudyHours;
        } 
    
Created a cutom class library that contains the self study class related to the information and the self study calculations which is exported into all the other pages.
The user must also enter the number of weeks they have for the whole month and select a date. Once the user has entered all their module details as mentioned above the user
can click the button at the bottom of the right hand corner that displays "Next" which then routes the user to Page 2.

Page2.xaml.cs
Once the user has clicked on the "Next' button, the next page displays what the user has inputed including the user's self study hours on the previous page (Page 1).
I made use of a LINQ query to manipulate each module input information from the list class for each label content, for example:
            var firstLine = from q in listClass.moduleInput
                       where q.Position == "first"
                       select q;
            foreach (var item in firstLine)
            {
                lblCode1.Content = item.Code;
                lblName1.Content = item.Name;
                lblNumOfCredits1.Content = item.Credits;
                lblClassHours1.Content = item.Hours;


                lblHours1.Content = item.studyHours;


            }
Once the user has read what is displayed on Page 2 the user has an option to click the button at the bottom of the right hand corner that displays "Add Hours" 
which then routes the user to Page 3.

Page3.xaml.cs
On Page 3 the user can enter their module code and the hours and at the bottom of the hours textbox there is a button that displays "Calculate". By using another 
LINQ query the program manages to display the total remaining hours of self studying on Page 2 to the user, for example:
        private void Calculate_Click(object sender, RoutedEventArgs e)
        {

            var Line = from q in listClass.moduleInput
                       where q.Code == moduleCode_Textbox.Text
                       select q;

            foreach (var item in Line)
            {
                item.studyHours = (item.studyHours - Int32.Parse(moduleHours_Textbox.Text));
            }

            Window window = Window.GetWindow(this);
            window.Content = new Page2();

        }
Once the user is satisified with what is displayed infront of their screen, the user is able to click "Add Hours" again and click on the to right hand corner marked "x" to 
exit the whole application because the user does not need to repeatedly add hours everytime they have to access Page 3.

Finally I created a Unified Modelling Language(UML) class diagram showing the classes in both the class library and the Windows Presentation Foundation(WPF) application.
		
            