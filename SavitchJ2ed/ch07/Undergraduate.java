public class Undergraduate extends Student
{
    private int level;//1 for freshman, 2 for sophomore, etc.
 
    public Undergraduate()
    {
        super();
        level = 1;
    }

    public Undergraduate(String initialName, 
                    int initialStudentNumber, int initialLevel)
    {
        super(initialName, initialStudentNumber);
        level = initialLevel;
    }

    public void reset(String newName, 
                          int newStudentNumber, int newLevel)
    {
        reset(newName, newStudentNumber);
        level = newLevel;
    }

    public int getLevel()
    {
        return level;
    }

    public void setLevel(int newLevel)
    {
        level = newLevel;
    }

    public void writeOutput()
    {
        super.writeOutput();
        System.out.println("Student Level: " + level);
    }

    public boolean equals(Undergraduate otherUndergraduate)
    {
        return (super.equals(otherUndergraduate)
             && (this.level == otherUndergraduate.level));
    }
}