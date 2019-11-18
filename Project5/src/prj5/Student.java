/**
 * 
 */
package prj5;

/**
 * @author smksu
 *
 */
public class Student 
{
    private String[] attributes = new String[3];
    private Major major;
    private Hobby hobby;
    private State state;
    FileReader reader;
    //need something store info
    
    public Student() 
    {
        reader = new FileReader;
        //something = reader.readStudentFiles;
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
