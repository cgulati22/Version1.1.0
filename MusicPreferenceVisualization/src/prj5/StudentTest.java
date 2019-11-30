/**
 * 
 */
package prj5;

import student.TestCase;

/**
 * @author smksu
 *
 */
public class StudentTest extends TestCase
{
    private Student kavya;
    
    public void setUp()
    {
        Major m = Major.COMPUTER_SCIENCE;
        Hobby h = Hobby.READ;
        State s = State.NORTHEAST_US;
        kavya = new Student(m, h, s);
    }
    
    public void testGetMajor()
    {
        assertEquals(Major.COMPUTER_SCIENCE, kavya.getMajor());
    }
    
    public void testGetHobby()
    {
        assertEquals(Hobby.READ, kavya.getHobby());
    }
    
    public void testGetState()
    {
        assertEquals(State.NORTHEAST_US, kavya.getState());
    }
    
    public void testToString()
    {
        assertEquals("[Read, Computer Science, NorthEast US]", kavya.toString());
    }
}
