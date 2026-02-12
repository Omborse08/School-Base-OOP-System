package School;

class Courses {
    private int courseID;
    private String courseName;
    private int courseCredit;
    private int courseAssignId;

    Courses(int id, String name, int credit, int proid) {
        this.courseID = id;
        this.courseName = name;
        this.courseCredit = credit;
        this.courseAssignId = proid;
    }

    public int getCourseID() {
        return courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCourseCredit() {
        return courseCredit;
    }

    public int getCourseAssignId() {
        return courseAssignId;
    }
}

