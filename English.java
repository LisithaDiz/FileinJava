import java.io.IOException;
import java.util.Scanner;
import  java.io.FileWriter;
public class English {
    private double a,b,c;
    public double avgE(double termPaper, double midterm, double finalExam){
        double termPaper_1=termPaper/100*30;
        double midterm_1=midterm/100*30;
        double final_E=finalExam/100*30;
        double avg=termPaper_1+midterm_1+final_E;
        return avg;
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


    public void engFinal() throws IOException {
        Scanner in = new Scanner(System.in);
        a=in.nextDouble();
        b=in.nextDouble();
        c=in.nextDouble();

        English objE=new English();
        double avgEE=objE.avgE(a,b,c);
        String gradeEE =objE.grade(avgEE);
        FileWriter myFile = new FileWriter("GradeAverage.txt");
        String line=c+avgEE+gradeEE;
        myFile.write(line);

    }

}
