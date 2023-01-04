import java.io.IOException;
import java.util.Scanner;
import  java.io.FileWriter;
public class Science {
    private double a,b,c,d;

    public double avgS(double attendance, double project, double midterm, double finalExam){
        double attendance_1=attendance/100*10;
        double project_1=project/100*30;
        double midterm_1=midterm/100*30;
        double final_E=finalExam/100*30;
        double avg=attendance_1+project_1+midterm_1+final_E;
       return  avg;
    }
    public  String name(String firstName, String lastName){
        String fullName=firstName+" "+ lastName.replace(',',' ');
        return fullName;
    }
    public String grade(double avg){
        String gradeABC;
        if (avg>=90){
            gradeABC="A";
        }else if(avg>=80){
            gradeABC="B";
        }else if(avg>=70){
            gradeABC="C";
        }else if(avg>=60){
            gradeABC="D";
        }else {
            gradeABC="F";
        }
        return gradeABC;
    }
    public void sciFinal() throws IOException {
        Scanner in = new Scanner(System.in);
        a=in.nextDouble();
        b=in.nextDouble();
        c=in.nextDouble();
        d=in.nextDouble();

        Science objS=new Science();
        double avgSS=objS.avgS(a,b,c,d);
        String gradeSS =objS.grade(avgSS);
        FileWriter myFile = new FileWriter("GradeAverage.txt");
        String line=d+avgSS+gradeSS;
        myFile.write(line);

    }
}
