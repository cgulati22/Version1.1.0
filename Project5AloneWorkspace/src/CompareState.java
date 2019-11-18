import java.util.Comparator;

/**
 * 
 */

/**
 * @author shreyajain
 *
 */
public class CompareState implements Comparator<Student> {

    public CompareState() {
        // this is the constructor which intentionally has nothing in it
    }


    /**
     * 
     * @param student1
     *            - the first Student Object whose state is used
     * @param student2
     *            - the second Student Object whose state is used
     * @return - -1 if the first Hobby is in a earlier alphabetical order
     *         than the second major,
     *         0 if they are equal and 1 if the first state is in an later
     *         alphabetical order than the second major
     */
    @Override
    public int compare(Student student1, Student student2) {
        Hobby state1 = student1.getState();
        Hobby state2 = student2.getState();
        String s1 = state1.toString().toLowerCase;
        String s2 = state2.toString().toLowerCase;
        int compare = s1.compareTo(s2);

    }
}
