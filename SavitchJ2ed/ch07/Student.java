
//This version has material on toString added.
public class Student extends Person
{
    private int studentNumber;

    public Student()
    {
        super();
        studentNumber = 0;//Indicating no number yet
    }

    public Student(String initialName, int initialStudentNumber)
    {
        super(initialName);
        studentNumber = initialStudentNumber;
    }

    public void reset(String newName, int newStudentNumber)
    {
        setName(newName);
        studentNumber = newStudentNumber;
    }

    public int getStudentNumber()
    {
        return studentNumber;
    }
    public void setStudentNumber(int newStudentNumber)
    {
        studentNumber = newStudentNumber;
    }

    public void writeOutput()
    {
        System.out.println("Name: " + getName());
        System.out.println("Student Number : " + studentNumber);
    }

    public boolean equals(Student otherStudent)
    {
        return (this.sameName(otherStudent)
             && (this.studentNumber == otherStudent.studentNumber));
    }

    public String toString()
	{
	    return("Name: " + getName()
	                    + "\nStudent number: "
	                    + Integer.toString(studentNumber));
    }

    /**********************
     *Demonstrates toString.
     **********************/
    public static void main(String[] args)
    {
         Student s = new Student("Jane Doe", 3);
         String stringVersion = s.toString();
         System.out.println(stringVersion);
         System.out.println(s.toString());
	}
}
