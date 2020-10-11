
public class Run {

    public static void main(String[] args) {

	System.out.println("ElementryLab Students :");

	// Using ElementryLab class:
	ElementryLab Student1 = new ElementryLab("Amir    " , "Sarahang" , 9831085 ,  18.5);
	ElementryLab Student2 = new ElementryLab("Yasamin " , "Abdi    " , 9831022 ,  9);
	ElementryLab Student3 = new ElementryLab("Elahe   " , "Jahed   " , 9731060 ,  6);
	ElementryLab Student4 = new ElementryLab("Morteza " , "Rezaei  " , 9831086 ,  14);

    Student1.check_Lab_Grade(19.5);
	Student1.print();
	Student2.check_Lab_Grade(Student2.Erfagh(2));
	Student2.print();
	Student3.check_Lab_Grade(Student3.Erfagh(2));
	Student3.print();
	Student4.check_Lab_Grade(Student4.Erfagh(2));
	Student4.print();

	// Using CE class:
	

        CE Stu1 = new CE("Amir    " , "Sarahang" , 9831085 ,  Student1.check_Lab_Grade(19.5));
        CE Stu2 = new CE("Yasamin " , "Abdi    " , 9831022 ,  Student2.check_Lab_Grade(11.0));
        CE Stu3 = new CE("Elahe   " , "Jahed   " , 9731060 ,  Student3.check_Lab_Grade(8.0));
        CE Stu4 = new CE("Morteza " , "Rezaei  " , 9831086,  Student4.check_Lab_Grade(16.0));

		System.out.println();
        System.out.println("Can students work in the advanced lab?");
		//System.out.println();

        Stu1.print2();
		Stu2.print2();
		Stu3.print2();
		Stu4.print2();

    }

}
