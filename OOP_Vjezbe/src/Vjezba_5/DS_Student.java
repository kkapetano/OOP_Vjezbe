package Vjezba_5;

public class DS_Student extends Student {


    public DS_Student(String name, int idStudent) {
        super(name, idStudent);
    }

    @Override
    protected void infoStud() {
        System.out.println("Student: " + name + ", diplomski studij");
    }

    public void completedStudy(int i) {
        if (completeStudy(i)) {
            System.out.println("Student " + name + " has completed the study.");
        } else {
            System.out.println("Student " + name + " has not completed the study.");
        }
    }

    @Override
    public boolean completeStudy(int value) {
        if (value < 2) {
            System.out.println("Nije upisana posljednja godina studija.");
            return false;
        }
        return true;
    }
}

