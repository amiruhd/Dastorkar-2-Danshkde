public class CE {

    private String Name ;
    //student name
    private String Lname ;
    //student lname
    private  int ID ;
    //student id
    private String Status ;
    //student status


    public CE(String name , String lname , int id , String status){
        Name = name ;
        Lname = lname ;
        ID = id ;
        Status = status ;
    }

    /** *
     *  get the student status * if PASS @return YES else @return NO!
     *  */

    public String check (String status){
        if (status == "PASS")
            return "YES :) ";
        else
            return "NO! :( ";
    }

    /** * Print the student’s name , lname , id , final STATUS .. . */
    public void print2(){
        System.out.println(Name + " " + Lname + "  " + ID + "  " + " " +check(Status) + "    Because He/She " +"("+ Status +")"+" the Elementary lab" );

    }
}

