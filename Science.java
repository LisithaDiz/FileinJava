import java.util.Scanner;
public class Science {
    private double attendance,project,midterm,finalExam;

    public double avgS(){
        double attendance_1=attendance/100*10;
        double project_1=project/100*30;
        double midterm_1=midterm/100*30;
        double final_E=finalExam/100*30;
        double avg=attendance_1+project_1+midterm_1+final_E;
       return  avg;
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




    public double getFinalEx(){
        return this.finalExam;
    }
    public  String name(String firstName, String lastName){
        String fullName=firstName+" "+ lastName.replace(',',' ');
        return fullName;
    }

    public void sciMarks()   {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter marks ( attendance   project   midterm   final_Exam) ");
        attendance=in.nextDouble();
        project=in.nextDouble();
        midterm=in.nextDouble();
        finalExam=in.nextDouble();
    }
}
