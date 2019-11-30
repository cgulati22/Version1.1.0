package prj5;

public class Student 
{
    private Major major;
    private Hobby hobby;
    private State state;
    //private FileReader reader;
    //private Student[] students;
    
    public Student(Major m, Hobby h, State s) 
    {
        //reader = new FileReader();
        //student = reader.readStudentFiles();
        this.major = m;
        this.hobby = h;
        this.state = s;
    }
    
    public Major getMajor()
    {
        return major;
    }
    
    public Hobby getHobby()
    {
        return hobby;
    }
    
    public State getState()
    {
        return state;
    }
    
    public String toString()
    {
        String major;
        String hobby;
        String state;
        
        if (this.major == Major.COMPUTER_SCIENCE)
        {
            major = "Computer Science";
        }
        else if (this.major == Major.MATH_OR_CMDA)
        {
            major = "Math or CMDA";
        }
        else if (this.major == Major.OTHER)
        {
            major = "Other";
        }
        else if (this.major == Major.OTHER_ENGINEERING)
        {
            major = "Other Engineering";
        }
        else
        {
            major = " ";
        }
        
        if (this.state == State.NORTHEAST_US)
        {
            state = "NorthEast US";
        }
        else if (this.state == State.OUTSIDE_US)
        {
            state = "Outside of US";
        }
        else if (this.state == State.REST_OF_US)
        {
            state = "Rest of the US";
        }
        else if (this.state == State.SOUTHEAST_US)
        {
            state = "SouthEast US";
        }
        else
        {
            state = " ";
        }
        
        if(this.hobby == Hobby.ART)
        {
            hobby = "Art"; 
        }
        else if (this.hobby == Hobby.MUSIC)
        {
            hobby = "Music";
        }
        else if (this.hobby == Hobby.READ)
        {
            hobby = "Read";
        }
        else if (this.hobby == Hobby.SPORTS)
        {
            hobby = "Sports";
        }
        else
        {
            hobby = " ";
        }
        
        StringBuilder builder = new StringBuilder();
        
        builder.append("[");
        builder.append(hobby);
        builder.append(", ");
        builder.append(major);
        builder.append(", ");
        builder.append(state);
        builder.append("]");
        
        return builder.toString();
        
    }
}