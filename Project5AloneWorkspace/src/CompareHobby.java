import java.util.Comparator;

/**
 * 
 */

/**
 * @author shreyajain
 *
 */
public class CompareHobby implements Comparator<Student> {

    public CompareHobby() {
        // this is the constructor which intentionally has nothing in it
    }


    /**
     * 
     * @param student1
     *            - the first Student Object whose hobby is used
     * @param student2
     *            - the second Student Object whose hobby is used
     * @return - -1 if the first Hobby is in a earlier alphabetical order
     *         than the second major,
     *         0 if they are equal and 1 if the first Hobby is in an later
     *         alphabetical order than the second major
     */
    @Override
    public int compare(Student student1, Student student2) {
        Hobby hobby1 = student1.getHobby();
        Hobby hobby2 = student2.getHobby();
        String h1 = hobby1.toString().toLowerCase;
        String h2 = hobby2.toString().toLowerCase;
        int compare = h1.compareTo(h2);

    }
}
