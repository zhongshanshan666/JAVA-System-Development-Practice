package Programming5;

/*
 * Programming Assignment 5: OfferedCourse class
 * @author shan shan zhong
 * @version 1.0
 */

public class OfferedCourse extends Course{
    private String instructorName;
    private String term;
    private String classTime;

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public void setClassTime(String classTime) {
        this.classTime = classTime;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public String getTerm() {
        return term;
    }

    public String getClassTime() {
        return classTime;
    }
}
