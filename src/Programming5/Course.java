package Programming5;

/*
 * Programming Assignment 5: Course class
 * @author shan shan zhong
 * @version 1.0
 */

public class Course {
    private String courseNumber;
    private String courseTitle;

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void printInfo() {
        System.out.println("Course Information: ");
        System.out.println("   Course Number: " + courseNumber);
        System.out.println("   Course Title: " + courseTitle);
    }
}
