public class ElementryLab {
    /**
     @author AmirHossein
     **/
    private String Name ;
    //student name
    private String Lname;
    //student lname
    private int ID;
    //student id
    private  double Grade ;
    //student grade

    public ElementryLab(String name ,String lname , int id , double grade){
        Name = name ;
        Lname = lname ;
        ID = id ;
        Grade = grade ;
    }

    /** *
     *  get the grade  of student * @return PASS or FAIL
     *  */
    public String check_Lab_Grade ( double grade ){
        Grade = grade ;
        if(Grade >= 10)
            return "PASS";
        else
            return "FAIL";
    }

    /** *
     *  get the number of extra grade  * @return Geade + extra grede
     *  */
    public double Erfagh(double Extra_grade){
        Grade = Grade + Extra_grade ;
        return Grade;
    }

    /** * Print the student’s name , lname , id , final grade and student status. */
    public void print(){
        System.out.println(Name + " " + Lname + "  " + ID + "  " + Grade + " " + check_Lab_Grade(Grade));

    }

}
