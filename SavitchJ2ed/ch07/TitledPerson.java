public class TitledPerson extends Person
{
    private String title;

    public TitledPerson()
    {
        super();
        title = "no title yet";
    }

    public TitledPerson(String initialName, String initialTitle)
    {
        super(initialName);
        title = initialTitle;
    }

    public void reset(String newName, String newTitle)
    {
        setName(newName);
        title = newTitle;
    }

    public String getTitle()
    {
        return title;
    }
    public void setTitle(String newTitle)
    {
        title = newTitle;
    }

    public void writeOutput()
    {
        System.out.println("Name: " + getName());
        System.out.println("Title: " + title);
    }

    public boolean equals(TitledPerson otherPerson)
    {
        return (this.sameName(otherPerson)) &&
                (this.title.equalsIgnoreCase(otherPerson.title));
    }
}