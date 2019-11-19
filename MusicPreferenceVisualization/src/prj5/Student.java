package prj5;

public class Student 
{
    private String[] attributes = new String[3];
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
        attributes[0] = major.toString();
        attributes[1] = hobby.toString();
        attributes[2] = state.toString();
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
    
    public String[] getAttributes()
    {
        return attributes;
    }
}