import java.util.Scanner;
import  java.io.FileWriter;
public class JavaFile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numOfStudents=in.nextInt();
        Math mathObj=new Math();
        Science sciObj=new Science();
        English engObj=new English();
        try {
                        while (numOfStudents>0){
                            --numOfStudents;
                            String l_name=in.next();
                            String f_name=in.next();
                            String subject = in.next();
                            FileWriter myFile = new FileWriter("GradeAverage.txt");
                            myFile.write("Student Performance Summary");
                            myFile.write("\n___________________________");
                            myFile.write("\n");
                            myFile.write("Student Name                                              Final Exam            Final Average            Grade    ");
                            myFile.write("\n________________________________________________________________________________________________________________");

                            switch (subject){
                                case "Math":
                                    mathObj.name(l_name,f_name);
                                    mathObj.mathFinal();
                                    break;
                                case "Science":
                                    sciObj.name(l_name,f_name);
                                    sciObj.sciFinal();
                                    break;
                                case "English":
                                    engObj.name(l_name,f_name);
                                    engObj.engFinal();
                                    break;
                            }
                            myFile.close();
                        }
                    }catch (Exception ee){
                        System.out.println(ee);
                        ee.fillInStackTrace();
                    }
    }
}
