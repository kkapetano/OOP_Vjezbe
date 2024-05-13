package Vjezba_5;
import java.text.ParseException;
import java.util.Scanner;

public class Client {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws ParseException {
        PDS_Student student1 = new PDS_Student("Name-1-PDS", 1);
        DS_Student student2 = new DS_Student("Name-2-DS",2);
        student1.setScanner(sc);
        student1.setEnrollmentDate();
        student1.completedStudy(3);
        student1.infoStudent();
        // Realizirajte i kod za DS_Studenta

}
}
