package Vjezba_5;

import java.util.Scanner;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Student {
    protected Date enrolmentDate;
    protected String name;
    protected int idStudent;
    protected int cntStudents;
    protected Scanner sc = new Scanner(System.in);

    private DateFormat df = new SimpleDateFormat("dd-MM-yyyy");

    public Student(String name, int idStudent) {
    }
// ...

    protected void setEnrollmentDate() throws ParseException {
        System.out.println("Please enter enrollment data in the format dd-MM-yyy");
        String date = sc.nextLine();
        this.enrolmentDate = df.parse(date);
    }

    public void setScanner(Scanner sc){
        this.sc = sc;
    }

    protected void infoStudent(){
        System.out.println("Student: " + this.name + " - id: " + this.idStudent);
        System.out.println("Student enrolment date - " + enrolmentDate.toString());
    }


    protected abstract void infoStud();

    public abstract boolean completeStudy(int value);
}
