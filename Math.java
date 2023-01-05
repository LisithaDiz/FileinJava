import java.util.Scanner;
public class Math {
      private double  quiz1, quiz2, quiz3, quiz4, quiz5, test1, test2, finalExam ;
      public double avgM(){
            double quiz=(quiz1+quiz2+quiz3+quiz4+quiz5)/500*15;
            double test_1=test1/100*30;
            double test_2=test2/100*20;
            double final_E=finalExam/100*35;
            double avg=quiz+test_1+test_2+final_E;
            return avg;
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
      public void mathMarks() {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter marks (quiz_1 quiz_2 quiz_3 quiz_4 quiz_5 test_1 test_2 final_Exam) ");
            quiz1=in.nextDouble();
            quiz2=in.nextDouble();
            quiz3=in.nextDouble();
            quiz4=in.nextDouble();
            quiz5=in.nextDouble();
            test1=in.nextDouble();
            test2=in.nextDouble();
            finalExam=in.nextDouble();

      }
}
