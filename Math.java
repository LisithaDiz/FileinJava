import java.io.IOException;
import java.util.Scanner;
import  java.io.FileWriter;
public class Math {
      private double a,b,c,d,e,f,g,h;
      public double avgM(double quiz1, double quiz2, double quiz3, double quiz4, double quiz5, double test1, double test2, double finalExam){
            double quiz=(quiz1+quiz2+quiz3+quiz4+quiz5)/500*15;
            double test_1=test1/100*30;
            double test_2=test2/100*20;
            double final_E=finalExam/100*35;
            double avg=quiz+test_1+test_2+final_E;
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
      public void mathFinal() throws IOException {
            Scanner in = new Scanner(System.in);
            a=in.nextDouble();
            b=in.nextDouble();
            c=in.nextDouble();
            d=in.nextDouble();
            e=in.nextDouble();
            f=in.nextDouble();
            g=in.nextDouble();
            h=in.nextDouble();
            Math objM=new Math();
            double avgMM=objM.avgM(a,b,c,d,e,f,g,h);
            String gradeMM =objM.grade(avgMM);
            FileWriter myFile = new FileWriter("GradeAverage.txt");
            String line=h+avgMM+gradeMM;
            myFile.write(line);
      }
}
