package School;

class Student extends Person{
    private int totalfees = 20000;
    private int paidfees;
    private int totalcredits;
    private final int perCredit = 1000;
    private Courses [] Studentcourse;
    private int courseCount;



    public int getTotalcredits() {
        return totalcredits;
    }

    public int getTotalfees() {
        return totalfees;
    }

    public void setFees(int fees) {
        if (fees <= (totalfees - paidfees) && fees > 0) {
            paidfees += fees;
        }
    }

    public int getBalanceRemains() {
        return totalfees - paidfees;
    }


    Student(int id, String name, String gmail) {
        super(id,name,gmail);
        Studentcourse = new Courses[6];
    }

    @Override
    String getRole() {
        return "Student";
    }

    public Courses[] getStudentcourse() {
        return Studentcourse;
    }

    void enrollInCourse(Courses id) {
        if (courseCount < Studentcourse.length) {
            Studentcourse[courseCount++] = id;
            totalcredits += id.getCourseCredit();
            totalfees += totalcredits * perCredit;
        }
    }


}