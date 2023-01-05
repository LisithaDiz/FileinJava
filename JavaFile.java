import java.text.DecimalFormat;
import java.util.Scanner;
import  java.io.FileWriter;
import  java.util.ArrayList;
public class JavaFile {
    private static String l_name;
    private static String f_name;
    public static void main(String[] args) {
        boolean M=false;
        boolean S=false;
        boolean E=false;
        String line;
        int mSize, sSize, eSize;
        int i=0, j=0, k=0;
        DecimalFormat df = new DecimalFormat("##.##");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of students ");
        int numOfStudents=in.nextInt();

        Math mathObj=new Math();
        ArrayList<Double> mathFinal=new ArrayList<Double>();
        ArrayList<String> mathNam= new ArrayList<String>();
        ArrayList<String> mathGrade=new ArrayList<String>();
        ArrayList<Double> mathAvg=new ArrayList<Double>();


        Science sciObj=new Science();
        ArrayList<Double> sciFinal=new ArrayList<Double>();
        ArrayList<String> sciNam= new ArrayList<String>();
        ArrayList<String> sciGrade=new ArrayList<String>();
        ArrayList<Double> sciAvg=new ArrayList<Double>();

        English engObj=new English();
        ArrayList<Double> engFinal=new ArrayList<Double>();
        ArrayList<String> engNam= new ArrayList<String>();
        ArrayList<String> engGrade=new ArrayList<String>();
        ArrayList<Double> engAvg=new ArrayList<Double>();


            while (numOfStudents>0){
                --numOfStudents;
                System.out.println("Enter lastName, firstName ");
                 l_name=in.next();
                 f_name=in.next();
                System.out.println("Enter the subject of student (“English”, “Science”, or “Math”) ");
                String subject = in.next();
                switch (subject){
                    case "Math":
                        M=true;
                        mathObj.mathMarks();

                        mathNam.add(mathObj.name(f_name,l_name));
                        mathFinal.add(mathObj.getFinalEx());
                        mathAvg.add(mathObj.avgM());
                        mathGrade.add(mathObj.grade(mathObj.getFinalEx()));
                        break;

                    case "Science":
                        S=true;
                        sciObj.sciMarks();

                        sciNam.add(sciObj.name(f_name,l_name));
                        sciFinal.add(sciObj.getFinalEx());
                        sciAvg.add(sciObj.avgS());
                        sciGrade.add(sciObj.grade(sciObj.avgS()));
                        break;

                    case "English":
                        E=true;
                        engObj.engMarks();

                        engNam.add(engObj.name(f_name,l_name));
                        engFinal.add(engObj.getFinalEx());
                        engAvg.add(engObj.avgE());
                        engGrade.add(engObj.grade(engObj.avgE()));
                        break;

                }
            }

        try {
            FileWriter myFile = new FileWriter("GradeAverage.txt");
            myFile.write("Student Performance Summary");
            myFile.write("\n___________________________");
            myFile.write("\n");
            myFile.write("Student Name                                              Final Exam            Final Average            Grade");
            myFile.write("\n________________________________________________________________________________________________________________");

                if (M){
                    myFile.write("\nMATH\n");
                    mSize=mathNam.size();
                    while (mSize>0){
                        --mSize;
                        line=String.format("| %-55s |%-19s |%-24s|%-24s%n",mathNam.get(i),df.format(mathFinal.get(i)),df.format(mathAvg.get(i)),mathGrade.get(i));
                        myFile.write(line);
                        i++;
                    }
                }else {
                }

                i=0;
                if (S){
                    myFile.write("\nSCIENCE\n");
                    sSize=sciNam.size();
                    while (sSize>0){
                        --sSize;
                        myFile.write(sciNam.get(i)+"     "+ sciFinal.get(i)+"        "+df.format(sciAvg.get(i))+"      "+sciGrade.get(i)+"\n");
                        i++;
                    }

                }else {
                }


                i=0;
                if (E){
                    myFile.write("\nENGLISH\n");
                    eSize=engNam.size();
                    while (eSize>0){
                       --eSize;
                        myFile.write(engNam.get(i)+"     "+ engFinal.get(i)+"        "+df.format(engAvg.get(i))+"      "+engGrade.get(i)+"\n");
                        i++;
                    }
                }else {
                }

            myFile.close();
        }catch (Exception ee){
            System.out.println(ee);
            ee.fillInStackTrace();
        }
    }
}
