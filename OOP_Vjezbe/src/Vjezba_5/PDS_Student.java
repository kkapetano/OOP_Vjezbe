package Vjezba_5;


public class PDS_Student extends Student {

    public PDS_Student(String name,int idStudent) {
        super(name,idStudent);
    }

    protected void infoStud() {
        System.out.println("Student: " + name + ", preddiplomski studij");
    }
    @Override
    public boolean completeStudy(int value) {
        if (value < 3) {
            System.out.println("Nije upisana posljednja godina studija.");
            return false;
        }
        return true;
    }


    protected  void completedStudy(int i) {
        if (completeStudy(i)) {
            System.out.println("Student " + name + " has completed the study.");
        } else {
            System.out.println("Student " + name + " has not completed the study.");
        }
    }
}
