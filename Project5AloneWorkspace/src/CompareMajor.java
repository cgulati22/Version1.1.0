import java.util.Comparator;

/**
 * 
 */

/**
 * @author shreyajain
 *
 */
public class CompareMajor implements Comparator<Student> {

    public CompareMajor() {
        // this is the constructor which intentionally has nothing in it
    }


    /**
     * 
     * @param student1
     *            - the first Student Object whose major is used
     * @param student2
     *            - the second Student Object whose major is used
     * @return - -1 if the first Major is in a earlier alphabetical order
     *         than the second major,
     *         0 if they are equal and 1 if the first major is in an later
     *         alphabetical order than the second major
     */
    @Override
    public int compare(Student student1, Student student2) {
        Major major1 = student1.getMajor();
        Major major2 = student2.getMajor();
        String m1 = major1.toString().toLowerCase;
        String m2 = major2.toString().toLowerCase;
        int compare = m1.compareTo(m2);
    }

}
