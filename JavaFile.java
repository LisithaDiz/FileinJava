import java.text.DecimalFormat;
import java.util.Scanner;
import  java.io.FileWriter;
import  java.util.ArrayList;
public class JavaFile {
    private static String l_name;
    private static String f_name;
    public static void main(String[] args) {
        boolean M=false,S=false, E=false;
        String line;
        int mSize, sSize, eSize;
        int i=0, j=0, k=0;
        int A=0,B=0,C=0,D=0,F=0;

        DecimalFormat df = new DecimalFormat("##.##");

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the file name ");
        String nameOfFile=in.nextLine();

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
                default:
                    System.out.println("Subject you enter is Wrong run the Programme again !!!");
                    break;

            }
        }

        try {
            FileWriter myFile = new FileWriter(nameOfFile+".txt");
            myFile.write("Student Performance Summary");
            myFile.write("\n___________________________");
            myFile.write("\n");
            myFile.write("Student Name                                              Final Exam            Final Average             Grade");
            myFile.write("\n________________________________________________________________________________________________________________");

            if (M){
                myFile.write("\nMATH\n");
                mSize=mathNam.size();
                while (mSize>0){
                    --mSize;
                    if(mathGrade.get(i)=="A"){
                        A++;
                    }else if(mathGrade.get(i)=="B"){
                        B++;
                    }else if(mathGrade.get(i)=="C"){
                        C++;
                    }else if(mathGrade.get(i)=="D"){
                        D++;
                    } else {
                        F++;
                    }
                    line=String.format("%-57s |%-21s|%-25s|%-24s%n",mathNam.get(i),df.format(mathFinal.get(i)),df.format(mathAvg.get(i)),mathGrade.get(i));
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
                    if(sciGrade.get(i)=="A"){
                        A++;
                    }else if(sciGrade.get(i)=="B"){
                        B++;
                    }else if(sciGrade.get(i)=="C"){
                        C++;
                    }else if(sciGrade.get(i)=="D"){
                        D++;
                    } else {
                        F++;
                    }
                    line=String.format("%-57s |%-21s|%-25s|%-24s%n",sciNam.get(i),df.format(sciFinal.get(i)),df.format(sciAvg.get(i)),sciGrade.get(i));
                    myFile.write(line);
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
                    if(engGrade.get(i)=="A"){
                        A++;
                    }else if(engGrade.get(i)=="B"){
                        B++;
                    }else if(engGrade.get(i)=="C"){
                        C++;
                    }else if(engGrade.get(i)=="D"){
                        D++;
                    } else {
                        F++;
                    }
                    line=String.format("%-57s |%-21s|%-25s|%-24s%n",engNam.get(i),df.format(engFinal.get(i)),df.format(engAvg.get(i)),engGrade.get(i));
                    myFile.write(line);
                    i++;
                }
            }else {
            }
            myFile.write("\nGrade Distribution \n");
            myFile.write("================== \n");
            myFile.write("A----------"+A+"\n");
            myFile.write("B----------"+B+"\n");
            myFile.write("C----------"+C+"\n");
            myFile.write("D----------"+D+"\n");
            myFile.write("F----------"+F+"\n");

            myFile.close();
        }catch (Exception ee){
            System.out.println(ee);
            ee.fillInStackTrace();
        }
    }

}
