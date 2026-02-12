package School;

class Collage {
    private Student[] students;
    private Courses[] courses;
    private Professior[] professiors;
    private int countForStudent;
    private int countForCourses;
    private int countForProfessor;

    Collage() {
        students = new Student[20];
        professiors = new Professior[10];
        courses = new Courses[30];
    }

    public boolean AddStudent(int id, String name, String gmail) {
        if (countForStudent < students.length) {
            students[countForStudent] = new Student(id, name, gmail);
            countForStudent++;
            return true;
        }
        return false;
    }

    public boolean AddProfessor(int id, String name, String Gamil) {
        if (countForProfessor < professiors.length) {
            professiors[countForProfessor++] = new Professior(id, name, Gamil);
            return true;
        }
        return false;
    }

    public boolean AddCourse(int id, String name, int Credit, int proid) {
        if (countForCourses < courses.length) {
            courses[countForCourses++] = new Courses(id, name, Credit, proid);
            return true;
        }
        return false;
    }

    public boolean EnrollCourses(int studentID, int courseCode) {
        for (int i = 0; i < countForStudent; i++) {
            if (studentID == students[i].getId()) {
                for (int j = 0; j < countForCourses; j++) {
                    if (courseCode == courses[j].getCourseID()) {
                        students[i].enrollInCourse(courses[j]);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public Student viewStudents(int id) {
        for (int i = 0; i < countForStudent; i++) {
            if (id == students[i].getId()) {
                return students[i];
            }
        }
        return null;
    }

    public Student payFeesOfStudent(int id) {
        for (int i=0;i<countForStudent;i++) {
            if (id==students[i].getId()) {
                return students[i];
            }
        }
        return null;
    }

    public Courses[] getAllCourse() {
        return courses;
    }



}
