package School;

import java.util.Scanner;

public class FrontEnd {
    static void showMenu() {
        System.out.println("1. Add Student\n" +
                "2. Add Professor\n" +
                "3. Add Course\n" +
                "4. Enroll Student in Course\n" +
                "5. View Student Details\n" +
                "6. View Course Details\n" +
                "7. Pay Student Fees\n"+
                "8. Exit\n");
    }

    static void showStudent(Student info) {
        System.out.println("\n< Student Details >\n");
        System.out.println("Student Name: "+info.getName());
        System.out.println("Student Gmail: "+info.getGmail());
        System.out.println("Student Role: " +info.getRole());
        System.out.println("\nStudent Courses");
        Courses[] enrol = info.getStudentcourse();
        for (int i=0;i< enrol.length;i++) {
            if (enrol[i] != null) {
                showCourse(enrol[i]);
            }
        }
        System.out.println("Student Total Fees: "+info.getTotalfees());
        System.out.println("Student Total Credits: "+info.getTotalcredits());
        System.out.println("Student Total Balance Remaining: "+info.getBalanceRemains());
    }

    static void showCourse(Courses course) {
        System.out.println("Course Name: "+course.getCourseName());
        System.out.println("Course Credit: ("+course.getCourseCredit()+" Credits )");
        System.out.println("Course Id: "+course.getCourseID());
        System.out.println("Course Assign To: "+course.getCourseAssignId());
        System.out.println("-----------------------------------------------");
    }

    static void showBalance(Student student) {
        System.out.println("Remaining Fees: "+student.getBalanceRemains());
    }

    public static void main(String[] args) {
        Collage clg = new Collage();
        boolean isRun = true;
        int StudentIDs = 101;
        int CourseIDs = 501;
        int ProfessiorIDs = 901;
        Scanner sc = new Scanner(System.in);
        showMenu();
        while (isRun) {
            System.out.print("\n> Choose Option: ");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    sc.nextLine();
                    System.out.print("Student Name: ");
                    String name = sc.nextLine();
                    System.out.print("Student Gmail: ");
                    String Gmail = sc.nextLine();
                    if (clg.AddStudent(StudentIDs,name,Gmail)) {
                        System.out.println("Student "+name+" Added Successfully!");
                        System.out.println("Student Id: "+StudentIDs++);
                    }
                    else {
                        System.out.println("Student Not Added!");
                    }
                    break;

                case 2:
                    sc.nextLine();
                    System.out.println("Enter Profeesor Name: ");
                    String ProName = sc.nextLine();
                    System.out.println("Enter Profeesor Gmail: ");
                    String ProGmail = sc.nextLine();
                    if (clg.AddProfessor(ProfessiorIDs,ProName,ProGmail)) {
                        System.out.println("Professor "+ProName+" Added Successfully!");
                        System.out.println("Professor Id: "+ProfessiorIDs++);
                    }
                    else {
                        System.out.println("Professor Not Added!");
                    }
                    break;

                case 3:
                    sc.nextLine();
                    System.out.print("Enter Course Name: ");
                    String CourseName = sc.nextLine();
                    System.out.print("Enter Course Credit: ");
                    int CourseCredit = sc.nextInt();
                    System.out.print("Enter Professor Id To Assign: ");
                    int ProAssignId = sc.nextInt();
                    if (clg.AddCourse(CourseIDs,CourseName,CourseCredit,ProAssignId)) {
                        System.out.println(CourseName+" Course Added Successfully!");
                        System.out.println(CourseName+" Course Id: "+CourseIDs++);
                    }
                    else {
                        System.out.println("Course Not Added!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Student ID: ");
                    int studentID = sc.nextInt();
                    System.out.print("Enter Course ID: ");
                    int courseID = sc.nextInt();
                    if (clg.EnrollCourses(studentID,courseID)) {
                        System.out.println("Student Enrolled In Course");
                    }
                    else {
                        System.out.println("Check Your ID's Again!");
                    }
                    break;

                case 5:
                    System.out.print("Enter Student Id: ");
                    int studentId = sc.nextInt();
                    Student info = clg.viewStudents(studentId);
                    if (info != null) {
                        showStudent(info);
                    }
                    else {
                        System.out.println("Check Your Info Again!");
                    }
                    break;

                case 6:
                    System.out.println("Courses Information!");
                    Courses [] allCourse = clg.getAllCourse();
                    for (int i=0;i< allCourse.length;i++) {
                        if (allCourse[i] != null) {
                            showCourse(allCourse[i]);
                        }
                    }
                    break;

                case 7:
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    System.out.println("Enter Fees To Be Paid: ");
                    int pay = sc.nextInt();
                    Student st = clg.payFeesOfStudent(id);
                    if (st != null) {
                        System.out.println("Paid Fees: " + pay);
                        st.setFees(pay);
                        showBalance(st);
                    }
                    else {
                        System.out.println("Invalid!");
                    }
                    break;

                case 8:
                    System.out.println("Thank You Bye");
                    isRun = false;
                    break;
            }
        }
    }
}
